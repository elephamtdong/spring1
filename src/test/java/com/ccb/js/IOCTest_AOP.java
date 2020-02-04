package com.ccb.js;

import com.ccb.js.aop.MathCalculation;
import com.ccb.js.config.MainConfigOfAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_AOP {
    @Test
    public void test01() throws Exception{
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfigOfAop.class);
        MathCalculation mc = ac.getBean(MathCalculation.class);
        mc.div(1,1);
        mc.div(1,0);
        ac.close();
    }
}
