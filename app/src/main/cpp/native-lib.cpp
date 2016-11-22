#include <jni.h>
#include <string>

extern "C"{

jstring Java_com_ndk_app_BaseJNI_stringFromJNI(
        JNIEnv* env ,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

jstring Java_com_ndk_app_BaseJNI_stringFromJNI2(
        JNIEnv* env, jobject ) {
    std::string hello = "Hello from C++22";
    return env->NewStringUTF(hello.c_str());
}

jstring Java_com_ndk_app_BaseJNI_stringFromJNI3(
        JNIEnv *env, jobject obj
){
    std::string hello = "123";

    return env->NewStringUTF(hello.c_str());
}

}