package org.OurTime.Service;

import org.OurTime.DTO.MemberDTO;

public interface MemberService {

	//회원가입 폼 입력
		public void PostSignUp(MemberDTO mdto);
	//로그인
		public MemberDTO PostSignIn(MemberDTO mdto);
	//MyProfile
		public MemberDTO MyProfile(MemberDTO mdto);
	//MyProfile_Update
		public void PostMyProfile_Update(MemberDTO mdto);
	//MyProfile_Update
		public void MyProfile_Delete(MemberDTO mdto);
		
}
