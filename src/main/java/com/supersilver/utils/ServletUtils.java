package com.supersilver.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.ServletRequestUtils;


public class ServletUtils {
	
	 public static final String CONTENT_TYPE_JSON = "application/json;charset=utf-8";
	    
	    public static final String CONTENT_TYPE_HTML = "text/html;charset=utf-8";
	    
	    public static final String CONTENT_TYPE_JAVASCRIPT = "application/x-javascript;charset=utf-8";
	    
	    public static final String HTML_CONTENT = "<html><script type=\"text/javascript\">window.parent.callback(%s)</script></html>";
   
	 public static void processReturn(HttpServletRequest request, HttpServletResponse response, Map model) {
			PrintWriter out = null;
			String callback = ServletRequestUtils.getStringParameter(request, "callback", "");
	    	try {
		    	String contentType = CONTENT_TYPE_JSON;
				String resStr = JSONArray.fromObject(model).toString();
				if(StringUtils.isNotBlank(callback)) {
					contentType = CONTENT_TYPE_JAVASCRIPT;
					resStr = callback + "(" + resStr + ")";
				}
	    		response.setContentType(contentType);
	    		out = response.getWriter();
	    		out.write(resStr);
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	} finally {
	    		if(out!=null) {
	    			out.close();
	    		}
	    	}
		}
	 
}
