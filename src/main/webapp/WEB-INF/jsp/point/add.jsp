<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<jsp:include page="../common/_head.jsp">
	<jsp:param value="添加渔点" name="title"/>
</jsp:include>
<%@ include file="../common/_menu.jsp" %>
<a href="#" data-reveal-id="addPoint">添加此处为渔点</a>

<%@ include file="../common/_foot.jsp" %>

<div id="addPoint" class="reveal-modal" data-reveal>
  <h2>Awesome. I have it.</h2>
  <p class="lead">Your couch.  It is mine.</p>
  <p>I'm a cool paragraph that lives inside of an even cooler modal. Wins!</p>
  <a class="close-reveal-modal">&#215;</a>
</div>


 
<a href="#" data-dropdown="drop1" >Has Hover Dropdown</a>
<ul id="drop1" class="f-dropdown" data-dropdown-content>
  <li><a href="#">This is a link</a></li>
  <li><a href="#">This is another</a></li>
  <li><a href="#">Yet another</a></li>
</ul>

<a href="#" data-dropdown="hover1" data-options="is_hover:true">Has Hover Dropdown</a>
<ul id="hover1" class="f-dropdown" data-dropdown-content>
  <li><a href="#">This is a link</a></li>
  <li><a href="#">This is another</a></li>
  <li><a href="#">Yet another</a></li>
</ul>
<script type="text/javascript">
$(document).foundation({
	  dropdown: {
	    // specify the class used for active dropdowns
	    active_class: 'open'
	  }
	});
</script>