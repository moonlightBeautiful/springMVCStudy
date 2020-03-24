对文件上传的支持 MultipartFile
    1.引入2个jar包
        commons.io
        commons.fileupload
    2.在配置文件中配置上传的bean和限制:
        <bean id="multipartResolver"
                  class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
            <property name="defaultEncoding" value="UTF-8"/>
            <property name="maxUploadSize" value="10000000"/>
        </bean>
    3.jsp页面form添加enctype="multipart/form-data"
    4.后台接收上传的文件
        单文件上传 @RequestParam("file") MultipartFile file
        多文件上传 @RequestParam("file") MultipartFile[] files