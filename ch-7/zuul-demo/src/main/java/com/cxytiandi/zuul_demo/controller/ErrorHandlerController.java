package com.cxytiandi.zuul_demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import com.cxytiandi.zuul_demo.base.ResponseCode;
import com.cxytiandi.zuul_demo.base.ResponseData;

/**
 * 异常时返回统一的格式
 *
 * 和SpringBoot 统一异常处理不同
 *
 * @ControllerAdvice 注解主要用来针对 Controller 中的方法做处理，作用于
 * @RequestMapping 标注的方法上，只对我们定义的接口异常有效，对 Zuul 中是无效的。
 */
@RestController
public class ErrorHandlerController implements ErrorController {

	@Autowired
	private ErrorAttributes errorAttributes;

	@Override
	public String getErrorPath() {
		return "/error";
	}

	@RequestMapping("/error")
	public ResponseData error(HttpServletRequest request) {
		Map<String, Object> errorAttributes = getErrorAttributes(request);
		String message = (String) errorAttributes.get("message");
		String trace = (String) errorAttributes.get("trace");
		if (StringUtils.isNotBlank(trace)) {
			message += String.format(" and trace %s", trace);
		}
		return ResponseData.fail(message, ResponseCode.SERVER_ERROR_CODE.getCode());
	}

	private Map<String, Object> getErrorAttributes(HttpServletRequest request) {
		return errorAttributes.getErrorAttributes(new ServletWebRequest(request), true);
	}

}
