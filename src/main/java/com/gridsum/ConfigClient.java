package com.gridsum;

import com.gridsum.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Zhiqiang Lin
 * @Description
 * @create 2018/10/29.
 */
@SpringBootApplication
public class ConfigClient implements CommandLineRunner {
    @Autowired
    private TestConfig testConfig;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        testConfig.getTestConfig();
//        Thread.currentThread().join();
    }
}
