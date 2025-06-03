package com.backend.tomcattest.conf;

import com.backend.tomcattest.servlet.HelloServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ServletRegistrationBean<HelloServlet> hello() {
        return new ServletRegistrationBean<>(
                new HelloServlet(),
                "/hello"  // явное указание URL
        );
    }
}