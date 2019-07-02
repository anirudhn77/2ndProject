package com.ani.collabapi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@ComponentScan(basePackages = "com.ani")
public class AppConfig extends WebMvcConfigurerAdapter
{


@Override
public void addCorsMappings(CorsRegistry registry) {
    // TODO Auto-generated method stub
    registry.addMapping("/**");
}
}