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
<% if(request.getAttribute("ktt")!=null) 
	out.print("<script>alert('Không thêm đượ vì trùng mã');</script>");
%>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="t1controller">Màn hình 1</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="t2controller">Màn hình 2</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="mhcontroller">Màn hình 3</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="t4controller">Màn hình 4</a>
          </li>
        </ul>
    </nav>
	<section class="container mt-4">
		<form action="t1controller" method="post">
			<h4>Thêm môn học</h4>
			<table>
				<tr>
					<td>MaMH: </td><td><input class="form-control" type="text" name="mamh" required></td>
				</tr>
				<tr>
					<td>TenMH: </td><td><input class="form-control" type="text" name="tenmh" required></td>
				</tr>
				<tr>
					<td>SoTinChi: </td><td><input class="form-control" type="number" name="sotc" required></td>
				</tr>
				<tr>
					<td>SoBuoi: </td><td><input class="form-control" type="number" name="sob" required></td>
				</tr>
				<tr>
					<td>SoSVToiThieu: </td><td><input class="form-control" type="number" name="sosvtt" required></td>
				</tr>
				<tr>
					<td>SoSVToiDa: </td><td><input class="form-control" type="number" name="sosvtd" required></td>
				</tr>
				<tr>
					<td>SoSVDangKy: </td><td><input class="form-control" type="number" name="sosvdk" required></td>
				</tr>
				<tr>
					<td>NgayNhapHoc: </td><td><input class="form-control" type="date" name="ngaynh" required></td>
				</tr>
				<tr>
					<td>NgayHetHan: </td><td><input class="form-control" type="date" name="ngayhh" required></td>
				</tr>
			</table>
			
			<button type="submit" class="btnthem btn btn-primary btn-sm">Thêm</button>
		</form>
	</section>	
	
	
	
<script type="text/javascript" src="js/all.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>