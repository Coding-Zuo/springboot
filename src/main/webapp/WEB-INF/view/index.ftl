<html>
<head>
    <title>Mybatis分页插件 - 测试页面</title>
    <meta charset="utf-8"/>
</head>
<body>
<div class="wrapper">
    
    <h1>${name}</h1>
    <ul>
    	<#list userList as item>
    	<li>${item.name}生日是：${item.birthday?string('yyyy-MM-dd') }</li>
    	</#list>
    	<li>${map.name }</li>
    </ul>
</div>
</body>
</html>