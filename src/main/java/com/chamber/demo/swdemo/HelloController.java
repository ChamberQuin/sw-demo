package com.chamber.demo.swdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chamber
 * @since 2021/9/15
 */
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello " + new SimpleDateFormat().format(new Date());
    }

}
