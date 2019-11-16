对rest风格的url的支持
    rest风格的url是：项目/模块/状态/{参数}，没有后缀的，参数放在路径。
        @PathVariable("路径的参数")：可以把路径上的参数取下来。
    对静态资源的处理，
        springMVC会过滤掉对网页对静态资源的请求，所以导致静态资源的请求会请求不到
        所以需要对静态资源从新映射请求地址
        <mvc:resources mapping="/旧地址" location="/新地址"/>。