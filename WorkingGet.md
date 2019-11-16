1.定时器
    配置文件添加命名控件和启动task注解功能
        xmlns:task="http://www.springframework.org/schema/task"
        xsi:schemaLocation="
            http://www.springframework.org/schema/task
            http://www.springframework.org/schema/task/spring-task-3.2.xsd"
        <task:annotation-driven/>
    在类上添加注解@Component和在方法上指定规则@Scheduled(cron = "0/5 * * * * ? ")开启定时任务
    定时任务启动：需要激活，请求项目一次任意接口后回启动
        