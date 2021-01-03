<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="Generator" content="EditPlus®">
    <meta name="Author" content="">
    <meta name="Keywords" content="">
    <meta name="Description" content="">
    <title>freemarker</title>
</head>
<body>
<#include "head.ftl"/>
<h1>Hello EveryOne!!</h1>
欢迎用户:${name!'空值'}
        ${uname!'没有'}<br/><hr/>
<#if name??>
${name}
</#if>
<#if uname??>
    ${uname}
</#if>
<hr/>
<#if age&gt;40>
    ${age}
</#if>
<#if age==90>
    福如东海
</#if>
<hr/>

<#list list as i>
    <li>书本名：${i.bookName}</li>
</#list>







</body>
</html>
