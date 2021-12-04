<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>开发人员登录界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	  <style type="text/css">
     @import url("login.css");
     @import url("font-awesome-4.7.0/css/font-awesome.min.css")
     
     </style>
     <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  </head>
  
  <body>
   <div class="wrap">
			<h1>教务管理系统</h1>
			<form action="" method="">
				<div class="input-group">
					<i class="fa fa-group "></i>
					<select class="input-control">
						<option selected value="student">学生</option>
						<option value="teacher">教师</option>
						<option value="administrator">管理员</option>
					</select>
				</div>
				<div class="input-group">
					<i class="fa fa-user"></i>
					<input class="input-control" type="text" name="username" placeholder="请输入学号/工号">
				</div>
				<div class="input-group">
					<i class="fa fa-lock"></i>
					<input class="input-control" type="password" name="psw" id="" value="" placeholder="请输入密码"/>
				</div>
				<div class="input-group">
					<i class="fa fa-check-square"></i>
					<input class="input-control yz" type="text" name="yz" id="yz"  value="" placeholder="请输入验证码"/>
					<span class="yzm" id="yzm" width="90"> </span>
				</div>
				
				<div class="input-group">
					　　　　　<input class="login" type="submit" value="登录"/>
				</div>
			</form>
		</div>
		<script >
				var arr=["1","2","3","4","5","6","7","8","9","0"];
				yzm.innerHTML=sjs(arr);
				var n;
				function sjs(arr){
				var code =Math.floor(Math.random()*arr.length);
				var code1 =Math.floor(Math.random()*arr.length);
				var code2 =Math.floor(Math.random()*arr.length);
				var code3 =Math.floor(Math.random()*arr.length);
				n=arr[code]+arr[code1]+arr[code2]+arr[code3];
				return n;
				}
				function check(){
					var input_yzm=document.getElementById('yz').value;
					if(input_yzm==n) return true;
					alert("验证码错误！");
					return false; 
				}
		</script>
  </body>
</html>
