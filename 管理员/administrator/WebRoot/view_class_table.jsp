<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>查看实验课表</title>
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
					<div class="row" style="width: auto;height: 100px;border-bottom: #000000 solid 5px;text-align: center;">
						<a href="teachermanagement.jsp" style="font-size: 30px;line-height: 100px;">教师管理</a>
					</div>
					<div class="row" style="background-color:#66CDAA;width: auto;height: 100px;border-bottom: #000000 solid 5px;text-align: center;">
						<a href="view_class_table.jsp" style="font-size: 30px;line-height: 100px;">查看实验课表</a>
					</div>
				</div>
				<div class="col-md-10" style="height: 600px;font-size:20px">
					<div class="row" style="width: auto;height: 75px;border-bottom: #000000 solid 2px;line-height: 75px;font-size:25px">
						查看实验课表
					</div>
					<div class="row" style="height: 300px;">
						<div class="col-md-2" style="height: 300px;">
							<select class="form-control" style="text-align: center;margin-top: 30px;">
								<option value="" style="display: none;" disabled selected>周次</option>
								<option value="">第1周</option>
								<option value="">第2周</option>
								<option value="">第3周</option>
								<option value="">第4周</option>
								<option value="">第5周</option>
								<option value="">第6周</option>
								<option value="">第7周</option>
								<option value="">第8周</option>
								<option value="">第9周</option>
								<option value="">第10周</option>
								<option value="">第11周</option>
								<option value="">第12周</option>
								<option value="">第13周</option>
								<option value="">第14周</option>
								<option value="">第15周</option>
								<option value="">第16周</option>
								<option value="">第17周</option>
								<option value="">第18周</option>
								<option value="">第19周</option>
								<option value="">第20周</option>
							</select><br />
							<select class="form-control" style="text-align: center;">
								<option value="" style="display: none;" disabled selected>星期几</option>
								<option value="">周一</option>
								<option value="">周二</option>
								<option value="">周三</option>
								<option value="">周四</option>
								<option value="">周五</option>
								<option value="">周六</option>
								<option value="">周日</option>
							</select><br />
							<select class="form-control" style="text-align: center;">
								<option value="" style="display: none;" disabled selected>时间段</option>
								<option value="">第一大节</option>
								<option value="">第二大节</option>
								<option value="">第三大节</option>
								<option value="">第四大节</option>
								<option value="">第五大节</option>
							</select><br />
						</div>
						<div class="col-md-10">
							<table class="table" style="margin-top: 20px;border: #000000 solid 2px;text-align: center;">
							    <thead>
									<tr>
										<td>实验名称</td>
										<td>相关老师</td>
										<td>教师编号</td>
										<td><button class="btn"><a href="#">联系老师</a></button></td>
									</tr>
							    </thead>
								<tbody>
									<tr>
										<td>计算机组成原理</td>
										<td>张老师</td>
										<td>123456</td>
										<td></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
