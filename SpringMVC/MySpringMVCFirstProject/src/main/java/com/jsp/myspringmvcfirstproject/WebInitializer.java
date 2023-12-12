package com.jsp.myspringmvcfirstproject;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Class<Object>[] getRootConfigClasses() {
		return null;
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		//Class[] lass= {MyConfig.class};
		return new Class[] {MyConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
}