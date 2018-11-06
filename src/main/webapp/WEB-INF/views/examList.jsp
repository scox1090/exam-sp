<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
</head>
<body>
${dxPath}
<script>
var AjaxUtil = function(){
	var xhr = new XMLHttpRequest();
	function init(conf){
		xhr.open(conf.method,conf.uri);
		xhr.onreadystatechange = function(){
			if(xhr.readyState==4){
				if(xhr.status==200){
					conf.cb(xhr.responseText);
				}
			}
		}
	}
	this.send = function(conf){
		init(conf);
		xhr.send();
	}
} 

var au = new AjaxUtil();
var dxGrid;
function doInit(){
	dxGrid = new dhtmlXGridObject('rDiv');
	dxGrid.setImagePath('${dxPath}/codebase/imgs/');
	dxGrid.setHeader('번호,이름,나이');
	dxGrid.setColumnIds('num,name,age');
	dxGrid.setColTypes('ro,ed,ed');
	dxGrid.init();
	
	document.querySelector('#btn').onclick = function(){
		var uri = document.querySelector('#query').value;
		var conf = {uri:uri,method:'GET',cb:function(res){
			res = JSON.parse(res);
			dxGrid.parse(res,'js');
			//document.querySelector('#rDiv').innerHTML = res;
		}};
		au.send(conf);
	}
}
window.addEventListener('load',doInit);
</script>

<input type="text" id="query"><button id="btn">가져오기</button>
<div id="rDiv" style="width:400px;height:300px"></div>
</body>
</html>