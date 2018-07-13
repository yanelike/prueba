package com.administration.phones.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestHeader;

import com.administration.phones.entity.AspectPhone;
import com.administration.phones.exceptions.UnauthorizedException;

 
 

@Aspect
@Component
public class AspectBusiness {
	
	private static final Logger logger = Logger.getLogger(AspectBusiness.class.getName());
	private static final String VALUE_HASH = "SUPERWALLET";
	private static final String VALUE_ERROR = "DATA not match";
	
//	@Before("execution(* mx.com.test.controller.*.*(..)) && @annotation(spanAnnotation)")
//	public void before(final JoinPoint joinPoint, AspectPhone spanAnnotation, @RequestHeader String DATA) throws Exception {
//        
//        Signature signature = joinPoint.getSignature();
//        MethodSignature mSignature = (MethodSignature) signature;
//        logger.info("-->RegistryAspect" + mSignature.getName());
//        
//        if(DATA == null || "".equalsIgnoreCase(""))
//        	new UnauthorizedException();
//        
//        if(!DATA.equalsIgnoreCase(DigestUtils.sha256Hex(VALUE_HASH)))
//        	new UnauthorizedException(VALUE_ERROR);
//	}
}
	