package org.OurTime.Service;

import org.OurTime.DTO.MemberDTO;

public interface MemberService {

	//ȸ������ �� �Է�
		public void PostSignUp(MemberDTO mdto);
	//�α���
		public MemberDTO PostSignIn(MemberDTO mdto);
	//MyProfile
		public MemberDTO MyProfile(MemberDTO mdto);
	//MyProfile_Update
		public void PostMyProfile_Update(MemberDTO mdto);
	//MyProfile_Update
		public void MyProfile_Delete(MemberDTO mdto);
		
}
