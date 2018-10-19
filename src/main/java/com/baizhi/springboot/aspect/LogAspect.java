package com.baizhi.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

//把当前类设置为配置类
@Configuration
//声明这个类为切面类
@Aspect
public class LogAspect {
    //@annotation（自定义注解）表示用注解标识的方法做增强
//    切点
    @Pointcut(value = "@annotation(LogAnnotation)")
    public void pt() {
        System.out.println("先到这+++++++++++++++");
    }

    //    环绕增强
    @Around(value = "pt()")
    public Object ss(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("进来。。。。。。。。。。。。。。。。。");
        Object proceed = null;
        try {
            proceed = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("出去，，，，，，，，，，，，，，，，，，，，， ");
        return proceed;
    }
}
