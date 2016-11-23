#include <jni.h>
#include <string.h>
#include <stdio.h>

extern "C" {

/**
 * 从java 类中获取属性的值
 */
 jstring Java_om_app1_NativeUitl_getStringFromJava(
        JNIEnv *env, jobject object ) {
    // 得到jclass
    jclass jcls = env->GetObjectClass( object ) ;

    // 得到字段ID
    jfieldID jfID = env->GetFieldID( jcls , "name" , "Ljava/lang/String;" );

    // 得到字段的值
    jstring jstring1 = (jstring) env->GetObjectField(object , jfID  );

    return jstring1 ;
}

/**
 * 改写Java类中属性值
 */
 jstring Java_om_app1_NativeUitl_setStringFromJava(
        JNIEnv *env, jobject object ) {

    // 得到jclass
    jclass jcls = env->GetObjectClass( object ) ;

    // 得到字段ID
    jfieldID jfID = env->GetFieldID( jcls , "name" , "Ljava/lang/String;" );

    // 得到字段的值
    jstring s1 = (jstring) env->GetObjectField(object , jfID  );

    // 将jstring类型转换成字符指针
    char * cstr = (char *) env->GetStringUTFChars( s1  , JNI_FALSE );

    //定义需要改写的值
    char text[30] = "1234";

    //字符串拼接，在text的后面拼接 cstr 数组。拼接的结果放在 text数组中
    strcat(text, cstr);

    jstring s2 = env->NewStringUTF( text ) ;

    //给Java类中的字段赋值
    env->SetObjectField( object , jfID , s2 ) ;

    return s2 ;
}

/**
* 改写Java类中属性值
*/
 void Java_om_app1_NativeUitl_getMethodFromJava(
        JNIEnv *env, jobject object ) {

    // 得到jclass
    jclass jcls = env->GetObjectClass( object ) ;

    // 得到方法ID
    jmethodID jmtdId = env->GetMethodID( jcls , "run", "(I)I");

    //执行方法
    env->CallCharMethod( object , jmtdId  ) ;

}


}
