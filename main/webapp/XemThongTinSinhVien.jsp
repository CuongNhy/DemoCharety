<%@page import="modle.bean.SinhVien"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xem Thông Tin Sinh Viên</title>
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }

    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
	<table>
		<tr>
			<th>IDSV</th>
			<th>Name</th>
			<th>Age</th>
			<th>University</th>
		</tr>
		<%
			ArrayList <SinhVien> sinhVienArray = (ArrayList<SinhVien>)request.getAttribute("sinhVienArray");
			for ( int i=0; i< sinhVienArray.size(); i++){
		%>
		<tr>
			<td> <%= sinhVienArray.get(i).getIDSV() %></td>
			<td> <%= sinhVienArray.get(i).getName() %></td>
			<td> <%= sinhVienArray.get(i).getAge() %></td>
			<td> <%= sinhVienArray.get(i).getUniversity() %></td>
		</tr>
		
		<% }
		%>
	</table> 
</body>
</html>