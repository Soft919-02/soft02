<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>安排课程</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

 
     <style type="text/css">
     @import url("style.css");
     </style>


  </head>
  <body >
  
  <img src="1.png" style="padding-top:20px;height: 40px; "><span class="wdl0" style="font-family:SimSun;color:blue;font-size:30px;padding-top:70px;height: 156px; width: 223px">教务管理系统</span>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <span>××教师</span>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <input type="button" name="close" value="退出" onclick="window.close()">





  <hr/>
  <div class="wdl1">
    <table style="font-size:30px">
      <tr>
         <td width="120" height="40" bgcolor="#66CDAA"><a href="head.jsp">安排课程</td>  
         
      </tr>
      <tr>
         <td width="120" height="40" ><a href="Myexperiment.jsp">实验课表</a></td>
      </tr>
      <tr>
         <td width="120" height="40" ><a href="Myorder.jsp">预约信息</td>
      </tr>

    </table>
    </div>
  <div class="wdl2"  style="height: 607px; width: 1050px">
    <p class="wdl3" style="height: 10px; ">安排课程</p>
    <hr style="possition:absolute;left:3000px;"/>
    <div class="wdl4"  style="width: 892px;">   
        <span class="wdl5" width:50px>周次</span>&nbsp;&nbsp;&nbsp;
        <select>
           <option>--请选择--</option>
           <option>第一周</option>
           <option>第二周</option>
           <option>第三周</option>
           <option>第四周</option>
           <option>第五周</option>
           <option>第六周</option>
           <option>第七周</option>
           <option>第八周</option>
           <option>第九周</option>
           <option>第十周</option>
           <option>第十一周</option>
           <option>第十二周</option>
           <option>第十三周</option>
           <option>第十四周</option>
           <option>第十五周</option>
           <option>第十六周</option>
           <option>第十七周</option>
           <option>第十八周</option>
           <option>第十九周</option>
           <option>第二十周</option>
        </select>
        &nbsp;&nbsp;&nbsp;
        <span class="wdl5">星期</span>&nbsp;&nbsp;&nbsp;
         <select>
           <option>--请选择--</option>
           <option>星期一</option>
           <option>星期二</option>
           <option>星期三</option>
           <option>星期四</option>
           <option>星期五</option>
           <option>星期六</option>
           <option>星期日</option>
           
         </select>
        &nbsp;&nbsp;&nbsp;
        <span class="wdl5">时间段</span>&nbsp;&nbsp;&nbsp;
         <select>
           <option>--请选择--</option>
           <option>第一大节</option>
           <option>第二大节</option>
           <option>第三大节</option>
           <option>第四大节</option>
           <option>第五大节</option>

         </select>
        &nbsp;&nbsp;&nbsp;
        <span class="wdl5">教室类别</span>&nbsp;&nbsp;&nbsp;
        <select>
         <option>--请选择--</option>
         <option>计算机实验教室</option>
         <option>化学实验教室</option>
         <option>生物实验教室</option>
        </select>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="submit" value="确认" style="width: 102px; height: 35px">
     </div>
    

     <br/>
     <br/>
     <div class="wdl6" style="width: 787px; ">
         <table border="1" cellpadding="0" cellspacing="0" style="text-align:center">
            <tr>
                <td width="100" height="50"></td>
                <td width="100" height="50"></td>
                <td width="100" height="50"></td>
                <td width="100" height="50"></td>
                <td width="100" height="50"></td>
                <td width="100" height="50"></td>
                <td width="100" height="50"></td>
                <td width="100" height="50"></td>
                
            </tr>
            <tr>
                <td height="50"></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                
            </tr>
            <tr>
                <td height="50"></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                
            </tr>
            <tr>
                <td height="50"></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                
            </tr>
            <tr>
                <td height="50"></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                
            </tr>
            <tr>
                <td height="50"></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                
            </tr>
            <tr>
                <td height="50"></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                
            </tr>
      
         
         </table>
     </div>
     
   </div>
  

  
  
  
  
  
  
  
  
  
  </body>
</html>
