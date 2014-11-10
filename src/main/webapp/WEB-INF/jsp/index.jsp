<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="common/_include.jsp" %>
<jsp:include page="common/_head.jsp">
	<jsp:param value="私人鱼塘" name="title"/>
</jsp:include>
<%@ include file="common/_menu.jsp" %>
	<div id="container"></div>
<%@ include file="common/_foot.jsp" %>

<div id="pointModal" class="reveal-modal" data-reveal>
  <h2>添加渔点</h2>
  <p class="lead">输入相关信息.</p>
  <table cellspacing="0" cellpadding="0" class="pointAddForm">
  	<tr>
  		<td class="width33">
  			<label class="right inline">类型:</label></td><td><select name="typeId">
  							<option>鱼塘</option>
  							<option>野外鱼点</option>
  							<option>渔具店</option>
  						</select></td>
  	</tr>
  	<tr>
  		<td><label class="right inline">鱼种类：</label></td><td>
														  		<a href="#" data-dropdown="drop1" >选择鱼种类</a>
																<ul id="drop1" class="f-dropdown" data-dropdown-content>
																  <c:forEach items="${fishList }" var="fish">
																  <li class="pl_1em"><input type="checkbox" name="fishCheck" value="${fish.id }" id="fish_${fish.id}"><label for="fish_${fish.id}" class="inline">${fish.fishName}</label></li>
																  </c:forEach>
																</ul>
															</td>
  	</tr>
  	<tr>
  		<td><label class="right inline">钓鱼水深：</label></td><td><select name="waterDeep" class="left width33">
  							<c:forEach begin="20" end="400" var="i">
  								<option value="${i }">${i }厘米</option>
  							</c:forEach>
  						</select></td>
  	</tr>
  	<tr>
  		<td><label class="right inline">钓鱼费用：</label></td><td><select name="price" class="left width33">
  							<c:forEach begin="0" end="250" var="i">
  								<option value="${i }">${i }元</option>
  							</c:forEach>
  						</select>
  						<select name="unit" class="left width33 ml_1em">
  							<option>天</option>
  							<option>小时</option>
  							<option>斤</option>
  						</select></td>
  	</tr>
  	<tr>
  		<td><label class="right inline">是否可以夜钓：</label></td><td><input type="radio" value="1" name="nightFish" id="nightFishYes"><label for="nightFishYes">是</label>
  								<input type="radio" value="0" name="nightFish" id="nightFishNo" checked="checked"><label for="nightFishNo">否</label></td>
  	</tr>
	<tr>
  		<td><label class="right inline">是否方便停车：</label></td><td><input type="radio" value="1" name="easyPark" id="easyParkYes"><label for="easyParkYes">是</label>
  								<input type="radio" value="0" name="easyPark" id="easyParkNo" checked="checked"><label for="easyParkNo">否</label></td>
  	</tr>
  	<tr>
  		<td><label class="right inline">描述：</label></td><td><textarea name="remark"></textarea></td>
  	</tr>
 	<tr>
  		<td colspan="2">
  			<a href="#" class="button [radius round]">提交数据</a>
  		</td>
  	</tr>
  </table>
  <p></p>
  <a class="close-reveal-modal">&#215;</a>
</div>


<script type="text/javascript">
	$(function() {
		var pointArray = new Array();
		var focusMarker;
		var map = new BMap.Map("container");
		
	    $.getJSON('/api/baidu/location/ip', function(data) {
			var point = new BMap.Point(data.content.point.x,
					data.content.point.y);
			map.centerAndZoom(point, 18);
			map.addControl(new BMap.ScaleControl());
			loadPoint(map);
			addMapMoveEndListener(map);
			addMapClickListener(map);
		});
	    
		/* var control  = new BMap.GeolocationControl({showAddressBar:false,
			enableAutoLocation:true,locationIcon:
					new BMap.Icon('/static/img/navigation_d11feb4.png',
										new BMap.Size(75,77),{
															    anchor: new BMap.Size(0, 0),
															    infoWindowAnchor: new BMap.Size(10, 0)
															})
												 });
		map.addControl(control);
		control.addEventListener('locationSuccess', function(){
			loadPoint(map);
			addMapMoveEndListener(map);
			addMapClickListener(map);
		}); */
		
		//添加地图类型选项
		map.addControl(new BMap.MapTypeControl());
		
		//移动地图后的载入渔点
		addMapMoveEndListener = function(map){
			map.addEventListener('moveend',function(type){
				for(var i= 0; i<pointArray.length;i++){
					map.removeOverlay(pointArray[i]);
					pointArray = new Array();
				}
				loadPoint(map);
			});
		}
		
		//创建地图点击事件
		addMapClickListener = function(map){
			//点击准备创建渔点
			map.addEventListener('click',function(type,target){
				map.removeOverlay(focusMarker);
				focusMarker = new BMap.Marker(type.point);
				map.addOverlay(focusMarker);
				var a = $('<a href="#" data-reveal-id="pointModal">添加此处为渔点</a>');
				var infoWindow = new BMap.InfoWindow(
						a[0],{width:220,height:60,enableMessage:false,offset:new BMap.Size(0,-22)});
				map.openInfoWindow(infoWindow,type.point);
				a.on('click',function(){
					$('#pointModal').foundation('reveal', 'open');
				});
				infoWindow.addEventListener('clickclose',function(type,target){
					map.removeOverlay(focusMarker);
				});
			});
		}
		
		//创建渔点
		createPoint = function(point){
			var marker = new BMap.Marker(new BMap.Point(point.longitude,
					point.latitude));
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
		
		//载入渔点
		loadPoint = function(map){
			var la = map.getBounds();
			$.getJSON('/point/getPointListInRange?startLatitude=' + la.yc
					+ '&endLatitude=' + la.vc + '&startLongitude=' + la.zc
					+ '&endLongitude=' + la.wc,
					function(data) {
						for (var i = 0; i < data.result.length; i++) {
							var marker = createPoint(data.result[i]);
							pointArray.push(marker);
							map.addOverlay(marker);
						}
					});
		}
		
		
	});
</script>