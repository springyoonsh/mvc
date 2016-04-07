<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<FORM name='frm'>
	<input type='text' name='user_id'>
	<input type='text' name='user_pw'>
	<input type='button' value="저장" onclick="DB_INSERT();">
</FORM>


<script>
function DB_INSERT()
{
	var f = document.frm;
	f.method = "post";
	f.action = "db_insert.do";
	f.submit();		
}

</script>