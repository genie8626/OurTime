package org.OurTime.mapper;

import org.OurTime.DTO.MemberDTO;

public interface MemberDAO {

	
	//회원가입
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
