<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>

<title>EOD MAIN PAGE</title>
</head>

<body>
    <h1>SpringBoot Test Page</h1>
    <form id="targetForm" name="targetForm" method="post" action="/dbTest">
    </form>
    <button type="submit" form="targetForm" style="border: 10px;background-color: lime;">
    	DB테스트 페이지로 이동
    </button>
</body>

</html>
