package com.example.springboot_html.util.date20200612;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * 测试定时器    涉及注解@EnableScheduling @Scheduled @Component
 * <p>
 * href: https://www.cnblogs.com/chenpi/p/9785953.html
 *
 * @author jiaohongtao
 * @version 1.0
 * @since 2020年06月29日
 */
@Component
public class TestSchedule {

    private final Logger logger = LoggerFactory.getLogger(TestSchedule.class);

    @Scheduled(initialDelay = 1000, fixedRate = 10000)
    // @Scheduled(cron = "0/5 * * * * *")
    public void run() {
        logger.info("Current time is :: " + Calendar.getInstance().getTime());
    }
}
