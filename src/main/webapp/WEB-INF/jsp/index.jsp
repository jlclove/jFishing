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
<link href="/static/css/main.css" rel="stylesheet">
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
		$.getJSON('/api/baidu/location/ip', function(data) {
			var map = new BMap.Map("container");
			var point = new BMap.Point(data.content.point.x,
					data.content.point.y);
			map.centerAndZoom(point, 18);
			map.addControl(new BMap.ScaleControl());
			var la = map.getBounds();
			$.getJSON('/point/getPointListInRange?startLatitude=' + la.zc
					+ '&endLatitude=' + la.wc + '&startLongitude=' + la.yc
					+ '&endLongitude=' + la.vc,
					function(data) {
						for (var i = 0; i < data.result.length; i++) {
							map.addOverlay(createMark(data.result[i]));
						}
					});
		});
		
		createMark = function(point){
			var marker = new BMap.Marker(new BMap.Point(point.latitude,
					point.longitude));
			marker.addEventListener("click", function(type) {
				this.openInfoWindow(new BMap.InfoWindow(
						'<div class="infoWindow"><p class="title">'
								+ point.typeName
								+ '（ID：' + point.id
								+ '）</p><p>'
								+ point.remark
								+ '</p></div>'));
			});
			return marker;
		}
	});
</script>
</html>

