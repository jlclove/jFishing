<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="common/_include.jsp"%>
<jsp:include page="common/_head.jsp">
	<jsp:param value="私人鱼塘" name="title" />
</jsp:include>
<%@ include file="common/_menu.jsp"%>
<div id="container"></div>
<%@ include file="common/_foot.jsp"%>

<div id="pointAddModal" class="reveal-modal" data-reveal>
	<h2>添加渔点</h2>
	<p class="lead">输入相关信息.</p>
	<table cellspacing="0" cellpadding="0" class="pointAddForm">
		<tr>
			<td class="width33"><label class="right inline">类型:</label></td>
			<td><select name="typeId">
					<c:forEach items="${pointTypeList }" var="pointType">
						<option value="${pointType.id }">${pointType.typeName }</option>
					</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td><label class="right inline">鱼种类：</label></td>
			<td><a href="#" data-dropdown="drop1" id="fishNames">选择鱼种类</a>
				<ul id="drop1" class="f-dropdown" data-dropdown-content>
					<c:forEach items="${fishList }" var="fish">
						<li class="pl_1em"><input type="checkbox" name="fishCheck"
							value="${fish.id }" id="fish_${fish.id}" /><label
							for="fish_${fish.id}" class="inline">${fish.fishName}</label></li>
					</c:forEach>
				</ul></td>
		</tr>
		<tr>
			<td><label class="right inline">钓鱼水深：</label></td>
			<td><select name="waterDeep" class="left width33">
					<c:forEach begin="20" end="400" var="i">
						<option value="${i}">${i }厘米</option>
					</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td><label class="right inline">钓鱼费用：</label></td>
			<td><select name="price" class="left width33">
					<c:forEach begin="0" end="250" var="i">
						<option value="${i }">${i }元</option>
					</c:forEach>
			</select> <select name="unit" class="left width33 ml_1em">
					<option>天</option>
					<option>小时</option>
					<option>斤</option>
			</select></td>
		</tr>
		<tr>
			<td><label class="right inline">是否可以夜钓：</label></td>
			<td><input type="radio" value="1" name="nightFish"
				id="nightFishYes"><label for="nightFishYes">是</label> <input
				type="radio" value="0" name="nightFish" id="nightFishNo"
				checked="checked"><label for="nightFishNo">否</label></td>
		</tr>
		<tr>
			<td><label class="right inline">是否方便停车：</label></td>
			<td><input type="radio" value="1" name="easyPark"
				id="easyParkYes"><label for="easyParkYes">是</label> <input
				type="radio" value="0" name="easyPark" id="easyParkNo"
				checked="checked"><label for="easyParkNo">否</label></td>
		</tr>
		<tr>
			<td><label class="right inline">描述：</label></td>
			<td><textarea name="remark"></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><a href="javascript:void(0);"
				class="button radius" id="submitButton">提交数据</a>
				<div data-alert class="alert-box alert radius"
					style="display: none;"></div></td>
		</tr>
	</table>
	<p></p>
	<a class="close-reveal-modal">&#215;</a>
</div>


<div id="pointDetailModal" class="reveal-modal" data-reveal>
	<%-- 		<tr>
			<td><label class="right inline">鱼种类：</label></td>
			<td><%=data.fishNames%></td>
		</tr>
		<tr>
			<td><label class="right inline">钓鱼水深：</label></td>
			<td><%=data.waterDeep%>厘米</td>
		</tr>
		<tr>
			<td><label class="right inline">钓鱼费用：</label></td>
			<td><%=data.price%> <%=data.unit%></td>
		</tr>
		<tr>
			<td><label class="right inline">是否可以夜钓：</label></td>
			<td><%=data.nightFish%></td>
		</tr>
		<tr>
			<td><label class="right inline">是否方便停车：</label></td>
			<td></td>
		</tr>
		<tr>
			<td><label class="right inline">描述：</label></td>
			<td></td>
		</tr>
		<tr>
			<td colspan="2"><a href="javascript:void(0);"
				class="button radius" id="submitButton">关闭</a></td>
		</tr>
 --%>
	</table>
