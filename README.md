SpringMVC的复习
1.hello 
   简介：
        MVC框架，功能强大、性能强悍。
   编码：
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
     7.对servlet、api的支持，参数上写request和response、session对象
            HttpServletRequest  HttpServletResponse  HttpSession
     8.@ResponseBody：把返回的类型转成json字符串
        一般不用这个，用
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.println(o.toString());
            out.flush();
            out.close();
3.对rest风格的url的支持
    1.rest风格的url是：项目/模块/状态/参数 ， 没有后缀的
    2.@PathVariable("路径的参数")：可以把路径上的参数取下来
    3.对静态资源的处理，静态资源直接访问不对，需要从新映射一下
4.对文件上传的支持 
    1.引入需要的2个jar包
    2.在配置文件中配置上传的bean和限制
    3.jsp页面form添加enctype="multipart/form-data"
    4.单文件上传@RequestParam("file") MultipartFile file和多文件上传@RequestParam("file") MultipartFile[] files
