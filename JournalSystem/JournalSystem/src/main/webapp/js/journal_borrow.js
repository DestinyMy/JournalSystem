$(document).ready(function(){
	search_borrow(0,'');
})

function search_borrow(option,text){
	$.ajax({
		url:'/JournalSystem/searchborrow.do',
		type:'post',
		data:'',
		cache:false,
		async: false,
		success:function(data){
			$('#borrowhistory').html('');
			for(var i=0;i<data['borrowreg'].length;i++){
				var html = '<tr>'+
	            '<td><input  type="checkbox"></td>'+	
	            '<td>'+data['borrowreg'][i]['userid']+'</td>'+
	            '<td>'+data['borrowreg'][i]['username']+'</td>'+
	            '<td>'+data['borrowreg'][i]['journalname']+'</td>'+	                              
	            '<td>'+data['borrowreg'][i]['pubyear']+'</td>'+
	            '<td>'+data['borrowreg'][i]['pubvolume']+'</td>'+
	            '<td>'+data['borrowreg'][i]['pubphase']+'</td>'+
	            '<td>'+(data['borrowreg'][i]['state']==0?'未还':(data['borrowreg'][i]['state']==1?'归还待审核':"已确认归还"))+'</td>'+		                                  
	            '<td class="text-center">'+                                          
	           	  (data['borrowreg'][i]['state']==1?('<button type="button" onClick="verify('+data['borrowreg'][i]['id']+')"  class="btn bg-olive btn-xs">确认归还</button>'):('<button type="button" disabled="disabled" class="btn btn-warning bg-olive btn-xs">无权操作</button>'))+                  
	            '</td>'+ 
	        '</tr>';
				if(option==0||(option==1&&data['borrowreg'][i]['state']==0)||(option==2&&data['borrowreg'][i]['state']==1)||(option==3&&data['borrowreg'][i]['state']==2)){
					if(text==''||data['borrowreg'][i]['journalname'].indexOf(text)>=0){
						$('#borrowhistory').append(html);
					}
				}
			}
			
		}
	});
}

//按条件查询
function searchByCondition(){
	var option =  $('#con-select').val();
	var text = $('#con-input').val();
	search_borrow(option,text);
}
function verify(id){
	$.ajax({
		url:'/JournalSystem/verifyback.do',
		type:'post',
		data:{'id':id},
		cache:false,
		async: false,
		success:function(data){
			alert(data['info']);
			searchByCondition();
		}
	});
	
}