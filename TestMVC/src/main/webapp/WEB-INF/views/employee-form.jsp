<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
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
	    width: 50%;
	    border-collapse: collapse;
	}


td {
	    padding: 5px;
	    font-size: 16px;
	}
	

.add-button {
    color: #009688;
    background: #fff;
    border: 1px solid #009688;
    font-size: 10px;
    padding: 7px 12px;
    font-weight: normal;
    margin: 6px 10;
    margin-right: 10px;
    display: inline-block;
    text-decoration: none;
     align-items:center;
    font-family: 'Open Sans', sans-serif;
    min-width: 70px;
}
.add-button:hover, .ghost-button:active {
  color:#fff;
  background:#009688;
}
</style>
</head>
<body>
    <div align="center">
        <h1>New/Edit Employee</h1>
        <form:form action="saveEmployee" method="post" modelAttribute="employee">
        <table>
            <form:hidden path="id"/>
            <tbody id='tbody'>
            <tr>
                <td>First Name:</td>
                <td><form:input path="first_name" /></td>
            </tr>
             <tr>
                <td>Last Name:</td>
                <td><form:input path="last_name" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Telephone:</td>
                <td><form:input path="telephone" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save" class="add-button"></td>
            </tr>
              </tbody>
        </table>
        </form:form>
    </div>
</body>
</html>