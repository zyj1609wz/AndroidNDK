//
// Created by yiba8 on 2016/11/23.
//

#include "main.h"
#include <jni.h>
#include <string.h>
#include <string>

extern "C" {

jstring Java_om_app1_NativeUitl_getStringFromC(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
}
