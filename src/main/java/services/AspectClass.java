package services;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 03.01.13
 * Time: 15:59
 */
@Aspect
public class AspectClass {

    @Pointcut("execution(* services.WorkerService.getWorkersNames())")
    public void pointcut(){
    }

    @Before(value = "pointcut()")
    public void beforeGet(){
        String a="sadfas";
        a+=3;
    }
}
