package org.OurTime.Controller;

import javax.servlet.http.HttpSession;

import org.OurTime.DTO.MemberDTO;
import org.OurTime.Service.MemberService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
@Autowired 
MemberService mservicce;
	
	//회원가입화면
	@RequestMapping(value="SignUp", method=RequestMethod.GET)
	public void SignUp() {
		
	}
	//회원가입을 눌렀을 때 (insert)
	@RequestMapping(value="SignUp", method=RequestMethod.POST)
	public String PostSignUp(MemberDTO mdto) {
		mservicce.PostSignUp(mdto);
		return "redirect:/";
	}
	//로그인 화면 
	@RequestMapping(value="SignIn", method=RequestMethod.GET)
	public void SignIn() {
	}
	//정보 입력 후 로그인을 눌렀을때
	@RequestMapping(value = "PostSignIn", method=RequestMethod.POST)
	public String PostSignIn(MemberDTO mdto, RedirectAttributes rttr, HttpSession session) {
		MemberDTO result=mservicce.PostSignIn(mdto);
		if(result==null){ //select 했을 때 그 값이 없으면
			rttr.addFlashAttribute("check","fail");
			return "redirect:/SignIn";
		}else {			//select했을 때 값이 같으면 
			session.setAttribute("loginEmail", result.getEmail());
			session.setAttribute("loginUserName", result.getUserName());
			
			System.out.println("session 값="+session.getAttribute("loginEmail"));
			return "redirect:/";
		}
	}
	//로그아웃
	@RequestMapping(value="SignOut", method=RequestMethod.GET)
	public String SignOut(HttpSession session) {
		//session에 저장되어 있는 값을 제거
		session.invalidate();
		return "redirect:/";
	}
	//개인정보화면(select해서 model로 뿌려주기)
	@RequestMapping(value="MyProfile", method=RequestMethod.GET)
	public void MyProfile(MemberDTO mdto, Model model) {
		model.addAttribute("MyProfile", mservicce.MyProfile(mdto));
	}
	//개인정보 수정화면
	@RequestMapping(value = "MyProfile_Update", method=RequestMethod.POST)
	public void MyProFile_Update(MemberDTO mdto , Model model) {
		model.addAttribute("MyProfile", mservicce.MyProfile(mdto));
		
	}
	//수정버튼눌렀을때 최종수정
	@RequestMapping(value = "MyProfile_Update2", method=RequestMethod.POST)
	public String PostMyProfile_Update(MemberDTO mdto,  RedirectAttributes rttr) {
		mservicce.PostMyProfile_Update(mdto);
		rttr.addAttribute("Email",mdto.getEmail()); //"변수명","값"
		return "redirect:/";
	}
	//탈퇴하기 눌렀을 때 탈퇴되기(redirect로 탈퇴화면)
	@RequestMapping(value = "MyProfile_Delete", method=RequestMethod.POST)
	public String MyProfile_Delete(MemberDTO mdto, HttpSession session) {
		session.invalidate();
		mservicce.MyProfile_Delete(mdto);
		return "redirect:/MyProfile_Delete1";
	}
	//탈퇴화면
	@RequestMapping(value="MyProfile_Delete1", method=RequestMethod.GET)
	public void MyProfile_Delete() {
		
	}



}
