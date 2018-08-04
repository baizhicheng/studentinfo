<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
 <title>添加学生信息</title>
	</head>
	<body>
		添加学生信息
		<form
			action="${pageContext.request.contextPath}/studentAction_saveStudent.action"
			method="post" enctype="multipart/form-data">
			<table border="1" cellpadding="0" cellspacing="0" id="save_text">
				<tr>
					<td>
						学号：
					</td>
					<td>
						<input type="text" class="text" id="text" name="student.stunumber" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						学生姓名：
					</td>
					<td>
						<input type="text" name="student.stuname" class="text" />
					
					</td>
					<td></td>
				</tr>
				 
			<tr>
					<td>
						性别：
					</td>
					<td>
						<input type="text" name="student.stusex" class="text" />
					
					</td>
					<td></td>
				</tr>
			
			<tr>
					<td>
						年龄：
					</td>
					<td>
						<input type="text" name="student.stuage" class="text" />
					
					</td>
					<td></td>
				</tr>
			<tr>
					<td>
						入学时间：
					</td>
					<td>
						<input type="text" name="student.stuintime" class="text" />
					
					</td>
					<td></td>
				</tr>
				 
				 
			<tr>
				<td>班级：</td>
				<td><select name="student.classes.stid">
						<option value="请选择">请选择</option>
						<c:forEach items="${applicationScope.classeses}" var="classes">
							<option value="${classes.stid}">${classes.stclass}</option>
						</c:forEach>
				</select></td>
				<td></td>
			</tr>
			
				<tr>
					<td colspan="3" align="center" id="save_text_td1">
						<input type="submit" value="确定" />
						<input type="reset" value="重置" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>