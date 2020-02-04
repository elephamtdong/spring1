package com.ccb.js.config;

import com.ccb.js.aop.LogAspects;
import com.ccb.js.aop.MathCalculation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class MainConfigOfAop {

    @Bean
    public MathCalculation calculator(){
        return new MathCalculation();
    }

    @Bean
    public LogAspects aspects(){
        return new LogAspects();
    }
}