</div>

<script id="detail" type="text/html">
	<h2>渔点详情</h2>
        <table cellspacing="0" cellpadding="0" class="pointAddForm">
		<tr>
			<td class="width33"><label class="right inline">类型:</label></td>
			<td><label class="inline">{{typeName}}</label></td>
		</tr>
 		<tr>
			<td><label class="right inline">鱼种类：</label></td>
			<td><label class="inline">{{fishNames}}</label></td>
		</tr>
		<tr>
			<td><label class="right inline">钓鱼水深：</label></td>
			<td><label class="inline">{{waterDeep}} 厘米</label></td>
		</tr>
		<tr>
			<td><label class="right inline">钓鱼费用：</label></td>
			<td><label class="inline">{{price}}元/{{unit}}</label></td>
		</tr>
		<tr>
			<td><label class="right inline">是否可以夜钓：</label></td>
			<td><label class="inline">{{if nightFish}}是{{else}}否{{/if}}</label></td>
		</tr>
		<tr>
			<td><label class="right inline">是否方便停车：</label></td>
			<td><label class="inline">{{if easyPark}}是{{else}}否{{/if}}</label></td>
		</tr>
		<tr>
			<td><label class="right inline">描述：</label></td>
			<td><label class="inline">{{remark}}</label></td>
		</tr>
	</table>
	<p></p>
	<a class="close-reveal-modal">&#215;</a>
</script>

