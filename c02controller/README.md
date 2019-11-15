SpringMVC的复习
控制器
   注解：
        @Controller：用在类上，标识是控制器，组件注解
        @RequestMapping("/hello")：用在类或者方法上，映射请求。
        @RequestParam(value="请求携带的参数，required=“boolean”) 类型 入参名：
            把请求携带的参数绑定到入参上，默认携带的参数必须存在。即required默认为true。
   响应：
        ModelAndView：返回模型和视图，响应路径viewName和响应数据object。
   自动封装数据成对象
        springMVC会自动把前台请求中的数据封装成对象。
   请求的方法返回重定向到另一个请求：
        return "redirect：/另一个请求"
   请求的方法返回转发向到另一个请求： 
        return "forward：/另一个请求"
   spring自带的编码过滤器：
        可在web.xml中配置编码过滤器
   对servlet、api的支持，参数上写request和response、session对象
       HttpServletRequest  HttpServletResponse  HttpSession
   @ResponseBody：把返回的类型转成json字符串
       也可以下面这样实现返回json字符串
           response.setContentType("text/html;charset=utf-8");
           PrintWriter out=response.getWriter();
           out.println(o.toString());
           out.flush();
           out.close();