<%--
  Created by gaoxu.
  User: gaoxu
  Date: 2019/6/26 0026
  Time: 09:12
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>单文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload/uploadFile.do" method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <th colspan="2">上传文件</th>
        </tr>
        <tr>
            <td>文件</td>
            <td>
                <input type="file" name="file"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="单文件上传"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
