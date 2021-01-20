/**
 * 
 */
function btn_click(src){

	if(src=="Update"){	//submit
		alert("update");
		frm4.action="Gallery_Update1";
		frm4.method="post";
	}else{				//button
		location.href="/OurTime";
		
	}
}
function checkIt(){
	var title=$("#title").val();
	var content=$("#content").val();
	var upload=$("#upload").val();
	if(title=="" || content=="" || upload==""){
		alert("제목, 내용, 사진첨부는 필수 입력입니다.");
		return false;
	}
}