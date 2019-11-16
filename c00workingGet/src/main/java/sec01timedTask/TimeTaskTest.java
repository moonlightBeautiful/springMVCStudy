package sec01timedTask;

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
    }

}
