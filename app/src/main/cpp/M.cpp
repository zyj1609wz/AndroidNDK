//
// Created by yiba8 on 2016/11/22.
//

#include "M.h"

// 定义一个结构体
// 一个结构体相当于一个java中的类 ， 结构体中只有声明 ， 函数没有实现 ， 属性也不能初始化 ， 一般定义在头文件中
struct Person{
    char name ;
    char id ;
};

struct News {
    // 使用字符数组 ， 在赋值的时候和字符指针略有不同
    char title[128];
    char* content;
};
