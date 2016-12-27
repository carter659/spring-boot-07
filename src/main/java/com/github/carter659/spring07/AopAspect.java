package com.github.carter659.spring07;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 博客出处：http://www.cnblogs.com/GoodHelper/
 * @author 刘冬
 *
 */
@Component
@Aspect
public class AopAspect {

	@Around("execution (java.util.Map com.github.carter659.spring07.MainController.*( .. ) ) ")
	public Object invoke(ProceedingJoinPoint point) {
		Map<String, Object> map = null;
		try {
			Object[] args = point.getArgs();
			Object val = point.proceed(args);
			map = (Map<String, Object>) val;
		} catch (Throwable e) {
			e.printStackTrace();
			map = new HashMap<>();
			map.put("msg", e.toString());
		}
		map.put("aop", "拦截了一个请求");
		return map;
	}
}
