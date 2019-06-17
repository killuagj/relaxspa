<%--
  Created by IntelliJ IDEA.
  User: Yuki
  Date: 2019/3/27
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>feedbackmanage</title>
</head>
<body>

<form action="/relaxspa/gallery/insertGallery" method="post" enctype="multipart/form-data">
        <table >
            <tr>
                <td>上传图片：</td>
                <td><input type="file" name="file" /></td>
            </tr>
        </table>
        <button type="submit" >保存</button>
</form>
</body>
</html>
