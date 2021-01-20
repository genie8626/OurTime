package org.OurTime.Service;

import org.OurTime.DTO.MemberDTO;
import org.OurTime.mapper.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
@Autowired
MemberDAO mdao;
	//회원가입
	public void PostSignUp(MemberDTO mdto) {
		mdao.PostSignUp(mdto);
	}
	//로그인
	public MemberDTO PostSignIn(MemberDTO mdto) {
	return mdao.PostSignIn(mdto);
		}
	//MyProfile
	public MemberDTO MyProfile(MemberDTO mdto) {
	System.out.println("이게 왜 실행이 안되지???");
	return mdao.MyProfile(mdto);
	}
	//MyProfile_Update
	public void PostMyProfile_Update(MemberDTO mdto) {
		mdao.PostMyProfile_Update(mdto);
	}
	//MyProfile_Update
	public void MyProfile_Delete(MemberDTO mdto) {
		mdao.MyProfile_Delete(mdto);
	}
	



}
