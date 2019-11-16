对文件上传的支持 MultipartFile
    1.在配置文件中配置上传的bean和限制:相当于使用了插件
        <bean id="multipartResolver"
                  class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
            <property name="defaultEncoding" value="UTF-8"/>
            <property name="maxUploadSize" value="10000000"/>
        </bean>
    2.jsp页面form添加enctype="multipart/form-data"
    3.单文件上传@RequestParam("file") MultipartFile file和多文件上传@RequestParam("file") MultipartFile[] files