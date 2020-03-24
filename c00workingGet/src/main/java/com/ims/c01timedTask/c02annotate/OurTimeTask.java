package com.ims.c01timedTask.c02annotate;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class OurTimeTask {
    /**
     * 定时器的任务方法不能有返回值，请求项目一次任意接口后回启动
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void cycleTask() {
        System.out.println("定时任务：" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

}
