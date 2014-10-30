<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
<meta name="viewport"
	content="initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
<meta name="format-detection" content="telephone=no" searchtype="map">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<style type="text/css">
html {
	height: 100%
}

body {
	height: 100%;
	margin: 0px;
	padding: 0px
}

#container {
	height: 100%
}
</style>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=1.5&ak=${config.baiduMapAk }"></script>
<title>地图官网展示效果</title>
<script type="text/javascript" src="/static/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="/static/js/foundation.min.js"></script>
</head>
<body>
	<div id="container"></div>
</body>
<script type="text/javascript">
	$(function() {
		// 百度地图API功能
		var map = new BMap.Map("container"); // 创建Map实例
		var control  = new BMap.GeolocationControl({showAddressBar:false,
													enableAutoLocation:true});
		map.addControl(control);
		map.addControl(new BMap.MapTypeControl());
		
		control.addEventListener('locationSuccess', function(){});
		control.addEventListener('locationError', function(){console.log(1111);});
	});
</script>
</html>

