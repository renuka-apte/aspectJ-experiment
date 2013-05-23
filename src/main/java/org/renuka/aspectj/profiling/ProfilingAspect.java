package org.renuka.aspectj.profiling;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProfilingAspect {

  @Pointcut("execution(* org.renuka.aspectj.profiling.*.*(..))")
  protected void profile(){
    }

  @Around("profile()")
  public void aroundProfileMethods(final ProceedingJoinPoint thisJoinPoint) throws Throwable {
    final long start, end;
    start = System.nanoTime();
    thisJoinPoint.proceed();
    end = System.nanoTime();
    System.out.print("Time taken by : " +  thisJoinPoint.getSignature().toLongString() + " = ");
    System.out.print((end - start) / 1000);
    System.out.println("us");
  }

}
