<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
 <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
 <style>
	 @charset "UTF-8";
	@import url('https://fonts.googleapis.com/css?family=Lato');
	body{
	    margin:0;
	    font-family: 'Lato', sans-serif;
	    background-color: #eee;
	    display:flex;
	    flex-direction:column;
	    align-items:center;
	    justify-content:center;
	    min-height:50vh;
	}
	.title{
	  font-size:50px;
	  margin-bottom:25px;
	  color:#333
	}
	.title:first-letter{
	  color:rgba(0,0,255,0.5)
	}
	table {
	    width: 70%;
	    border-collapse: collapse;
	}
	td {
	    padding: 20px;
	    font-size: 16px;
	}
	
	thead td {
	  border-bottom: 1px solid rgba(0,0,0,0.5);
	  text-transform:uppercase;
	  color:#eee;
	}
	thead tr{
	  background-color:#222;
	 
	}
	 td{
	transition:0.1s linear transform, 0s linear background;
	    border-right: 1px solid rgba(0,0,0,0.5);
	  }
	  td:last-of-type {
	    border-right:none; 
	}
	tbody tr:hover{
	  background-color:rgba(0,0,255,0.2);
	}
	
	.add-button {
    color: #009688;
    background: #fff;
    border: 1px solid #009688;
    font-size: 17px;
    padding: 7px 12px;
    font-weight: normal;
    margin: 6px 0;
    margin-right: 12px;
    display: inline-block;
    text-decoration: none;
    font-family: 'Open Sans', sans-serif;
    min-width: 120px;
}

.add-button:hover, .ghost-button:active {
  color:#fff;
  background:#009688;
}
 </style>
</head>
<body>	
	<h1 class="title">Employee Update</h1>		
	<input type="button" value="Add Employee" onclick="window.location.href='showFormForAdd';return false;"
	class="add-button" />
	<br>
<table id="table">
  <thead>
    <tr>
      <td>ID</td>
      <td>First Name</td>
      <td>Last Name</td>
      <td>Email</td>
      <td>Address</td>
      <td>Telephone</td>  
      <td>Action</td>
    </tr>
  </thead>

  <tbody id='tbody'>
  <c:forEach var="tempemployee" items="${listallemp}">
  <c:url var="updateLink" value="/employee/showFormForUpdate">
  	<c:param name="employeeId" value="${tempemployee.id}" />
  </c:url>
  
  <c:url var="deleteLink" value="/employee/delete">
  	<c:param name="employeeId" value="${tempemployee.id}" />
  </c:url>
    <tr>
      <td>${tempemployee.id}</td>
      <td>${tempemployee.first_name}</td>
      <td>${tempemployee.last_name}</td>
      <td>${tempemployee.email}</td>
      <td>${tempemployee.address}</td>
      <td>${tempemployee.telephone}</td>
      <td> <a href="${updateLink}">Update</a> |
      	   <a href="${deleteLink}">Delete</a>
      <td>
    </tr>
  </c:forEach>

  </tbody>
</table>
</body>
</html>