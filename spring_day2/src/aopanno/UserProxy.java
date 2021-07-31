package aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 * @author zhazhahui
 * @create 2021-07-24 14:05
 */

@Component
@Aspect
public class UserProxy {


    //相同切入点抽取
    @Pointcut(value = "execution(* aopanno.User.print(..))")
    public void point(){

    }
    @Before(value = "point()")
    public void before() {
        System.out.println("before");
    }


    @After(value = "point()")
    public void after(){
        System.out.println("after");
    }

    @AfterReturning(value = "point()")
    public void AfterReturning(){
        System.out.println("AfterReturning");
    }

    @AfterThrowing(value = "point()")
    public void AfterThrowing(){
        System.out.println("AfterThrowing");
    }
    @Around(value = "point()")
    public void Around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Around1");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Around2");
    }


}
