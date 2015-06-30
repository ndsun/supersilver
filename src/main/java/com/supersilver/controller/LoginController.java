package com.supersilver.controller;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.supersilver.entity.TbUser;
import com.supersilver.service.TbUserServiceImpl;
import com.supersilver.utils.ServletUtils;


@Controller
public class  LoginController{
	
	@Resource
	TbUserServiceImpl tbUserServiceImpl;
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET) 
	public void handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1,ModelMap mm) throws Exception {
		boolean result = false;
		String reason = "";
		System.out.println("sssssssssss");
		String username= arg0.getParameter("username");
		String password = arg0.getParameter("password");
		String configpassword = arg0.getParameter("confirm_password");
		if(!configpassword.equals(password)) {
			mm.put("result", result);
			reason = "两次输入密码不一致";
			mm.put("reason", reason);
			ServletUtils.processReturn(arg0, arg1, mm);
			return;
		}
		TbUser tbuser = new TbUser();
		tbuser.setUserName(username);
		tbuser.setUserPassword(password);
		int changeCount = tbUserServiceImpl.insert(tbuser);
		System.out.println("更新行数为" + changeCount);
		if(changeCount > 0){
		 result = true;
		}else{
			reason = "插入失败";
		}
		mm.put("result", result);
		mm.put("reason", reason);
		ServletUtils.processReturn(arg0, arg1, mm);
		
	}
	
}
