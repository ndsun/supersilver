package org.swinglife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller   
public class HomeController {  
      
    @RequestMapping("/index")  
    public ModelAndView index(){  
        //创建模型跟视图，用于渲染页面。并且指定要返回的页面为home页面  
    	System.out.println("aaaaaaaa");
        ModelAndView mav = new ModelAndView("home");  
        return mav;  
    }  
}  
