package org.koushik.javabrains.aspect;

import javax.sql.rowset.Joinable;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.koushik.javabrains.model.Circle;

@Aspect
public class LoggingAspect {
     /*
	@Before(value = "execution(public String org.koushik.javabrains.model.Circle.getName())")
	public void loggingAdvice()
	{
		System.out.println("Logging Advise class !");
	}
	
	@Before("allGetters()")  // referring to pointcut
	public void loggingSecAdvice()
	{
		System.out.println("Logging sec Advise !");
	}
	
    
//    @Pointcut("execution(* org.koushik.javabrains.model.*.get*(..))") this means any class inside the package
    
    @Pointcut("within(org.koushik.javabrains.model.Circle))") // for all the things inside the circle using the within
    public void allCircleMethods() {}; 

//    @Pointcut("within(org.koushik.javabrains.model.Circle..)") // for all subpackeges and classes
    
    @Before("allGetters()")
	public void loggingAdviceRevision(JoinPoint joinPoint)
	{
    	Circle circle = (Circle)joinPoint.getTarget();// getTarget will give the object of class on which the advice is called
		System.out.println("JoinPoint "+ joinPoint.toString()+ "\n"+joinPoint.getTarget());
	}
    @Before("args(name)")  // gives the info of all methods with string as paramete
	public void allSettersWithStringName(String name)
	{
		System.out.println("args(name)!"+ name);
	}

    
    @AfterReturning(pointcut="args(name)" ,returning="returnString" )  //  using pointcut inside the afterreturning allow us to handle the return parameter
	public void afterReturningTestMethod(String name, String returnString)
	{
		System.out.println("args(name)! for afterReturningTestMethod"+ returnString+ name);
	}
    
    @AfterThrowing(pointcut="args(name)", throwing="ex")  // using the throwing with pointcut inside the afterthrowing allows us to handle the exception
	public void afterThrowingTestMethod(String name, Exception ex)
	{
		System.out.println("args(name)! for afterReturningTestMethod"+ name);
	}

    */
	@Pointcut("execution(* get*(..))")// here .. means no parameters or more parameters inside 
    public void allGetters() {}; // this is dummy method

    @Around( "allGetters()")
	public void aroundAdiveTest(ProceedingJoinPoint preceedingJoinPoint) //preceedingJoinPoint required
	{
		try {
			System.out.println("Before");
			System.out.println("" + preceedingJoinPoint.proceed()); // in case the target method is returning object then need to handle 
			System.out.println("after");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}