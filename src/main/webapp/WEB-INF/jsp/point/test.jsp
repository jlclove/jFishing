<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<script src="/static/js/vendor/jquery.js"></script>
	<script src="/static/js/vendor/template-native.js"></script>
</head>
<body>
<script id="test" type="text/html">
	{{name}}
</script>
<script type="text/javascript">
	var data = {
			name:'abc'
	}
	var html = template('test',data);
	console.log(html);
</script>
</body>
</html>
