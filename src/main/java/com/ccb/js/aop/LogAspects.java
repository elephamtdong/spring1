package com.ccb.js.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.ccb.js.aop.MathCalculation.*(..))")
    public void pointCut(){};

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("Starting running..."+joinPoint.getSignature().getName()+"  args is:"+ Arrays.asList(args));
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println("Ending running..."+joinPoint.getSignature().getName());
    }

    @AfterReturning(value="pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result){
        System.out.println("func returning..."+result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logThrow(JoinPoint joinPoint, Exception exception){
        System.out.println("func throw excepion..."+exception);
    }
}
