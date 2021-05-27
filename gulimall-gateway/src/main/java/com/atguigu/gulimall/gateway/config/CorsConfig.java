/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.atguigu.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig{

    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration configuration = new CorsConfiguration();
        //哪些请求头允许跨域
        configuration.addAllowedHeader("*");
        //哪些请求来源允许跨域
        configuration.addAllowedOrigin("*");
        //哪些请求方法允许跨域
        configuration.addAllowedMethod("*");
        //是否允许携带cookie跨域
        configuration.setAllowCredentials(true);
        source.registerCorsConfiguration("/**",configuration);
        return new CorsWebFilter(source);
    }

}