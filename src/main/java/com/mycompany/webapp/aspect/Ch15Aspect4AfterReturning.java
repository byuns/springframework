package com.mycompany.webapp.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Component
@Aspect
@Log4j2
public class Ch15Aspect4AfterReturning {

	@AfterReturning(
		   pointcut="execution(public * com.mycompany.webapp.controller.Ch15Controller.afterReturning*(..))",
		   returning="returnValue" //실제 리턴된 값을 받을 변수
	)
	public void method(String returnValue) {
		log.info("실행");
		log.info("리턴 값 : " + returnValue);
	}
}
