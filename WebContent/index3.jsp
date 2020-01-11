<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.sql.Date"%>
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
<% if(request.getAttribute("ktx")!=null) 
	out.print("<script>alert('Không xóa được vì có sv đang học');</script>");
%>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <a class="nav-link" href="t1controller">Màn hình 1</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="t2controller">Màn hình 2</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="mhcontroller">Màn hình 3</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="t4controller">Màn hình 4</a>
          </li>
        </ul>
    </nav>
	<section class="container mt-4">
		
		<h3 class="text-center">Danh sách môn học</h3>
		<table class="table table-bordered table-hover">
			<tr>
				<td class="h6">Mã môn học</td>
				<td class="h6">Tên môn học</td>
				<td class="h6 text-center">Số tín chỉ</td>
				<td class="h6 text-center">Số buổi</td>
				<td class="h6 text-center">Số sv tối thiểu</td>
				<td class="h6 text-center">Số sv tối đa</td>
				<td class="h6 text-center">Ngày nhập học</td>
				<td class="h6 text-center">Trạng thái</td>
				<td class="h6 text-center">Thao tác</td>
			</tr>
			<%ArrayList<mhbean> dsmh = (ArrayList<mhbean>)request.getAttribute("dsmh");
				for(mhbean h : dsmh){%>
				<tr>
					<td><%=h.getMamh() %></td>
					<td><%=h.getTenmh() %></td>
					<td class="text-center"><%=h.getSotc() %></td>
					<td class="text-center"><%=h.getSob() %></td>
					<td class="text-center"><%=h.getSosvtt() %></td>
					<td class="text-center"><%=h.getSosvtd() %></td>
					<td class="text-center"><%=h.getNgaynh() %></td>
					<td class="text-center">
						<%
							DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
						   LocalDateTime now = LocalDateTime.now();  
						   String a = dtf.format(now).toString();
						   String b = h.getNgayhh().toString();
						   if(a.compareTo(b)>0)
							out.print("Đã hết hạn đăng ký");
						   else if(a.compareTo(b)<=0){
							if(h.getSosvdk()==h.getSosvtd())   
								out.print("Đã kết thúc");
							else if(h.getSosvdk() < h.getSosvtd())
								out.print("Đang mời đăng ký");
						   }
						  
						%>
					</td>
					<td class="text-center">
						<a href="t2controller?mmh=<%=h.getMamh()%>"><i class="fa fa-edit"></i></a>
						<a href="mhcontroller?xmh=<%=h.getMamh()%>"><i class="fa fa-trash-alt"></i></a>
					</td>
				</tr>
			<%}%>
		</table>
	</section>	
	
	
	
<script type="text/javascript" src="js/all.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>