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
	
	//ȸ������ȭ��
	@RequestMapping(value="SignUp", method=RequestMethod.GET)
	public void SignUp() {
		
	}
	//ȸ�������� ������ �� (insert)
	@RequestMapping(value="SignUp", method=RequestMethod.POST)
	public String PostSignUp(MemberDTO mdto) {
		mservicce.PostSignUp(mdto);
		return "redirect:/";
	}
	//�α��� ȭ�� 
	@RequestMapping(value="SignIn", method=RequestMethod.GET)
	public void SignIn() {
	}
	//���� �Է� �� �α����� ��������
	@RequestMapping(value = "PostSignIn", method=RequestMethod.POST)
	public String PostSignIn(MemberDTO mdto, RedirectAttributes rttr, HttpSession session) {
		MemberDTO result=mservicce.PostSignIn(mdto);
		if(result==null){ //select ���� �� �� ���� ������
			rttr.addFlashAttribute("check","fail");
			return "redirect:/SignIn";
		}else {			//select���� �� ���� ������ 
			session.setAttribute("loginEmail", result.getEmail());
			session.setAttribute("loginUserName", result.getUserName());
			
			System.out.println("session ��="+session.getAttribute("loginEmail"));
			return "redirect:/";
		}
	}
	//�α׾ƿ�
	@RequestMapping(value="SignOut", method=RequestMethod.GET)
	public String SignOut(HttpSession session) {
		//session�� ����Ǿ� �ִ� ���� ����
		session.invalidate();
		return "redirect:/";
	}
	//��������ȭ��(select�ؼ� model�� �ѷ��ֱ�)
	@RequestMapping(value="MyProfile", method=RequestMethod.GET)
	public void MyProfile(MemberDTO mdto, Model model) {
		model.addAttribute("MyProfile", mservicce.MyProfile(mdto));
	}
	//�������� ����ȭ��
	@RequestMapping(value = "MyProfile_Update", method=RequestMethod.POST)
	public void MyProFile_Update(MemberDTO mdto , Model model) {
		model.addAttribute("MyProfile", mservicce.MyProfile(mdto));
		
	}
	//������ư�������� ��������
	@RequestMapping(value = "MyProfile_Update2", method=RequestMethod.POST)
	public String PostMyProfile_Update(MemberDTO mdto,  RedirectAttributes rttr) {
		mservicce.PostMyProfile_Update(mdto);
		rttr.addAttribute("Email",mdto.getEmail()); //"������","��"
		return "redirect:/";
	}
	//Ż���ϱ� ������ �� Ż��Ǳ�(redirect�� Ż��ȭ��)
	@RequestMapping(value = "MyProfile_Delete", method=RequestMethod.POST)
	public String MyProfile_Delete(MemberDTO mdto, HttpSession session) {
		session.invalidate();
		mservicce.MyProfile_Delete(mdto);
		return "redirect:/MyProfile_Delete1";
	}
	//Ż��ȭ��
	@RequestMapping(value="MyProfile_Delete1", method=RequestMethod.GET)
	public void MyProfile_Delete() {
		
	}



}
