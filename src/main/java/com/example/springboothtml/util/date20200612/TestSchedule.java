package com.example.springboothtml.util.date20200612;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试定时器    涉及注解@EnableScheduling @Scheduled @Component
 * <p>
 * href: https://www.cnblogs.com/chenpi/p/9785953.html
 *
 * @author jiaohongtao
 * @version 1.0
 * @since 2020年06月29日
 */
@Slf4j
@Component
@Async
public class TestSchedule {

    private final Logger logger = LoggerFactory.getLogger(TestSchedule.class);

    // @Scheduled(initialDelay = 1000, fixedRate = 10000)
    // @Scheduled(cron = "0/5 * * * * *")
    public void run() {
        System.out.println(Thread.currentThread().getName());
        logger.info("Current time is run:: " + Calendar.getInstance().getTime());
        System.out.println("====================");
    }

    // @Scheduled(cron = "0/6 * * * * *")
    public void run1() {
        System.out.println(Thread.currentThread().getName());
        logger.info("Current time is run1:: " + Calendar.getInstance().getTime());
    }

    // @Scheduled(cron = "0/2 * * * * *")
    public void run2() {
        System.out.println(Thread.currentThread().getName());
        logger.info("Current time is run2:: " + Calendar.getInstance().getTime());
    }

}
