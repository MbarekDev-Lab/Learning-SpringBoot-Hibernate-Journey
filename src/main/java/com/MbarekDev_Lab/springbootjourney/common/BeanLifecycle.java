package com.MbarekDev_Lab.springbootjourney.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycle implements InitializingBean, DisposableBean {

    public BeanLifecycle() {
        System.out.println("1. Constructor: BeanLifecycle");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("3. afterPropertiesSet(): Bean initialized");
    }

    @Override
    public void destroy() {
        System.out.println("5. destroy(): Bean destroyed");
    }
}
