package com.linqibin;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author lqb
 * @date 2022/6/13
 */
public class Log4jTest {

    @Test
    public void quickStart() {

        // 初始化系统配置，不需要配置文件
//        BasicConfigurator.configure();
        // 创建日志记录器对象
        Logger logger = Logger.getLogger(Log4jTest.class);
        // 日志记录输出
        logger.info("hello log4j");
        printLog(logger);
    }

    private void printLog(Logger logger) {
        // 日志级别
        // 严重错误，一般会造成系统崩溃和终止运行
        logger.fatal("fatal");
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
