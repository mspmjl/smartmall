package com.smartmall.mallgateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * Created by Miaojiale on 2020/11/14.
 */
@Configuration
public class MyCorsConfiguration {

    @Bean
    public CorsWebFilter corsFilter(){
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        config.addAllowedHeader("*");//请求头
        config.addAllowedMethod("*");//请求方式
        config.addAllowedOrigin("*");//请求来源
        config.setAllowCredentials(true);//带上cookie等
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",config);
        return new CorsWebFilter(urlBasedCorsConfigurationSource);
    }
}
