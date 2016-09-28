<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>

<link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
</head>
<body>
	<table class='table_detail' style='width:100%'>
		<tr>
			<td colspan="2" id="i2" valign="top" align="right"
			style="background-repeat:background-position: right top;">
				<img src="../Staffs/resources/img/${detail_staff.avatar_staff}"
				alt="Updating ..."
				style="max-height:300px; max-width:100%;height:auto;width:auto; align: center" /><br><br>
		</tr>
		
		<tr>
			<td style=" text-align: left; ">Name: </td>
			<td>${detail_staff.name_staff}</td>
		</tr>
		<tr>
			<td style=" text-align: left; ">Department: </td>
			<td>${detail_staff.name_department}</td>
		</tr>
		<tr>
			<td style=" text-align: left; ">Position: </td>
			<td>${detail_staff.position_staff}</td>
		</tr>
		<tr>
			<td style=" text-align: left; ">Certificates: </td>
			<td>${detail_staff.cert_staff}</td>
		</tr>
		<tr>
			<td style=" text-align: left; ">Information: </td>
			<td><textarea
					style="text-align: justify; width: 100%;resize: none;font-size: 12px;" rows="5" disabled>${detail_staff.info_staff}</textarea></td>
		</tr>
	</table>
</body>
</html>