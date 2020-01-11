<%@page import="bean.svbean"%>
<%@page import="bean.mhbean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Lê Công Tuệ Quang</title>
  <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/solid.css" integrity="sha384-QokYePQSOwpBDuhlHOsX0ymF6R/vLk/UQVz3WHa6wygxI5oGTmDTv8wahFOSspdm" crossorigin="anonymous">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/brands.css" integrity="sha384-n9+6/aSqa9lBidZMRCQHTHKJscPq6NW4pCQBiMmHdUCvPN8ZOg2zJJTkC7WIezWv" crossorigin="anonymous">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/fontawesome.css" integrity="sha384-vd1e11sR28tEK9YANUtpIOdjGW14pS87bUBuOIoBILVWLFnS+MCX9T6MMf0VdPGq" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script> -->
  <link rel="stylesheet" type="text/css" href="css/all.css">
  <link rel="stylesheet" type="text/css" href="css/all.min.css">
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <a class="nav-link" href="t1controller">Màn hình 1</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="t2controller">Màn hình 2</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="mhcontroller">Màn hình 3</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="t4controller">Màn hình 4</a>
          </li>
        </ul>
    </nav>
	<section class="container mt-4">
		<h3>Thông tin sinh viên</h3>
		<table class="table table-hover table-bordered">
			<tr>
				<td class="h6 text-center">Mã SV</td>
				<td class="h6">Họ Tên</td>
				<td class="h6 text-center">Giới tính</td>
				<td class="h6 text-center">Ngày Sinh</td>
				<td class="h6 text-center">Địa chỉ</td>
				<td class="h6 text-center">Lớp</td>
				<td class="h6 text-center">Email</td>
				<td class="h6 text-center">SĐT</td>
				<td class="h6 text-center">Tổng tín chỉ</td>
			</tr>
			
			<%ArrayList<svbean> dssv = (ArrayList<svbean>)request.getAttribute("sv");
				for(svbean s: dssv){%>
				<tr>
					<td class="text-center"><%=s.getMasv() %></td>
					<td><%=s.getHoten() %></td>
					<td class="text-center"><%=s.getGioitinh() %></td>
					<td class="text-center"><%=s.getNgaysinh() %></td>
					<td><%=s.getDiachi() %></td>
					<td class="text-center"><%=s.getLop() %></td>
					<td><%=s.getEmail() %></td>
					<td class="text-center"><%=s.getSdt() %></td>
					<td class="text-center"><%=s.getTtc() %></td>
				</tr>
			<%}%>
				
			
		</table>
	</section>	
	
	
	
<script type="text/javascript" src="js/all.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>