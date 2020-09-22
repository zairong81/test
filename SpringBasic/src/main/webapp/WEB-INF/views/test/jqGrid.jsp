<!DOCTYPE html>

<html lang="en">
<head>
 <!-- The jQuery library is a prerequisite for all jqSuite products -->
    <script type="text/ecmascript" src="/resources/jqGrid/js/jquery-1.7.2.min.js"></script> 
    <!-- We support more than 40 localizations -->
    <script type="text/ecmascript" src="/resources/jqGrid/js/i18n/grid.locale-en.js"></script>
    <!-- This is the Javascript file of jqGrid -->   
    <script type="text/ecmascript" src="/resources/jqGrid/js/jquery.jqGrid.min.js"></script>
    <!-- This is the localization file of the grid controlling messages, labels, etc.
    <!-- A link to a jQuery UI ThemeRoller theme, more than 22 built-in and many more custom -->
    <link rel="stylesheet" type="text/css" media="screen" href="/resources/jquery-ui/jquery-ui.css" />
    <!-- The link to the CSS that the grid needs -->
    <link rel="stylesheet" type="text/css" media="screen" href="/resources/jqGrid/css/ui.jqgrid.css" />
   <meta charset="utf-8" />
    <title>jqGrid Loading Data - JSON</title>
</head>
<body>
    <table id="jqGrid"></table>
    <div id="jqGridPager"></div>
<script type="text/javascript"> 
	

$(document).ready(function () {

		$("#jqGrid").jqGrid({
		url: 'data.json',
		datatype: "json",
		 colModel: [
			{ label: 'Category Name', name: 'CategoryName', width: 75 },
			{ label: 'Product Name', name: 'ProductName', width: 90 },
			{ label: 'Country', name: 'Country', width: 100 },
			{ label: 'Price', name: 'Price', width: 80, sorttype: 'integer' },
			// sorttype is used only if the data is loaded locally or loadonce is set to true
			{ label: 'Quantity', name: 'Quantity', width: 80, sorttype: 'number' }                   
		],
		viewrecords: true, // show the current page, data rang and total records on the toolbar
		width: 780,
		height: 200,
		rowNum: 30,
		loadonce: true, // this is just for the demo
		pager: "#jqGridPager"
	});
});

 </script>

    
</body>
</html>