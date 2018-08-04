<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>查询学生信息</title>
	</head>

	<body>
		<form action="${pageContext.request.contextPath}/studentAction_queryStudent.action" method="post">
			学生姓名:<input type="text" name="student.stuname" />
			<input type="submit" value="提交" />
		</form>
		<table border="1">
			<tr>
				<td>编号</td>
				<td>学号</td>
				<td>学生姓名</td>
				<td>性别</td>
				<td>年龄</td>
				<td>入学时间</td>
				<td>所属班级</td>
				<td>所属院系</td>
				<td>更新操作</td>
				<td>删除操作</td>
			</tr>
			<c:forEach items="${requestScope.object}" var="arr" varStatus="num">
				<tr>
					<td>${num.count}</td>
					<td>${arr[0].stunumber}</td>
					<td>${arr[0].stuname}</td>
					<td>${arr[0].stusex}</td>
					<td>${arr[0].stuage}</td>
					<td>${arr[0].stuintime}</td>
					<td>${arr[1].stclass}</td>
					<td>${arr[1].stdep}</td>
					<td><a href="${pageContext.request.contextPath}/studentAction_queryStudentByStuid.action?student.stuid=${arr[0].stuid}">更新</a></td>
					<td><a href="${pageContext.request.contextPath}/studentAction_deleteStudentByStuid.action?student.stuid=${arr[0].stuid}">删除</a></td>
				</tr>
			</c:forEach>
		</table>
		<a href="${pageContext.request.contextPath}/studentAction_querySplitStudent.action?currentPage=1">首页</a>
		<c:choose>
			<c:when test="${sessionScope.currentPage==1}">
				上一页
			</c:when>
			<c:otherwise>
				<a href="${pageContext.request.contextPath}/studentAction_querySplitStudent.action?currentPage=${sessionScope.currentPage-1}">上一页</a>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${sessionScope.currentPage==sessionScope.countPage}">
				下一页 
			</c:when>
			<c:otherwise>
				<a href="${pageContext.request.contextPath}/studentAction_querySplitStudent.action?currentPage=${sessionScope.currentPage+1}">下一页 </a>
			</c:otherwise>
		</c:choose>
		<a href="${pageContext.request.contextPath}/studentAction_querySplitStudent.action?currentPage=${sessionScope.countPage}">尾页 </a>
		<script type="text/javascript">
			function changePage(){
				var currentPage=document.getElementById("currentPage").value;
				window.open("${pageContext.request.contextPath}/studentAction_querySplitStudent.action?currentPage=" + currentPage,"_self");
			}
		</script>
		<select id="currentPage" onchange="changePage()">
			<c:forEach begin="1" end="${sessionScope.countPage}" step="1" var="num">
				<c:choose>
					<c:when test="${num==sessionScope.currentPage}">
						<option value="${num}" selected="selected">${num}</option>
					</c:when>
					<c:otherwise>
						<option value="${num}">${num}</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</select>
	</body>
</html>
