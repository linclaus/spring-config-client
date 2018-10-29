package com.gridsum.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author Zhiqiang Lin
 * @Description
 * @create 2018/10/29.
 */
@Configuration
public class TestConfig {
    @Value("${lucky-word}")
    private String testConfig;

    public String getTestConfig() {
        System.out.println(testConfig);
        return testConfig;
    }
}
