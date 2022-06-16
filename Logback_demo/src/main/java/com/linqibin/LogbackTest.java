package com.linqibin;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lqb
 * @date 2022/6/16
 */
public class LogbackTest {

    public static Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);

    @Test
    public void quickStart() {
        printLog(LOGGER);
    }

    private void printLog(Logger logger) {
        // 日志级别
        // 错误信息，但不会影响系统运行
        logger.error("error");
        // 警告信息，可能会发生问题;
        logger.warn("warn");
        // 程序运行信息，数据库的连接、网络、IO操作等
        logger.info("info");
        // 调试信息，一般在开发阶段使用，记录程序的变量、参数等
        logger.debug("debug");
        // 追踪信息，记录程序的所有流程信息
        logger.trace("trace");
    }
}
