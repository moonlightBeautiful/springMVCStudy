1.定时器
    配置文件添加命名控件和启动注解的很多功能
        xmlns:task="http://www.springframework.org/schema/task"
        xsi:schemaLocation="
            http://www.springframework.org/schema/task
            http://www.springframework.org/schema/task/spring-task-3.2.xsd"
        <task:annotation-driven/>
    在类上添加注解@Component和在方法上指定规则@Scheduled(cron = "0/5 * * * * ? ")开启定时任务
        