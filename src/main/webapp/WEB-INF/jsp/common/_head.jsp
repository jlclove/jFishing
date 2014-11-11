<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="_include.jsp" %>
<!doctype html>
<html class="no-js" lang="en">
<head>
<meta charset="utf-8">
<!-- If you delete this meta tag World War Z will become a reality -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>${param.title}</title>
<link href="/static/css/normalize.css" rel="stylesheet">
<link href="/static/css/foundation.css" rel="stylesheet">
<link href="/static/css/main.css" rel="stylesheet">
<script src="/static/js/vendor/modernizr.js"></script>
<script src="/static/js/vendor/underscore-min.js"></script>
<script src="/static/js/vendor/template-native.js"></script>
<script type="text/javascript" src="/static/js/vendor/jquery.js"></script>
<script type="text/javascript" src="/static/js/foundation.min.js"></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=1.5&ak=${config.baiduMapAk }"></script>
</head>
<body>