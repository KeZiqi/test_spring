package aspect.service;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@Aspect
public class UserServiceAsp {

    @Before(value = "execution(* service.*.*(..))")
    public void beforeMethod()
    {
        System.err.println("service before...");
    }

    @AfterReturning(value = "execution(* service.*.*(..))")
    public void afterMethod()
    {
        System.err.println("service after...");

    }
}
