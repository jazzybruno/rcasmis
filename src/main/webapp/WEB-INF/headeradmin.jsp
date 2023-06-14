<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="cssfile.css" type="text/css" />

	<title>${param.title}</title>
	<link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300;400;500&display=swap" rel="stylesheet">
	<style>
		*{
			font-family: 'Quicksand', sans-serif;
		}
		div{
			font-family: 'Quicksand', sans-serif;
		}
	</style>
</head>
<body>
<div id="layout" >
	<div>
		<div class="text_header" style="color: #29375A; text-align: center; width: 100%;">RCA Management Information System</div>
		<div class="right" style="text-align: center; background-color: #29375A; width: 99%; padding:5px;">
			<c:if test="${authenticatedUser !=null}">
					<b><a href="listuser.php?page=profile&&id=${authenticatedUser.id}"><button>Profile
						</button></a> | <img src="icons/user.png" /> <font color="#ffffff">${authenticatedUser.fullName}</font>
						| <a href="login.php?logout=logout"><font color="#ffffff">Logout</font></a>
					</b>
				</c:if>
				<c:if test="${authenticatedUser ==null}">
					<div class="menu" align="left">
						| <a href="login.php?"><font color="#ffffff">Login</font></a> |
					</div>
				</c:if>
			</div>

		</div>

		<%@ include file="menu.jsp"%>