对rest风格的url的支持
    rest风格的url
        没有后缀的，请求参数放在路径中
            项目/模块/状态/{参数}
        web.xml中拦截器url-pattern不要后缀
    @PathVariable("路径的参数")把请求路径上携带的参数绑定到方法的入参上绑定路径上的参数到入参
        配合 @RequestMapping("...")使用
        使用方法
            @RequestMapping("/details/{id}")
            方法 类型 (@PathVariable("id") 类型 入参){}
    对静态资源的处理，
        springMVC会过滤掉对网页对静态资源的请求，所以导致静态资源的请求会请求不到
        所以需要对静态资源从新映射请求地址
        <mvc:resources mapping="/新地址" location="/旧地址"/>。