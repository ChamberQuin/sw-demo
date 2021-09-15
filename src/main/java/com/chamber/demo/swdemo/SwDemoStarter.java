package com.chamber.demo.swdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author chamber
 * @since 2021/9/15
 */

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        JdbcTemplateAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class
})
public class SwDemoStarter extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SwDemoStarter.class, args);
    }

}
