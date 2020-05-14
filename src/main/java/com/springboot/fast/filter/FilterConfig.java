package com.springboot.fast.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

//    @Bean
//    public FilterRegistrationBean systemLogoutFilter() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new SystemLogoutFilter());
//        registration.addUrlPatterns("/admin/logout");
//        registration.setName("systemLogoutFilter");
//        registration.setOrder(1);  //值越小，Filter越靠前。
//        return registration;
//    }


}
