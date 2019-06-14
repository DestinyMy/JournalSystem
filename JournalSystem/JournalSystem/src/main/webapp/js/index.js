
function getCookie(cookieName){
	    var cookieObj={},
	          cookieSplit=[],
	          // 以分号（;）分组
	          cookieArr=document.cookie.split(";");
	    for(var i=0,len=cookieArr.length;i<len;i++)
	        if(cookieArr[i]) {
	            // 以等号（=）分组
	            cookieSplit=cookieArr[i].split("=");
	            // Trim() 是自定义的函数，用来删除字符串两边的空格
	            cookieObj[cookieSplit[0].trim()]=cookieSplit[1].trim();
	        }
	    return cookieObj[cookieName];
}

function usermsg(){
	//获取个人信息
	var userid = getCookie("user");
	if(userid!=undefined){
		$.ajax({
			url:'/JournalSystem/user/info.do',
			type:'post',
			data:{"id":userid},
			cache:'false',
			success:function(data){
				$("#user-id").append(userid);
				$("#user-name").append(data['userName']);
			}
		})
		//查迅借阅情况
		borrowSit();
		
	}else{
		alert("您还未登录，请先登录 ");
	
	}
	//获取借阅信息
}

function borrowSit(){
	var userid = getCookie("user");
	$.ajax({
		url:'/JournalSystem/borrowlog.do',
		type:'post',
		data:{"userid":userid},
		cache:'false',
		success:function(data){
			$("#borrow-body").html("");
			$("#back-body").html("");
			for(var i=0;i<data['borrowDoc'].length;i++){
				var html = 
					'<tr id="row_'+data['borrowDoc'][i]['id']+'">'+			                              
					'<td>'+data['borrowDoc'][i]['journalname']+'</td>'+
					'<td>'+data['borrowDoc'][i]['pubyear']+'</td>'+
					'<td>'+data['borrowDoc'][i]['pubvolume']+'</td>' +    
					'<td>'+data['borrowDoc'][i]['pubphase']+'</td>' +  
					'<td>'+(data['borrowDoc'][i]['state']==0?"未归还":(data['borrowDoc'][i]['state']==1?"已归还，等待确认":"确认归还"))+'</td>' +  
					'<td class="text-center">'+                                    
					(data['borrowDoc'][i]['state']==0?'<button type="button" onClick="doBack('+data['borrowDoc'][i]['id']+')" class="btn btn-success btn-xs">归还</button>':'<span></span>')+               
					'</td>'+
					'</tr>';
				if(data['borrowDoc'][i]['state']==0){
					$("#borrow-body").append(html);
				}
				if(data['borrowDoc'][i]['state']!=0){
					$("#back-body").append(html);
				}
			}
		}
	})
}

//归还期刊
function doBack(id){
	$.ajax({
		url:'/JournalSystem/doback.do',
		type:'post',
		data:{"id":id},
		cache:'false',
		success:function(data){
			alert(data['info']);
			
			borrowSit();
		}
	})
}

//带参数跳转到搜索结果页面
function searchPage(){
	theme = $("#select").val()
	text = $("#input").val()
	var baseurl = 'http://localhost:8080/JournalSystem/searchPage.do?'+"theme="+theme+"&text="+text;
	window.location.href = baseurl;
	
}