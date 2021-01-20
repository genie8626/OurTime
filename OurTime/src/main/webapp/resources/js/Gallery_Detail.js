/**
 * 
 */

function btn_click(src){
	if(src=="Update"){
		//action
		frm5.action="Gallery_Update";
		//method
		frm5.method="get";
	}else{
		//action
		frm5.action="Gallery_Delete"
		//method
		frm5.method="post"
	}
}