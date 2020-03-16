SpringMVC的复习
hello 
   简介：
        MVC框架，功能强大、性能强悍。
   编码：
        1.web.xml文件配置核心分发器DispatcherServlet，监控和分发request请求。
        2.引入spring的配置文件，组件扫描和视图解析器。
        3.写页面和控制器，页面请求控制器。
   注解
        @Controller：用在类上，组件注解
        @RequestMapping("/hello")：用在类或者方法上，映射请求。
        <context:component-scan base-package="com.java1234"/>
            会扫描指定的包及其所有的子包，并查找出组件注解后自动注册为Spring Bean的类。
                @Component  通用的构造型注解，标识该类为Spring组件（）
                @Controller  标识将该类定义为Spring MVC controller（控制层）
                @Repository  标识将该类定义为数据仓库（持久层）
                @Service 标识将该类定义为服务（服务层，也就是业务层）
         