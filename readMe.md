SpringMVC的复习
1.hello 
    pom文件引入jar包
    webxml文件配置核心分发器
    引入spring的配置文件
    写页面和控制器
2.控制器@Controller
    1.@requestmapping：放在类或者方法上，映射请求的路径。
    2.@RequestParam：绑定请求的参数到方法的入参上，默认必须
    3.ModelAndView：存放响应返回的数据和视图
    4.自动封装对象属性：也就是传入的参数明和对象属性名一样，则自动匹配。
    5.编码过滤，在web.xml中配置
    6.重定向和转发请求：方法的返回类型是String， 
               return "redirect:/student/list.do";
               return "forward:/student/list.do";
     7.对servlet、api的支持，参数上写request和response对象
     8.@ResponseBody：把返回的类型转成json字符串
        一般不用这个，用
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.println(o.toString());
            out.flush();
            out.close();