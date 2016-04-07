<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
.bbs{border-collapse:collapse; border-top:solid 1px gray; border-left:solid 1px gray;}
.bbs th{background:gray; color:white; border-bottom:solid 1px gray; border-right:solid 1px gray; width:300px;}
.bbs td{border-bottom:solid 1px gray;  border-right:solid 1px gray;}
</style>

<FORM name='frm'>
	<table class='bbs'>	
		<tr>
			<th>ID</th>
			<th>PW</th>
		</tr>	
	
		<c:forEach var="board" items="${arr}">
			<tr>
		    	<td style='cursor:pointer;' onclick="GO_VIEW(${board.idx});">${board.user_id}</td>	
		    	<td>${board.user_pw}</td>    
		  	</tr>		
		</c:forEach>
	</table>
</FORM>

<input type="button" value="글쓰기" onclick="WRITE();">


<script>
function WRITE()
{
	var f = document.frm;
	f.method = "post";
	f.action = "write.do";
	f.submit();		
}
function GO_VIEW(idx)
{
	var f = document.frm;
		f.method = "post";
		f.action = "detail.do?idx="+idx;
		f.submit();		
}
</script>


