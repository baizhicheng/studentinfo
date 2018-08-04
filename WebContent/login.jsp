<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<link href="css/login.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="login">
        <div class="loginbox">
        	<div class="login_top"><h1>学生信息管理系统</h1></div>
            <div class="loginmain" >
                <form action="login.do" method="post">              
                <div class="loginname">用户名：<input name="uname" id="txt_loginName" type="text"></div>
                <div class="loginpwd">密 &nbsp;码：<input name="passwd" id="txt_pwd" type="password"></div>
                <div class="loginyzm">验证码：<input name="vcode" id="txt_yzm" type="text"></div>
                <div class="yzm"><img src="images/yzm.jpg" alt="" /></div>
                <div class="autobtn">
                	<div class="autobtn_left"><input type="checkbox"><span>下次自动登录</span></div>
                    <div class="autobtn_right"><a href="">忘记密码</a></div>
                </div>
                <input id="btn_login" type="submit" value="" class="loginbtn">
                <a href="login.jsp"><input id="btn_reset" type="reset" value="" class="resetbtn"></a>
                </form>
            </div>

        </div>
    </div>

</body>
</html>