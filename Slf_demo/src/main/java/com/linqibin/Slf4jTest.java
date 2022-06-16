package com.linqibin;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author lqb
 * @date 2022/6/15
 */
public class Slf4jTest {

    public static Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);

    @Test
    public void quickStart() {
        LOGGER.info("hello");
    }
}
