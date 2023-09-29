package org.dishwalla.nemo.config;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.dishwalla.nemo.login.filter.LoginFilter;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    
    @Bean
    public FilterRegistrationBean<Filter> loginFilter() {
      FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>(new LoginFilter());
      bean.setOrder(1);
      bean.addUrlPatterns("/");
      
      return bean;
    }
}
