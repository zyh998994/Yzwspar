package cn.service.impl;

import cn.service.LogTestService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component("lts")
public class LogTest implements LogTestService {

    @Override
    public void printLog() {
        Logger logger = Logger.getLogger(LogTest.class);
        logger.error("输出错误日志");
        logger.info("输出信息日志");
        logger.debug("输出debug日志");
    }
}
