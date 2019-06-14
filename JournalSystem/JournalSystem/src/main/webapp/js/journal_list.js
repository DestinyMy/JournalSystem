/**
 * 
 */
$(document).ready(function(){
	getList();
})
function getList(){
	$.ajax({
		url:'/JournalSystem/magazine/magazinesublist.do',
		type:'POST',
		data:'',
		cache:false,
		success:function(data){
			for(var i=0;i<data['journallist'].length;i++){
				var html = 
					'<tr id="row_'+data['journallist'][i]['id']+'">'+
					'<td><input  type="checkbox"></td>'+			                              
					'<td>'+data['journallist'][i]['postNumber']+'</td>'+
					'<td>'+data['journallist'][i]['journalName']+'</td>'+
					'<td>'+data['journallist'][i]['subscriptYear']+'</td>' +                              
					'<td class="text-center">'+                                    
					'  <button type="button" onclick="deletejournal('+data['journallist'][i]['id']+')" class="btn bg-olive btn-xs">删除</button>   '+               
					'</td>'+
					'</tr>'
				$('#journal-body').append(html);
			}	
		},
		error:function(data){
		}
	})
}

function deletejournal(id){
	$.ajax({
		url:'/JournalSystem/magazine/deleteJournalsub.do',
		type:'POST',
		data:{'id':id},
		cache:false,
		success:function(data){
			$('#row_'+id).remove();
		},
		error:function(data){
		}
	})
}