<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>home</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <sf:form modelAttribute="user" method="POST" action="${ctx}/user/register">
  	<table>
    	<tr>
    		<td>�û���</td>
    		<td>
    			<sf:input path="userName"  maxlength="10" size="10"/>
    		</td>
    	</tr>
    	<tr>
    		<td>����</td>
    		<td>
    			<sf:password path="password" size="10" maxlength="10"/>
    		</td>
    	</tr>
    	<tr>
    		<td>����</td>
    		<td>
    			<sf:input path="age" size="3" maxlength="3"/>
    		</td>
    	</tr>
    	<tr>
    		<td>�Ա�</td>
    		<td>
    			<sf:select path="sex">
    				<sf:option value="MA" label="��"></sf:option>
    				<sf:option value="FE" label="Ů"></sf:option>
    			</sf:select>
    		</td>
    	</tr>
    	<tr>
    		<td colspan="2">
    			<input type="submit"  value="�� ��">
    		</td>
    	</tr>
    </table>
  </sf:form>
  <!--  
  <form action="${ctx}/user/register" method="post">
    <table>
    	<tr>
    		<td>�û���</td>
    		<td>
    			<input type="text" name="username" id="username" >
    		</td>
    	</tr>
    	<tr>
    		<td>����</td>
    		<td>
    			<input type="password" name="username" id="username" >
    		</td>
    	</tr>
    	<tr>
    		<td>����</td>
    		<td>
    			<input type="text" name="username" id="username" >
    		</td>
    	</tr>
    	<tr>
    		<td>�Ա�</td>
    		<td>
    			<select id="sex" name="sex">
    				<option selected="true" label="��" value="MA"></option>
    				<option label="Ů" value="FE"></option>
    			</select>
    		</td>
    	</tr>
    	<tr>
    		<td colspan="2">
    			<input type="submit"  value="�� ��">
    		</td>
    	</tr>
    </table>
    </form>-->
  </body>
</html>
