/**
 * 
 */
function btn_click(src){
	if(src=="Update"){
		//action  
		frm2.action="MyProfile_Update";
		//method
		frm2.method="post";
	}else{
		//action
		frm2.action="MyProfile_Delete"
		//method
		frm2.method="post"
	}
	
	
}