<script type="text/javascript">
	$(function() {
		var pointArray = [];
		var focusMarker;
		var map = new BMap.Map("container");

		/* 	$.getJSON('/api/baidu/location/ip', function(data) {
				var point = new BMap.Point(data.content.point.x,
						data.content.point.y);
				map.centerAndZoom(point, 18);
				map.addControl(new BMap.ScaleControl());
				loadPoint();
				addMapMoveEndListener(map);
				addMapClickListener(map);
			}); */

		//手机定位
		var control = new BMap.GeolocationControl({
			showAddressBar : true,
			enableAutoLocation : true,
			locationIcon : new BMap.Icon('/static/img/navigation_d11feb4.png',
					new BMap.Size(75, 77), {
						anchor : new BMap.Size(0, 0),
						infoWindowAnchor : new BMap.Size(10, 0)
					})
		});
		map.addControl(control);
		control.addEventListener('locationSuccess', function() {
			loadPoint(map);
			addMapMoveEndListener(map);
			addMapLongPressListener(map);
		});

		//添加地图类型选项
		map.addControl(new BMap.MapTypeControl());

		//移动地图后的载入渔点
		addMapMoveEndListener = function(map) {
			map.addEventListener('moveend', function(type) {
				for (var i = 0; i < pointArray.length; i++) {
					map.removeOverlay(pointArray[i]);
					pointArray = new Array();
				}
				loadPoint();
			});
		}

		//创建地图长按事件
		addMapClickListener = function(map) {
			//点击准备创建渔点
			map.addEventListener('click', function(type, target) {
				showAddModal(type, target);
			});
		}

		//创建地图点击事件
		addMapLongPressListener = function(map) {
			//点击准备创建渔点
			map.addEventListener('longpress', function(type, target) {
				showAddModal(type, target);
			});
		}

		//显示添加渔点的层事件
		showAddModal = function(type, target) {
			removeFocusMarker();
			focusMarker = new BMap.Marker(type.point);
			map.addOverlay(focusMarker);
			var add = $('<a href="#" data-reveal-id="pointModal">添加此处为渔点</a>');
			var infoWindow = new BMap.InfoWindow(add[0], {
				width : 220,
				height : 60,
				enableMessage : false,
				offset : new BMap.Size(0, -22),
				enableCloseOnClick : false
			});
			map.openInfoWindow(infoWindow, type.point);
			add.on('click', function() {
				$('#pointAddModal').foundation('reveal', 'open');
			});
			/* 	infoWindow.addEventListener('clickclose',
						function(type, target) {
							removeFocusMarker();
						}); */
		}

		//清除当前活跃 infoWindow
		removeFocusMarker = function() {
			map.closeInfoWindow()
			map.removeOverlay(focusMarker);
		}

		//创建渔点
		createPoint = function(point) {
			var marker = new BMap.Marker(new BMap.Point(point.longitude,
					point.latitude));
			marker
					.addEventListener(
							"click",
							function(type) {
								var detail = $('<div class="infoWindow"><p class="title">'
										+ point.typeName
										+ '（ID：'
										+ point.id
										+ '）<a href="#" pointId='+point.id+' data-reveal-id="pointDetailModal" data-reveal-ajax="true">查看</a></p><p>'
										+ point.remark + '</p></div>');
								this.openInfoWindow(new BMap.InfoWindow(
										detail[0]));
								$($(detail).find('a')[0])
										.on(
												'click',
												function() {
													event.preventDefault();
													$
															.getJSON(
																	'/point/'
																			+ $(
																					this)
																					.attr(
																							'pointId'),
																	function(
																			data) {
																		var html = template(
																				'detail',
																				data.point);
																		//$('#pointDetailModal').html(html);
																		$(
																				'#pointDetailModal')
																				.html(
																						html)
																				.foundation(
																						'reveal',
																						'open');
																	});
												});
							});
			return marker;
		}

		//载入渔点
		loadPoint = function() {
			var la = map.getBounds();
			$.getJSON('/point/getPointListInRange?startLatitude=' + la.yc
					+ '&endLatitude=' + la.vc + '&startLongitude=' + la.zc
					+ '&endLongitude=' + la.wc, function(data) {
				for (var i = 0; i < data.result.length; i++) {
					var marker = createPoint(data.result[i]);
					pointArray.push(marker);
					map.addOverlay(marker);
				}
			});
		}

		$('#submitButton').on(
				'click',
				function() {
					if ($(this).hasClass('disabled')) {
						return;
					}
					$(this).addClass('disabled');
					var fishIdList = [];
					var fishNameList = [];
					_.each($('[name=fishCheck]:checked'), function(obj, index) {
						fishIdList.push($(obj).val());
						fishNameList.push($(obj).html());
					});

					$.post('/point/add', {
						typeId : $('[name=typeId]').val(),
						fishIds : fishIdList.join(','),
						waterDeep : $('[name=waterDeep]').val(),
						price : $('[name=price]').val(),
						unit : $('[name=unit]').val(),
						nightFish : $('[name=nightFish]:checked').val(),
						easyPark : $('[name=easyPark]:checked').val(),
						remark : $('[name=remark]').val(),
						latitude : focusMarker.getPosition().lat,
						longitude : focusMarker.getPosition().lng,
						fishNames : fishNameList.join(',')
					}, function(result) {
						if (result.status == 'ok') {
							$('.alert-box').removeClass('alert').addClass(
									'success').html('渔点添加成功。').fadeIn(2000)
									.fadeOut(2000);
							window.setTimeout(function() {
								$('#pointAddModal').foundation('reveal',
										'close')
							}, 2000);
							removeFocusMarker();
							loadPoint();
						} else {
							$('.alert-box').removeClass('sucess').addClass(
									'alert').html('数据添加异常，请联系管理员。')
									.fadeIn(2000).fadeOut(3000);
						}
						$(this).removeClass('disabled');
					});
				});

		$('[name=fishCheck]').click(
				function() {
					var tempFishNameList = [];
					_.each($('[name=fishCheck]:checked'), function(obj, index) {
						tempFishNameList.push($('label[for=' + obj.id + ']')
								.text());
					});
					if (tempFishNameList.length == 0) {
						$('#fishNames').html('选择鱼种类');
					} else {
						$('#fishNames').html(
								'已选择【' + tempFishNameList.join(',') + '】');
					}
				});

	});
</script>