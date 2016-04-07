<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
.bbs_detail{border-collapse:collapse; border-top:solid 1px gray; border-left:solid 1px gray;}
.bbs_detail th{background:gray; color:white; border-right:solid 1px gray; border-bottom:solid 1px gray; width:100px;}
.bbs_detail td{border-right:solid 1px gray; border-bottom:solid 1px gray; width:300px;}
</style>

<table class="bbs_detail">
	<tr>
		<th>ID</th> <td>${board.user_id}</td>
	</tr>
	
	<tr>
		<th>PW</th> <td>${board.user_pw}</td>
	</tr>		
</table>
