package aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UserAspect {

    @Before(value = "execution(* pojo.User.User(..))")
    public void userBefore()
    {
        System.out.println("construct user...");
    }

    @AfterReturning(value = "execution(* pojo.User.User(..))")
    public void userAfter()
    {
        System.out.println("after construct user...");
    }

    @Before(value = "execution(* pojo.User.set*(..))")
    public void setBefore()
    {
        System.out.println("setBefore...");
    }

    @AfterReturning(pointcut = "execution(* pojo.User.set*(..))")
    public void setAfter()
    {
        System.out.println("setAfterReturning...");
    }
}
