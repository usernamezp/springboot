package com.baizhi.springboot.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//声明使用的位置（METHOD 方法   就是说只用来标注方法）
@Target(ElementType.METHOD)
//@Retention 让这个注解生效  （RUNTIME 运行时    表示只有在运行时才会生效）
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation {
//    声明注解的属性（注解的属性就像接口的方法一样）
    String name();
}
