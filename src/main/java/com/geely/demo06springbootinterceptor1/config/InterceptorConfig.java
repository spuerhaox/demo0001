package com.geely.demo06springbootinterceptor1.config;

import com.geely.demo06springbootinterceptor1.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration//定义此类为配置文件（即相当于之前的xml配置文件）
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        String[] addPathPatterns = {};
        String[] excludePathPatterns = {};
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
