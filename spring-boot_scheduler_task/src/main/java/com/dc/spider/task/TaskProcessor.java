package com.dc.spider.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
// import org.springframework.stereotype.Service;
// @Service
@Component
public class TaskProcessor {

    // @Scheduled(initialDelay = 1000,fixedDelay = 20*1000)
    // @Scheduled(cron = "0 0 18 * * ?")
    // @Scheduled(cron = "0 0 18 ? * FRI")
    @Scheduled(cron = "0/10 * * * * ?")
    public void task1(){
        System.out.println("定时任务1:"+new Date()+"No++");
    }

    // @Scheduled(initialDelay = 1000,fixedDelay = 20*1000)
    // @Scheduled(cron = "0 0 8 * * ?")
    // @Scheduled(cron = "0 0 8 ? * SAT")
    @Scheduled(cron = "0/5 * * * * ?")
    public void task2(){
        System.out.println("定时任务2:"+new Date()+"No++");
    }

    // @Scheduled(initialDelay = 1000,fixedDelay = 20*1000)
    // @Scheduled(cron = "0 0 8 * * ?")
    // @Scheduled(cron = "0 0 8 ? * SAT")
    @Scheduled(cron = "0 * * * * ?")
    public void task3(){
        System.out.println("定时任务3:"+new Date()+"No++");
    }
}
