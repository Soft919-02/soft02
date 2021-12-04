<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>教师管理</title>
		<link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css"/>
	</head>
	<body>
		<div class="container" style="margin-top: 0px;margin-left:0px;border-bottom: solid #000000 5px;position: relative;height: 75px;">
			<div class="col-md-8"> <img src="1.png" style="padding-left:0px;vertical-align:middle;height: 64px; "><span  style="font-family:SimSun;color:blue;font-size:30px;padding-left:0px;vertical-align:middle;height: 37px;line-height:50px;position:relative;">教务管理系统</span></div>
			<div class="col-md-2" style="text-align: right;padding-top: 30px;font-size: 20px;">
				XX管理员
			</div>
			<div class="col-md-2" style="text-align: left;padding-top: 30px;font-size: 20px;">
		
				<a href="#">退出</a>
			</div>
		</div>
		<div class="container" style="margin-top: 0px;margin-left:0px;height: 600px;">
			<div class="row">
				<div class="col-md-2" style="border-right: #000000 solid 5px;height: 600px;">
					<div class="row" style="width: auto;height: 100px;border-bottom: #000000 solid 5px;text-align: center;">
						<a href="condition.jsp" style="font-size: 30px;line-height: 100px;">机房状态</a>
					</div>
					<div class="row" style="width: auto;height: 100px;border-bottom: #000000 solid 5px;text-align: center;">
						<a href="arrange.jsp" style="font-size: 30px;line-height: 100px;">上机安排</a>
					</div>
					<div class="row" style="background-color:#66CDAA;width: auto;height: 100px;border-bottom: #000000 solid 5px;text-align: center;">
						<a href="teachermanagement.jsp" style="font-size: 30px;line-height: 100px;">教师管理</a>
					</div>
					<div class="row" style="width: auto;height: 100px;border-bottom: #000000 solid 5px;text-align: center;">
						<a href="view_class_table.jsp" style="font-size: 30px;line-height: 100px;">查看实验课表</a>
					</div>
				</div>
				<div class="col-md-10" style="height: 600px;font-size:20px">
					<div class="row" style="width: auto;height: 75px;border-bottom: #000000 solid 2px;line-height: 75px;font-size:25px">
						教师管理
					</div>
					<table class="table" style="margin-top: 20px;border: #000000 solid 2px;text-align: center;">
					    <thead>
							<tr>
								<td></td>
								<td>教师姓名</td>
								<td>所占用教室</td>
								<td>占用时间</td>
								<td><button class="btn"><a href="#">取消预约</a></button></td>
							</tr>
					    </thead>
						<tbody>
							<tr>
								<td><input type="checkbox" name="" value=""/></td>
								<td>张老师</td>
								<td>102</td>
								<td>2021-3-14</td>
								<td><button class="btn"><a href="#">联系老师</a></button></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>
