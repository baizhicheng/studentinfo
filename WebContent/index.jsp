<%@ page language="java" import="java.util.*,it.studentinfo.model.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>学生信息管理首页</title>
<style> 
a{ text-decoration:none} 
</style>
<link href="css/main_css.css" rel="stylesheet" type="text/css" />
<link href="css/iconfont.css" rel="stylesheet" type="text/css">
</head>
	<script type="text/javascript">
		/**退出系统**/
		function logout(){
			if(confirm("您确定要退出本系统吗？")){
				window.location.href = "login.jsp";
			}
		}
	</script>
  
 <body onload="getDate01()">
    <div id="top">
		<div id="top_logo">
            <span>学生信息管理系统</span>
		</div>
		<div id="top_links">	
			<div id="top_close">
            	<a class="icon iconfont" href="javascript:void(0);" onclick="logout();" target="_parent">&#xe619;</a>
            	<a href="" title=""><img src="images/admin.png" alt="" /><span>admin</span></a>
				
			</div>
		</div>
	</div>
    <div class="foot">Copyright © 2016-2017 xx（集团）股份有限公司 </div>
    <!-- side menu start -->
	<div id="side">
		<div id="left_menu">
 				<div style="margin:0 auto">
                    <ul class="List">
                        <li id="left_tab0">
                            <i>&nbsp;&nbsp;</i><div class="title"><a href="welcome.jsp" target="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;首页</a></div>
                        </li>
                        <li id="left_tab1">
                            <i>&nbsp;&nbsp;</i><div class="title"><a href="saveStudent.jsp" target="right">&nbsp;&nbsp;添加学生信息</a></div>
                        </li>
                        <li id="left_tab2">
                            <i>&nbsp;&nbsp;</i><div class="title"><a href="deleteStudent.jsp" target="right">&nbsp;&nbsp;删除学生信息</a></div>
                        </li>
                        <li id="left_tab3">
                            <i>&nbsp;&nbsp;</i><div class="title"><a href="updateStudent1.jsp" target="right">&nbsp;&nbsp;更新学生信息</a></div>
                        </li>
                        <li id="left_tab4">
                            <i>&nbsp;&nbsp;</i><div class="title"><a href="queryStudent.jsp" target="right">&nbsp;&nbsp;查询学生信息</a></div>
                        </li>
                      
                    </ul>
			
		 </div>
		 </div>
		 
	</div>
    <!-- side menu start -->
    <!--时间js代码-->
    <script>
    	function  getDate01(){
			var time = new Date();
			document.getElementById("day_day").innerHTML =  time.getFullYear()
    +"年"+(time.getMonth()+1)+"月"+time.getDate()
    +"日"+time.getHours()+"时"+time.getMinutes()
    +"分";
		}
    </script>
    <div id="top_nav">
    	<div class="time">
        	<i class="icon iconfont">当前时间：</i>
			<span id="day_day"></span>
        </div>
	</div>
	 <div id="main">
      	<iframe name="right" id="rightMain" src="welcome.jsp" frameborder="0" scrolling="auto" width="100%" height="100%">
      	</iframe>
    </div>
    
   
</body>
</html>
