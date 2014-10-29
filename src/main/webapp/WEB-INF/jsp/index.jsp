<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<style type="text/css">
		body, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;}
		#golist {display: none;}
		@media (max-device-width: 780px){#golist{display: block !important;}}
	</style>
	<script type="text/javascript" src="http://api.map.baidu.com/api?type=quick&ak=${config.baiduMapAk }&v=1.0"></script>
	<title>地图官网展示效果</title>
	<script type="text/javascript" src="/static/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="/static/js/foundation.min.js"></script>
</head>
<body>
	<div id="allmap"></div>
</body>
<script type="text/javascript">
	$(function(){
		$.getJSON('/location/ip',function(data){
			// 百度地图API功能
			var map = new BMap.Map("allmap");            // 创建Map实例
			var point = new BMap.Point(data.content.point.x, data.content.point.y); // 创建点坐标
			map.centerAndZoom(point,15);                 // 初始化地图,设置中心点坐标和地图级别。
			map.addControl(new BMap.ZoomControl());      //添加地图缩放控件
		});
	});
</script>
</html>

