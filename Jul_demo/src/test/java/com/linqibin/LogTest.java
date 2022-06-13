package com.linqibin;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;

/**
 * LogManager Logger Handler Formatter Filter
 *  日志原理解析
 * 1. 初始化LogManager
 * 1. LogManager加载logging.properties配置
 * 2. 添加Logger到LogManager
 * 2. 从单例LogManager获取Logger
 * 3. 设置级别Level，并指定日志记录LogRecord
 * 4. Filter提供了日志级别之外更细粒度的控制
 * 5. Handler是用来处理日志输出位置
 * 6. Formatter是用来格式化LogRecord的
 * @author lqb
 * @date 2022/6/13
 */
public class LogTest {

    @Test
    public void quickStart() {
        // rootLogger
        Logger rootLogger = Logger.getLogger("");

        Logger logger = Logger.getLogger("com.linqibin.LogTest");
        printLog(logger);

        logger.log(Level.INFO, "姓名:{0}, 年龄:{1}", new Object[]{"林琪斌", 24});
    }

    @Test
    public void testLogConfig() {
        // logger的默认父亲节点未RootLogger


        Logger parent = Logger.getLogger("com.linqibin");
        Logger child = Logger.getLogger("com.linqibin.TestLog");
        parent.setLevel(Level.ALL);

        // 不启用父节点的配置信息
        parent.setUseParentHandlers(false);

        // 自定义配置
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new SimpleFormatter());
        parent.addHandler(handler);

        // 会继承父节点的配置
        printLog(child);


    }

    @Test
    public void TestLoggingProperties() throws IOException {
        InputStream is = LogTest.class.getClassLoader().getResourceAsStream("logging.properties");
        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(is);
        Logger logger = Logger.getLogger("com.linqibin.LogTest");
        printLog(logger);

    }

    private void printLog(Logger logger) {
        logger.severe("severe");
        logger.warning("warning");
        // 默认日志记录级别， 只记录此级别网上，可以配置修改
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }
}
