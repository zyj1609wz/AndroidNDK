#include <jni.h>
#include <string.h>
#include <stdio.h>

extern "C" {

/**
 * 从java 类中获取属性的值
 */
JNIEXPORT jstring JNICALL Java_om_app1_NativeUitl_getStringFromJava(
        JNIEnv *env, jobject object) {
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
JNIEXPORT jstring JNICALL Java_om_app1_NativeUitl_setStringFromJava(
        JNIEnv *env, jobject object) {

    // 从java 类中获取属性的值
    jstring js = Java_om_app1_NativeUitl_getStringFromJava( env , object ) ;

    // 将jstring类型转换成字符指针
    char * cstr = (char *) env->GetStringUTFChars(js , JNI_FALSE );

    //定义需要改写的值
    char text[30] = "";

    //字符串拼接，在text的后面拼接 cstr 数组。拼接的结果放在 text数组中
    //所以这里有一个坑，外部的字符串的大小是动态变化的，所以需要动态来定义text数组的长度。优化方案，详见setStringFromJava2方法
    strcat(text, cstr);

    return env->NewStringUTF( text )  ;
}

}
