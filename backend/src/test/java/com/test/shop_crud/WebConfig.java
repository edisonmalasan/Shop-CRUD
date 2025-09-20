package com.test.shop_crud;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebConfig extends WebMvcConfigurer {
    @Override
    public void addCorsMapping(CorsRegistry registry) {
        registry.addMapping("/api/products")
                .allowedHeaders("http://localhost:3000")
                .allowedMethods("GET","POST", "DELETE", "PUT", "OPTION")
                .allowedHeaders("*")
                .allowedOrigins("main");
    }
}
