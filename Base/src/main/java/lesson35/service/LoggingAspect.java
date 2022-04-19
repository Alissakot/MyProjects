package lesson35.service;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    //@Before("execution(* lesson35.service.CityServiceImpl.getById(..))")
    @Before("@annotation(org.aspectj.lang.annotation.Pointcut)")
    public void logBefore(JoinPoint joinPoint) {
        log.info("Прокси : " + joinPoint.getThis().getClass().getName());
        log.info("Класс : " + joinPoint.getTarget().getClass().getName());
        log.info("Вызов метода : " + joinPoint.getSignature().getName());
        log.info("Аргументы метода : " + Arrays.stream(joinPoint.getArgs())
                .map(Objects::toString)
                .collect(Collectors.joining(", ")));
    }
}