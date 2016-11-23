#include <jni.h>
#include <string>

extern "C"{

jstring Java_com_ndk_app_BaseJNI_stringFromJNI(
        JNIEnv* env ,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

/**
 * 获取字符串长度
 */
jint Java_com_ndk_app_BaseJNI_getStringSize(
        JNIEnv *env , jobject  ,jstring  jstring1
){
    return env->GetStringLength( jstring1 ) ;
}



}