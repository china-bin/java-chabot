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
    .chatText {
        display: inline-block;
        line-height: 22px;
        background-color: #e2e2e2;
        position: relative;
        padding: 8px 15px;
        word-break: break-all;
    }
    .chatUser {
        display: inline-block;
        position: absolute;
        left: 6px;
    }
    cite {
        display: block;
        position: absolute;
        left: 60px;
        top: -20px;
        line-height: 24px;
        font-size: 12px;
        white-space: nowrap;
        color: #999;
        text-align: left;
        font-style: normal;
    }
    .chatText:after {
        content: '';
        position: absolute;
        left: -10px;
        top: 5px;
        width: 0;
        height: 0;
        border-style: solid dashed dashed;
        border-color:  #e2e2e2 transparent transparent;
        overflow: hidden;
        border-width: 10px;
    }
    .chatMy {
        /*height: 90px;*/
        text-align: right;
        padding-right: 60px;

    }
    .chatMy cite {
        left: auto;
        right: 60px;
    }

    .chatMy .chatText {
        background-color: #5FB878;
        /*float: right;*/
    }

    .chatMy .chatUser {
        position: absolute;
        left: auto;
        right: 0px;
    }

    .chatMy .chatText:after {
        text-align: left;
        left: auto;
        right: -10px;
        border-color:  #5FB878 transparent transparent;

    }
    ul {
        list-style: none;
    }
    .chatMain li {
        position: relative;
        margin-bottom: 28px;
        padding-left: 60px;
    }
    .head {
        width: 50px;
        height: 50px;
        border-radius: 100%;
        background-color: white;
    }
    .chatMain {
        overflow-x: hidden;
        overflow-y: auto;
        height: 280px;
        padding: 30px 10px 10px 10px;
    }
    .chatbot {
        padding: 0 0 0;
    }

</style>
<body>
<div class="chatbot">
    <div class="chatHead" style="background-color: rgba(245,245,245,.7); height: 80px">
        <img src="/static/res/chabot.png" class="head">

        <p style="display: inline-block">聊天机器人</p>
    </div>
    <div class="chatMain">
        <ul id="chatMsg">
<%--            <li>--%>
<%--                <div class="chatUser">--%>
<%--                    <img src="/static/res/chabot.png" class="head">--%>
<%--                    <cite>--%>
<%--                        智能机器人--%>
<%--                        <i>2020-05-11 18:15:33</i>--%>
<%--                    </cite>--%>
<%--                </div>--%>
<%--                <div class="chatText">--%>
<%--                    你在干嘛--%>
<%--                </div>--%>

<%--            </li>--%>

<%--            <li style="" class="chatMy">--%>
<%--                <div class="chatText" style="">--%>
<%--                    我在学习--%>
<%--                </div>--%>
<%--                <div class="chatUser">--%>
<%--                    <img src="/static/res/student.png" class="head">--%>
<%--                    <cite>--%>
<%--                        学生--%>
<%--                        <i>2020-05-11 18:15:33</i>--%>
<%--                    </cite>--%>
<%--                </div>--%>
<%--            </li>--%>
<%--            <li>--%>
<%--                <div class="chatUser">--%>
<%--                    <img src="/static/res/chabot.png" class="head">--%>
<%--                    <cite>--%>
<%--                        智能机器人--%>
<%--                        <i>2020-05-11 18:15:33</i>--%>
<%--                    </cite>--%>
<%--                </div>--%>
<%--                <div class="chatText">--%>
<%--                    你在干嘛--%>
<%--                </div>--%>
<%--            </li>--%>
        </ul>
    </div>
    <div class="chatFooter">

        <div class="chatTextArea">
            <textarea class="form-control" id="textAreaMsg"></textarea>

        </div>
        <div class="chatBottom">
            <button class="btn btn-success" onclick="send()">发送</button>
        </div>
    </div>
</div>




<%--<div class="container" style="height: 100%">--%>

<%--    <form class="form-group" id="formSubmit">--%>


<%--        <input type="text" name="question">--%>
<%--        <input type="submit" value="提交">--%>
<%--    </form>--%>

<%--</div>--%>


<script src="/static/js/jquery-3.4.1.min.js"></script>
<script src="/static/js/common.js"></script>
<script>
    function getNowDate() {
        var now= new Date();
        var year=now.getFullYear();
        var month=now.getMonth()+1;
        var day=now.getDate();
        var hour=now.getHours();
        var minute=now.getMinutes();
        var second=now.getSeconds();
        var nowdate=year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;
        return nowdate;
    }
    console.log(getNowDate())

    $("#formSubmit").submit(function () {
        // var data = $.opData.getFormJson("#formSubmit");
       var data =  {
            question: ""
        }
        $.operate.jsonPost("/front/chatbot", data, function (res) {
            console.log(JSON.stringify(res))
        })

        return false;
    })

    // <li style="" class="chatMy">
    //     <div class="chatUser">
    //     <img src="/static/res/student.png" class="head">
    //     </div>
    //     <div class="chatText" style="">
    //     我在学习
    //     </div>
    //     <cite>
    //     学生
    //     <i>2020-05-11 18:15:33</i>
    // </cite>
    // </li>
    /**
     * 获取学生的消息 div文本
     */
    function getStudentMsgHtml(msg) {
        var nowdate =  getNowDate();
        var html = " <li style=\"\" class=\"chatMy\">\n" +
            "                <div class=\"chatText\" style=\"\">\n" +
            msg + "\n" +
            "                </div>\n" +
            "                <div class=\"chatUser\">\n" +
            "                    <img src=\"/static/res/student.png\" class=\"head\">\n" +
            "                    <cite>\n" +
            "                        学生\n" +
            "                        <i>" + nowdate + "</i>\n" +
            "                    </cite>\n" +
            "                </div>\n" +
            "            </li>"

        return html;

    }
    
    function getChatbotMsgHtml(msg) {
        var nowdate =  getNowDate();
        var html = "<li>\n" +
            "                <div class=\"chatUser\">\n" +
            "                    <img src=\"/static/res/chabot.png\" class=\"head\">\n" +
            "                    <cite>\n" +
            "                        聊天机器人\n" +
            "                        <i>"+ nowdate + "</i>\n" +
            "                    </cite>\n" +
            "                </div>\n" +
            "                <div class=\"chatText\">\n" +
             msg  + "\n" +
            "                </div>\n" +
            "\n" +
            "            </li>"
        return html;
    }

    function send() {
        var msg = $("#textAreaMsg").val()
        console.log(msg)

        var data =  {
            question: msg
        }
        $.operate.jsonPost("/front/chatbot", data, function (res) {
            console.log(JSON.stringify(res))
            $("#chatMsg").append(getChatbotMsgHtml(res.data.answer))
            $("#textAreaMsg").val('')
        }, function () {
            var height = $("#chatMsg").height()
            $(".chatMain").animate({scrollTop: height})
            $("#chatMsg").append(getStudentMsgHtml(msg))
        })
    }

    $(document).keydown(function(event){
        // console.log(event.keyCode);
        if (event.keyCode == 13) {
            send()
        }
    });

</script>
</body>
</html>