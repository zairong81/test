<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- DataTables 사용하기 위해서는 최소한으로 DataTables JS 파일과 CSS 파일, jQuery가 필요 -->
<link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css"/> 
<script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script>



</head>
<body>

<table id="foo-table" class="table table-bordered">
		<thead>
			<tr><th>No</th><th>지역선택</th></tr>
		</thead>
		<tbody>
			<tr><td>1</td><td>서울</td></tr>
			<tr><td>2</td><td>경기도</td></tr>
			<tr><td>3</td><td>충청남도</td></tr>
			<tr><td>4</td><td>충청북도</td></tr>
			<tr><td>5</td><td>전라남도</td></tr>
			<tr><td>6</td><td>전라북도</td></tr>
			<tr><td>7</td><td>경상남도</td></tr>
			<tr><td>8</td><td>경상북도</td></tr>
			<tr><td>9</td><td>강원도</td></tr>
			<tr><td>10</td><td>제주도</td></tr>
			<tr><td>99</td><td>해외</td></tr>
		</tbody>
    </table>


<!-- <table>에 DataTables 적용하기 -->
<script type="text/javascript">
$(document).ready(function(){
	
	$('#foo-table').dataTable();
	
}); 
</script>

<!-- 주의할 점은 .dataTable()과 .DataTable()을 주의해야 합니다. -->

<!-- 대문자 또는 소문자로 작성해도 동작은 하지만 소문자 .dataTable() 로 작성한 경우에는
 반환값이 jQuery 오브젝트이고, 대문자 .DataTable()로 작성한 경우에는 반환값이 DataTable의 API 오브젝트가 됩니다. -->

<!-- .dataTable()의 경우 .dataTable().api()를 사용하여 API 오브젝트를 취득할 수 있습니다. -->

</body>
</html>