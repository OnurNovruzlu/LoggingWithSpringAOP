package az.coftea.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppPointcuts {

    @Pointcut("within(@org.springframework.stereotype.Controller *)")
    public void controllerPointcut(){
    }
    @Pointcut("within(@org.springframework.stereotype.Service *)")
    public void servicePointcut(){
    }
    @Pointcut("within(@org.springframework.stereotype.Repository *)")
    public void repositoryPointcut(){
    }

    @Pointcut("execution(* az.coftea..*(..))")
    public void appPointcut(){
    }

    @Pointcut("appPointcut () && (controllerPointcut() || servicePointcut() || repositoryPointcut())")
    public void mainPointcut(){
    }

    @Pointcut("execution(* az.coftea.controller.TodoController.getDelete(..))")
    public void delete(){
    }

}
