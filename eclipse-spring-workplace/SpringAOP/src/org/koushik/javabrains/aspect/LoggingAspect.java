package org.koushik.javabrains.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
     
	@Before(value = "execution(public String org.koushik.javabrains.model.Circle.getName())")
	public void loggingAdvice()
	{
		System.out.println("Logging Advise class !");
	}
	
	@Before("allGetters()")
	public void loggingSecAdvice()
	{
		System.out.println("Logging sec Advise !");
	}
	
    @Pointcut("execution(* get*())")
    public void allGetters() {}; 

    @Pointcut("within(org.koushik.javabrains.model.Circle)")
    public void allCircleMethods() {}; 
}
