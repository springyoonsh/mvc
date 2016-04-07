<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
.bbs{border-collapse:collapse; border-top:solid 1px gray; border-left:solid 1px gray;}
.bbs th{background:gray; color:white; border-bottom:solid 1px gray; border-right:solid 1px gray; width:300px;}
.bbs td{border-bottom:solid 1px gray;  border-right:solid 1px gray;}
</style>

<table class='bbs'>	
	<tr>
		<th>ID</th>
		<th>PW</th>
	</tr>	

	<c:forEach var="board" items="${arr}">
		<tr>
	    	<td>${board.user_id}</td>	
	    	<td>${board.user_pw}</td>    
	  	</tr>		
	</c:forEach>
</table>



