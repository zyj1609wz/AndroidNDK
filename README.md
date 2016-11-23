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
- 从JNI 获取字符串长度