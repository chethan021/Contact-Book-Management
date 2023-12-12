package com.jsp.ei;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
@Configurable
@ComponentScan(basePackages = "com.jsp.ei")
public class MyConfig {

}
