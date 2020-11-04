<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EOD테스트</title>
</head>
<body>
    <table>
        <tr>
            <th>ID</th>
            <th>NM</th>
        </tr>
 
        <c:forEach var="item" items="${resultList}" varStatus="status">
            <tr>
                <td><p>${item.id}</p></td>
                <td><p>${item.nm}</p></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
