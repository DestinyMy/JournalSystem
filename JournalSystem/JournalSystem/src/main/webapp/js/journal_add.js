/**
 * 
 */
$(document).ready(function(){
	getJournalSub();
})
//刚添加期刊的登记ID
var regid = 0;

//得到征订表中的信息
function getJournalSub(){
	$.ajax({
		url:'/JournalSystem/magazine/magazinesublist.do',
		type:'post',
		data:'',
		cache:'false',
		success:function(data){
			for(var i=0;i<data['journallist'].length;i++){
				var html = '<option value="'+data['journallist'][i]['journalName']+'">'+data['journallist'][i]['journalName']+'</option>';
				$('#journal-name').append(html);
			}
		}
	})
}

//确定目录表中是否已有期刊记录
function isExistiInMenu(){
	var journalName = $('#journal-name').val()
	$.ajax({
		url:'/JournalSystem/magazine/existInMenu.do',
		type:'post',
		data:{'journalName':journalName},
		cache:'false',
		success:function(data){
			//如果返回的数据是false，代表目录表中没有数据，需要添加进目录
			$("#menu").html('');
			if(data=='false'){
				var html = '<div class="col-md-2 title">CN刊号</div>'+
                ' <div class="col-md-10 data">'+
                 '	<input id="cnNumber" name="cnNumber" value="">'+
                ' </div>'+
                 
                ' <div class="col-md-2 title">ISSN</div>'+
                ' <div class="col-md-10 data">'+
                ' 	<input id="issn" name="issn" value="">'+
                ' </div>'+
                 
                ' <div class="col-md-2 title">邮发代号</div>'+
                ' <div class="col-md-10 data">'+
                ' <input id="postNumber" name="postNumber" value="">'+
                '</div>'+
                ' <div class="col-md-2 title">出版周期</div>'+
               '  <div class="col-md-10 data">'+
                ' <select id="pubcycle" name="pubcycle" class="form-control" >'+
                '    <option value="0">月刊</option>'+
               '     <option value="1">年刊</option>'+
                ' </select>'+
               '  </div>'+
                 
               '  <div class="col-md-2 title">出版地</div>'+
                ' <div class="col-md-10 data">'+
                ' 	<input id = "pubplace" name="pubplace" class="form-control" placeholder="出版地">'+
               '  </div>'+
                 
               '  <div class="col-md-2 title">主办单位</div>'+
               '  <div class="col-md-10 data">'+
                ' 	<input id = "pubhost" name="pubhost" class="form-control" placeholder="主办单位">'+
                ' </div>'
                $("#menu").append(html);
			}
		}
	})
}

//改变tab的active的状态,将期刊数据放入登记表和目录表
function activateTab(name){
	var submenu = $('#menu').html();
	//期刊名称
	var journalName = $('#journal-name').val();
	//年
	var pubyear = $('#pubyear').val();
	//卷
	var pubvolume = $('#pubvolume').val();
	//期
	var pubphase = $('#pubphase').val();
	//期刊数量
	var pubnumer = $('#pubnumer').val();
	if(submenu!=''){
		//CN刊号
		var cnnumber = $('#cnNumber').val();
		//ISSN
		var issn = $('#issn').val();
		//邮发代号
		var postNumber = $('#postNumber').val();
		//出版周期
		var pubcycle = $('#pubcycle').val();
		//出版地
		var pubplace = $('#pubplace').val();
		var pubhost = $('#pubhost').val();
		console.log(pubplace);
		console.log(pubhost);
		$.ajax({
			url:'/JournalSystem/magazine/addJournalMenu.do',
			type:'post',
			data:{'journalName':journalName,
				  'cnnumber':cnnumber,
				  'issn':issn,
				  'postNumber':postNumber,
				  'pubcycle':pubcycle,
				  'pubplace':pubplace,
				  'pubhost':pubhost},
				  
			cache:'false',
			success:function(data){
				alert('目录数据插入成功')
			}
		})
	}
	$.ajax({
		url:'/JournalSystem/magazine/addJournalReg.do',
		type:'post',
		data:{'journalName':journalName,
			  'pubyear':pubyear,
			  'pubvolume':pubvolume,
			  'pubphase':pubphase,
			  'pubnumer':pubnumer},
		cache:'false',
		success:function(data){
			regid = data['regid'];
			alert('登记数据插入成功')
		}
	})
	$('#'+name).click()
}

//增加关键词
function addkeyword(){
	var html = 
		'<div>'+
        '<div class="col-md-2 title">关键词</div>'+
        '<div class="col-md-10 data">'+
        '      <input class="form-control" placeholder="关键词">'+	            	 
        '</div>'+
        '</div>';
	$('#keyword-group').append(html);
		
}

//增加作者
function addAuthor(){
 var html = '<input id="author-input" style="width:6em;display:inline"class="form-control" placeholder="">';
 $('.glyphicon-plus').before(html);
}

// 增加期刊内容
function addJournalDetails(){
// 期刊名称
	var journalName = $('#journal-name').val();
// 年
	var pubyear = $('#pubyear').val();
// 卷
	var pubvolume = $('#pubvolume').val();
// 期
	var pubphase = $('#pubphase').val();
//	获取论文题目
	var papertitle = $('#papertitle').val();
	
// 获取作者
	var paperauthor = '';
	$('#paperauthor input').each(function(){
		paperauthor+=this.value+" ";
	})
	
//获取关键字
	var paperkeyword='';
	$('#keyword-group input').each(function(){
		paperkeyword+=this.value+" ";
	})
//获取文章开始页码
	var paperpagestart = $('#paperpagestart').val();
//获取文章结束页码
	var paperpageend = $('#paperpageend').val();
	$.ajax({
		url:'/JournalSystem/magazine/addJournalDetail.do',
		type:'post',
		data:{'journalName':journalName,
			  'pubyear':pubyear,
			  'pubvolume':pubvolume,
			  'pubphase':pubphase,
			  'papertitle':papertitle,
			  'paperauthor':paperauthor,
			  'paperkeyword':paperkeyword,
			  'paperpagestart':paperpagestart,
			  'paperpageend':paperpageend,
			  'regid':regid},
		cache:'false',
		success:function(data){
			alert("success");
			//对填入的内容进行初始化
			$('#papertitle').val('');
			$('#paperauthor').html(
					  '<input style="width:6em;display:inline"class="form-control" placeholder="">'+
	                  '<div sytle="display:inline" onClick="addAuthor()" class="glyphicon glyphicon-plus"></div>'            	       		
			);	
			$('#keyword-group').html(
					'<div class="col-md-2 title">关键词</div>'+
	                '<div id="paperkeyword" class="col-md-10 data">'+
	                '     <input class="form-control" placeholder="关键词">'+            	 
	                '</div>'
			);
			$('#paperpagestart').val('');
			$('#paperpageend').val('');
//			window.location.reload();
		}
	})
}


