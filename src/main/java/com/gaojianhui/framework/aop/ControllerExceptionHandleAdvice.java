package com.gaojianhui.framework.aop;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaojianhui.framework.model.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.gaojianhui.framework.exception.BusinessException;

@RestControllerAdvice
public class ControllerExceptionHandleAdvice {
	private final static Logger logger = LoggerFactory.getLogger(ControllerExceptionHandleAdvice.class);
	@ExceptionHandler
	@ResponseBody
    public ResultEntity handler(HttpServletRequest req, HttpServletResponse res, Exception e) {
		logger.info("Restful Http请求发生异常...");
        if (res.getStatus() == HttpStatus.BAD_REQUEST.value()) {
            logger.info("修改返回状态值为200");
            res.setStatus(HttpStatus.OK.value());
        }
        if (e instanceof BusinessException) {
            logger.error("代码00：" + e.getMessage(), e);
            res.setStatus(HttpStatus.OK.value());
            return ResultEntity.fail(e.getMessage());
        } 
        if (e instanceof NullPointerException) {
            logger.error("00：" + e.getMessage(), e);
            return ResultEntity.fail("发生空指针异常");
        } else if (e instanceof IllegalArgumentException) {
            logger.error("01：" + e.getMessage(), e);
            return ResultEntity.fail("请求参数类型不匹配");
        } else if (e instanceof SQLException) {
            logger.error("02：" + e.getMessage(), e);
            return ResultEntity.fail("数据库访问异常");
        }  else if (e instanceof BadCredentialsException) {
            logger.error("03：" + e.getMessage(), e);
            res.setStatus(HttpStatus.OK.value());
            ResultEntity result =  ResultEntity.fail("用户名密码错误");
            result.setCode("03");
            return result;
        } else if (e instanceof InternalAuthenticationServiceException) {
            logger.error("03：" + e.getMessage(), e);
            res.setStatus(HttpStatus.OK.value());
            ResultEntity result =  ResultEntity.fail("该账号不存在");
            result.setCode("03");
            return result;
        }else if (e instanceof DisabledException) {
            logger.error("03：" + e.getMessage(), e);
            res.setStatus(HttpStatus.OK.value());
            ResultEntity result =  ResultEntity.fail("该账号不能使用");
            result.setCode("03");
            return result;
        }
        else {
            logger.error("代码99：" + e.getMessage(), e);
            return ResultEntity.fail("服务器代码发生异常,请联系管理员");
        }
    }
}
