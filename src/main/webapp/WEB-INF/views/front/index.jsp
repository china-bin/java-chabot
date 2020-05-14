<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8"/>
    <title>聊天机器人</title>
</head>
<link rel="stylesheet" href="/static/bootstrap-3.3.4/dist/css/bootstrap.min.css">
<style>
</style>
<body>
<pre>
    f













    f





















    f





    f
</pre>

<div id="dg" style="z-index: 9999; position: fixed ! important; right: 50px; bottom: 100px;">
    <div onclick="openChatBot()"  style="position: absolute; width: 70px; height: 70px; right: 0px; top: 0px; background-color: lightgray;text-align: center">
        <img src="/static/res/chabot.png" style="height: 50px; width: 50px;"><br>
        <span style="font-size: 14px;color: blue">聊天机器人</span>
    </div>
</div>


<script src="/static/js/jquery-3.4.1.min.js"></script>
<script src="/static/js/common.js"></script>
<script src="/static/public/layer/layer.js"></script>
<script>
    function openChatBot() {
        $.myLayui.openFullScreen("/front/chatbot")
    }
</script>

</body>
</html>