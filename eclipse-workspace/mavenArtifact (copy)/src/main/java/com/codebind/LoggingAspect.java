package com.codebind;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;

@Aspect
public class LoggingAspect {
	
	 @Around("execution(* com.codebind.addCustomerAround(..))")
	   public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround() is running!");
		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
			
		System.out.println("Around before is running!");
		joinPoint.proceed(); //continue on the intercepted method
		System.out.println("Around after is running!");
			
		System.out.println("*****&&&&&&&&&&&&&&********************&&&&&&&&&&&&&&&*&&&&&&&**");

}
}
