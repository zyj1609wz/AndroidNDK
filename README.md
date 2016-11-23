# AndroidNDK
android ndk develop

## app项目
- 从JNI 获取字符串
```
jstring Java_com_ndk_app_BaseJNI_stringFromJNI(
        JNIEnv* env ,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
```

- 从JNI 获取字符串长度

```
/**
 * 获取字符串长度
 */
jint Java_com_ndk_app_BaseJNI_getStringSize(
        JNIEnv *env , jobject  ,jstring  jstring1
){
    return env->GetStringLength( jstring1 ) ;
}
```

- java 两个字符串拼接

```

/**
 * 连个字符串拼接
 */
jstring Java_com_ndk_app_BaseJNI_stringTostring(
        JNIEnv *env , jobject object , jstring s1 , jstring s2
){
    char * char1 = (char *) env->GetStringUTFChars(s1 , JNI_FALSE );
    char * char2 = (char *) env->GetStringUTFChars(s2 , JNI_FALSE );

    char text[30] = "";
    strcat( text , char1  ) ;
    strcat( text , char2  ) ;

    return env->NewStringUTF( text ) ;
}
```

## app1项目
- JNI从Java里面获取某属性的值，并且改写他的值
>我们访问修改了String类型的字段 ， 也基本上能看出访问字段的基本套路 ， 首先得到jclass , 再得到字段ID ， 继而得到字段的值 ， 进行类型转换 ， 最后将变化的值设置给Java字段 。由此可以推出 ， 访问其他类型的字段 ， 也是这样的套路 ， 只不过类型变了 ， 值得注意的是 ， java中的引用类型是需要进行类型转换的 。

## JNI 方法分析
```
/**
 * 从java 类中获取属性的值
 */
JNIEXPORT jstring JNICALL Java_om_app1_NativeUitl_getStringFromJava(
        JNIEnv *env, jobject object ) {
    // 得到jclass
    jclass jcls = env->GetObjectClass( object ) ;

    // 得到字段ID
    jfieldID jfID = env->GetFieldID( jcls , "name" , "Ljava/lang/String;" );

    // 得到字段的值
    jstring jstring1 = (jstring) env->GetObjectField(object , jfID  );

    return jstring1 ;
}
```

- JNIEXPORT : 在Jni编程中所有本地语言实现Jni接口的方法前面都有一个`JNIEXPORT`,这个可以看做是Jni的一个标志，至今为止没发现它有什么特殊的用处。在实际的编程过程中可以去掉
- jstring   ：返回值类型； 如果没有返回值，那么就是`void`
- JNICALL   : 这个可以理解为Jni 和Call两个部分，和起来的意思就是 Jni调用XXX（后面的XXX就是JAVA的方法名）。在实际开发过程中可以去掉
- Java_om_app1_NativeUitl_getStringFromJava : Java是固定写法，代表Java中的方法。`_om_app1_NativeUitl_` 代表完整包是：`om.app1` ， 类名是：`NativeUitl` ; `getStringFromJava` 代表方法名
 

