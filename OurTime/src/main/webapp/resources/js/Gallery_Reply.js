/**
 * 
 */

$(document).ready(function(){
	var bno=$('#no').val();	// 게시판번호
	var reno="";			// 댓글번호
	
	getList();
	
	//댓글 목록리스트
	function getList(){
		var str="";
		
		$.getJSON("replies/"+bno+".json",function(data){
			console.log(data);
			
			var replyPpl=$("#replyPpl").val(); //session
			$(data).each(function(){
				
				str+="<li eachreno="+this.replyno
				str+=" id=replies"+this.replyno+">"
				str+="<input type='hidden' id=comment"+this.replyno
				str+=" value='"+this.replyno+"'>"
				str+="<input type='text' id=content"+this.replyno
				str+=" value='"+this.reply_cont+"' readonly>"
				str+="<label>"+this.email+"</label>"
				str+="<div id=uptiv"+this.replyno+"></div>"
				if(replyPpl==this.email){
					str+="<button id='del'>삭제</button>"
					str+="<button id='upt'>수정</button>"
				}
				str+="</li>"
				
			})//댓글 목록 출력 끝
			
			$("#replies").html(str)
			
		})//getJSON 끝
		
	}//getList 끝
	
	$("#replyAddBtn").on("click",function(e){

		e.preventDefault();

		
		
		var replyText=$("#replyText").val();
		var replyPpl=$("#replyPpl").val();
		
		//alert(replyPpl);
		
		if(replyPpl==""){
			alert("로그인 후 댓글작성가능합니다.");
		}
		else{
		
			$.ajax({
				type:"post",
				url:"replies/new",
				data:JSON.stringify({no:bno,reply_cont:replyText,email:replyPpl}),
				contentType:"application/json; charset=utf-8",
				success:function(result){
					if(result=="Succeed") {
						alert("댓글이 등록되었습니다.")
						
						getList();
						//location.reload();
					}
				},
				error: function(){
					//alert("댓글쓰기에 실패하였습니다.")
				}
			})//댓글쓰기 ajax 끝
		}// else end
	})//댓글쓰기 Btn_click 끝
	
		//댓글 삭제버튼을 눌렸을 때 
	$("#replies").on("click","#del",function(e){
		e.preventDefault();
		
		var replyText=$(this).parent();
		replyno=replyText.attr("eachreno");
		//alert(replyno);
		alert("댓글을 삭제하시겠습니까?");
		
		$.ajax({
			type:"delete",
			url:"replies/del",
			data:JSON.stringify({replyno:replyno}),
			contentType:"application/json; charset=utf-8",
			
			success:function(delsult){
				if(delsult=="Deleted") {
					alert("댓글이 삭제되었습니다.")
					getList();
				}
			},
			error:function(){
				alert("삭제에 실패하였습니다.")
			}
			
		})//ajax 끝
	})//del버튼 끝
	
	//수정버튼을 눌렸을 때 
	$("#replies").on("click","#upt",function(e){
		alert("수정할까요?")
		e.preventDefault();
		
		var replyText=$(this).parent();
		replyno=replyText.attr("eachreno");
		
		var content=$("#content"+replyno).val();
		var uptstr="";
		uptstr+="<div><textarea id=replyText"+replyno
		+" name='replyText' rows='3' cols='50'>"+content
		+"</textarea><br>"
		+"<button id='commentUpt'>댓글 수정</button></div>"
		
		$("#uptiv"+replyno).html(uptstr);
	});//upt 끝
	
	//eachreno
	$("#replies").on("click","#commentUpt",function(e){
		e.preventDefault();
		
		var replyText=$("#replyText"+replyno).val();
		
		//alert(replyText)
		
		$.ajax({
			type:"put",
			url:"replies/upt",
			contentType:"application/json; charset=utf-8",
			data:JSON.stringify({replyno:replyno, reply_cont:replyText}),
			
			success:function(upsult){
				if(upsult=="Updated"){
					alert("댓글이 수정되었습니다.");
					getList();
				}
			},
			error:function() {
				alert("댓글수정에 실패하였습니다.");
			}
			
		})//ajax 끝		
		
	})//eachreno 끝
	
	
	
})//ready 끝
