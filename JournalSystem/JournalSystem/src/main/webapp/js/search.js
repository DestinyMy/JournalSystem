$(document).ready(function(){
	search();
})

//解决中文乱码

function getQueryString(name) { 
	  var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
	  var r = window.location.search.substr(1).match(reg); 
	  if (r != null) return decodeURI(r[2]); return null; 
}
function search(){
	//根据路径提取参数
	var theme = getQueryString("theme");
	var text = getQueryString("text");
	//根据期刊名称进行查找
	if(theme=='1'){
		$.ajax({
			url:'/JournalSystem/doSearchbyMagname.do',
			type:'post',
			data:{"text":text},
			cache:false,
			async: false,
			success:function(data1){
				$("#search-outcome").html("");
				//根据信息查期刊目录表
				for(var i=0;i<data1['outcome'].length;i++){
					$.ajax({
						url:'/JournalSystem/magazine/selectMenu.do',
						type:'post',
						data:{"journalName":data1['outcome'][i]['journalName']},
						cache:false,
						async: false,
						success:function(data2){
							var html = '<div class="panel panel-default">'+
										' <div class="panel-heading">'+
										 ' 	<div class="row">'+
											  '<div class="col-md-6">'+
											    	'<a href="/JournalSystem/magazinehotdetailid/'+data1['outcome'][i]['id']+'.do" sytle="cursor:pointer"><strong style="font-size:1.5em">'+data1['outcome'][i]['journalName']+'</strong></a>'+
											    	'&emsp;&emsp;'+
											    	'<span class="glyphicon glyphicon-tag"></span>'+
											    	'<span>'+data1['outcome'][i]['pubyear']+'年'+data1['outcome'][i]['pubvolume']+'卷'+data1['outcome'][i]['pubphase']+'期</span>'+
											  '</div>'+
											'</div>'+
										  '</div>'+
										'<div class="panel-body">'+
											'<div class="row">'+
											  '<div class="col-md-3"><span class="label label-primary">出版机构</span>&emsp;'+data2['menuitem']['pubhost']+'</div>'+
											 ' <div class="col-md-3"><span class="label label-primary">CN刊号</span>&emsp;'+data2['menuitem']['cnnumber']+'</div>'+
											'  <div class="col-md-3"><span class="label label-primary">馆藏复本</span>&emsp;'+data1['outcome'][i]['pubnumer']+'</div>'+
											'</div>'+
											'<div class="row">'+
											'<div class="col-md-3"><span class="label label-primary">出版地</span>&emsp;'+data2['menuitem']['pubplace']+'</div>'+
											'<div class="col-md-3"><span class="label label-primary">邮发代号</span>&emsp;'+data2['menuitem']['postNumber']+'</div>'+
											'<div class="col-md-3"><span class="label label-primary">可借复本</span>&emsp;'+(parseInt(data1['outcome'][i]['pubnumer'])-parseInt(data1['outcome'][i]['pubbor']))+'</div>'+
											'</div>'+
										 ' </div>'+
										'</div>'+
									'</div>';
							$("#search-outcome").append(html);
						}
					});
				}
			}
		})
	}
	
	else{
		$.ajax({
			url:'/JournalSystem/doSearchfromDetail.do',
			type:'post',
			data:{"theme":theme,"text":text},
			cache:false,
			async: false,
			success:function(data1){
				console.log(data1);
				$("#search-outcome").html("");
				for(var i=0;i<data1['outcome'].length;i++){
					$.ajax({
						url:'/JournalSystem/magazine/selectMenu.do',
						type:'post',
						data:{"journalName":data1['outcome'][i]['journalName']},
						cache:false,
						async: false,
						success:function(data2){
							var html;
							if(theme=='2'){
								html = '<div class="panel panel-default">'+
								' <div class="panel-heading">'+
								 ' 	<div class="row">'+
									  '<div class="col-md-12">'+
									    	'<strong style="font-size:1.5em">'+data1['outcome'][i]['papertitle']+'</strong>'+
									    	'&emsp;<a href="/JournalSystem/magazinehotdetailid/'+data1['outcome'][i]['regid']+'.do" sytle="cursor:pointer"><strong style="font-size:1.2em">('+data1['outcome'][i]['journalName']+')</strong></a>'+
									    	'&emsp;&emsp;'+
									    	'<span class="glyphicon glyphicon-tag"></span>'+
									    	'<span>'+data1['outcome'][i]['pubyear']+'年'+data1['outcome'][i]['pubvolume']+'卷'+data1['outcome'][i]['pubphase']+'期</span>'+
									    	'&emsp;&emsp;'+
									    	'<span class="glyphicon glyphicon-user"></span>'+
									    	'&emsp;<span>作者：'+data1['outcome'][i]['paperauthor']+'</span>'+
									    	'&emsp;&emsp;'+
									    	'<span class="glyphicon glyphicon-file"></span>'+
									    	'&emsp;<span>页码：'+data1['outcome'][i]['paperpagestart']+'~'+data1['outcome'][i]['paperpageend']+'</span>'+
									  '</div>'+
									'</div>'+
								  '</div>'+
								'<div class="panel-body">'+
									'<div class="row">'+
									  '<div class="col-md-3"><span class="label label-primary">出版机构</span>&emsp;'+data2['menuitem']['pubhost']+'</div>'+
									 ' <div class="col-md-3"><span class="label label-primary">CN刊号</span>&emsp;'+data2['menuitem']['cnnumber']+'</div>'+
									'</div>'+
									'<div class="row">'+
									'<div class="col-md-3"><span class="label label-primary">出版地</span>&emsp;'+data2['menuitem']['pubplace']+'</div>'+
									'<div class="col-md-3"><span class="label label-primary">邮发代号</span>&emsp;'+data2['menuitem']['postNumber']+'</div>'+
									'</div>'+
								 ' </div>'+
								'</div>'+
							'</div>';
							}
							else if(theme=='3'){
									html = '<div class="panel panel-default">'+
									' <div class="panel-heading">'+
									 ' 	<div class="row">'+
										  '<div class="col-md-12">'+
										    	'<strong style="font-size:1.5em">'+data1['outcome'][i]['papertitle']+'</strong>'+
										    	'&emsp;<a href="/JournalSystem/magazinehotdetailid/'+data1['outcome'][i]['regid']+'.do" sytle="cursor:pointer"><strong style="font-size:1.2em">('+data1['outcome'][i]['journalName']+')</strong></a>'+
										    	'&emsp;&emsp;'+
										    	'<span class="glyphicon glyphicon-tag"></span>'+
										    	'<span>'+data1['outcome'][i]['pubyear']+'年'+data1['outcome'][i]['pubvolume']+'卷'+data1['outcome'][i]['pubphase']+'期</span>'+
										    	'&emsp;&emsp;'+
										    	'<span class="glyphicon glyphicon-user"></span>'+
										    	'&emsp;<span>作者：'+data1['outcome'][i]['paperauthor']+'</span>'+
										    	'&emsp;&emsp;'+
										    	'<span class="glyphicon glyphicon-file"></span>'+
										    	'&emsp;<span>页码：'+data1['outcome'][i]['paperpagestart']+'~'+data1['outcome'][i]['paperpageend']+'</span>'+
										  '</div>'+
										'</div>'+
									  '</div>'+
									'<div class="panel-body">'+
										'<div class="row">'+
										  '<div class="col-md-3"><span class="label label-primary">出版机构</span>&emsp;'+data2['menuitem']['pubhost']+'</div>'+
										 ' <div class="col-md-3"><span class="label label-primary">CN刊号</span>&emsp;'+data2['menuitem']['cnnumber']+'</div>'+
										'</div>'+
										'<div class="row">'+
										'<div class="col-md-3"><span class="label label-primary">出版地</span>&emsp;'+data2['menuitem']['pubplace']+'</div>'+
										'<div class="col-md-3"><span class="label label-primary">邮发代号</span>&emsp;'+data2['menuitem']['postNumber']+'</div>'+
										'</div>'+
										'<div class="row">'+
										'<div class="col-md-12"><span class="label label-primary">关键词</span>&emsp;'+data1['outcome'][i]['paperkeyword']+'</div>'+
										'</div>'+
									 ' </div>'+
									'</div>'+
								'</div>';
							}
							$("#search-outcome").append(html);
						}
					});
				}
			}
		});
	}
}