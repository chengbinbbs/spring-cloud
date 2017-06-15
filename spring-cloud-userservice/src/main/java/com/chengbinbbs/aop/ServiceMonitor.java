package com.chengbinbbs.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.stereotype.Component;

/**
 * 统计方法调用次数
 *
 * @author zhangcb
 * @created 2017-06-06 10:53.
 */
@Aspect
@Component
public class ServiceMonitor {
    @Autowired
    private CounterService counterService;      //统计每个接口调用次数
    @Autowired
    private GaugeService gaugeService;          //统计每个接口调用时长

    @Before("execution(* com.chengbinbbs.controller.*.*(..))")
    public void countServiceInvoke(JoinPoint joinPoint) {
        counterService.increment(joinPoint.getSignature() + "");
    }

    @Around("execution(* com.chengbinbbs.controller.*.*(..))")
    public void latencyService(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        pjp.proceed();
        long end = System.currentTimeMillis();
        gaugeService.submit(pjp.getSignature().toString(), end - start);
    }
}
