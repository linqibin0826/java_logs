package com.linqibin.springboot_demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringbootDemoApplicationTests {

    public static final Logger LOGGER = LoggerFactory.getLogger(SpringbootDemoApplicationTests.class);

    @Test
    void contextLoads() {
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }

}
