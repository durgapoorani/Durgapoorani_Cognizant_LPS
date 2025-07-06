package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[LOG] Starting: " + joinPoint.getSignature().getName());

        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // run the actual method
        long end = System.currentTimeMillis();

        System.out.println("[LOG] Completed: " + joinPoint.getSignature().getName()
                + " in " + (end - start) + "ms");

        return result;
    }
}
