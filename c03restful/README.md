对rest风格的url的支持
    rest风格的url
        没有后缀的，请求参数放在路径中
            项目/模块/状态/{参数}
        web.xml中拦截器url-pattern不要后缀
    @PathVariable("路径的参数")  类型 入参名：用在方法入参上，绑定路径上的参数到入参
        把请求路径上携带的参数绑定到入参上
    对静态资源的处理，
        springMVC会过滤掉对网页对静态资源的请求，所以导致静态资源的请求会请求不到
        所以需要对静态资源从新映射请求地址
        <mvc:resources mapping="/新地址" location="/旧地址"/>。