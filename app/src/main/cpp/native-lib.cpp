#include <jni.h>
#include <string>
#include <syslog.h>


extern "C"
jstring
Java_com_ndk_app_BaseJNI_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    printf( "%s" , "hello" ) ;

    LOGV( "" , "" ) ;
    //创建一个jstring对象使用
    jstring jstring1 =  (*env).NewStringUTF( "hello world" ) ;

    return env->NewStringUTF(hello.c_str());
}


jstring Java_com_ndk_app_BaseJNI_stringFromJNI2(
        JNIEnv* env, jclass jclass1 ,jstring  ss) {
    std::string hello = "Hello from C++22";
    return env->NewStringUTF(hello.c_str());
}