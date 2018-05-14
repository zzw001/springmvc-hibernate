package com.imweiwei.ssh.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserLogging {

	@Before("execution(public void com.imwewei.ssh.service.UserService.user_add(..))")
	public void beforeAdd(JoinPoint joinPoint) {
		System.out.println("start user add");
	}
}
