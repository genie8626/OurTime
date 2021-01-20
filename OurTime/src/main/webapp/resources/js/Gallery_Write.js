/**
 * 
 */
function btn_click(src){
	//등록버튼을 눌렀을 때
	if(src=="write"){	//submit
		//action
		frm4.action="Gallery_Write1";
		//method
		frm4.method="post";
	}else{	//button
		location.href="/OurTime";
		
	}
}
function checkIt(){
	//제목, 내용, upload파일을 등록안한경우
	var title=$("#title").val();
	var content=$("#content").val();
	var upload=$("#upload").val();
	if(title=="" || content=="" || upload==""){
		alert("제목, 내용, 사진첨부는 필수 입력입니다.");
		return false;
	}
}