package ua.home.aspects;

import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xnx_ on 15.02.2017.
 */
@Aspect
public class BeforeLogServiceMetgodAspects {

    @Autowired
    private Logger logger;

    @Before("execution( * ua.home.service.ServiceImpl.*(..))")
    public void logBeforeMethodSelect(JoinPoint joinPoint){
        logger.info("beffore method select "+joinPoint.getSignature().getName());
    }

    @Before("execution( * ua.home.service.ServiceImpl.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint){
        logger.info("beffore method "+joinPoint.getSignature().getName());
    }

    @After(" execution(* ua.home.service.Service.*(..))")
    public void logAfterMethod(JoinPoint joinPoint){
        logger.info("after method"+joinPoint.getSignature().getName());
    }

    @AfterThrowing(" execution(* ua.home.service.Service.*(..))")
    public void exLog(){
        logger.error("error!");
    }


}
