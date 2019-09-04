package com.java1234.c05workingGet.sec01timedTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gaoxu
 * @date 2019-09-04 13:23
 * @description ... 类
 */
@Component
public class TimeTaskTest {

    @Scheduled(cron = "0/5 * * * * ? ") // 间隔5秒执行
    public void taskCycle() {
        System.out.println("执行时间："+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        System.out.println("使用SpringMVC框架配置定时任务");
        /*
            定时任务：
                1.spirngMVC的配置文件命名控件添加
                      xmlns:task="http://www.springframework.org/schema/task"
                      xsi:schemaLocation="
                        http://www.springframework.org/schema/task
                        http://www.springframework.org/schema/task/spring-task-3.2.xsd"
                2. <!-- 配置任务扫描 -->
                    <task:annotation-driven/>
                     <context:component-scan base-package="com.java1234"/>
                3.定时任务类上@Component
                    方法上@Scheduled(cron = "0/5 * * * * ? ")

         */
    }

}
