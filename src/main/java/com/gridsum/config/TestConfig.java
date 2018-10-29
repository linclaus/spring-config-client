package com.gridsum.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Zhiqiang Lin
 * @Description
 * @create 2018/10/29.
 */
@Configuration
@PropertySource("classpath:app.yml")
public class TestConfig {
    @Value("${lucky-word}")
    private String testConfig;

    @Value("${port}")
    private Integer port;

    public String getTestConfig() {
        System.out.println(testConfig);
        System.out.println(port);
        return testConfig;
    }
}
