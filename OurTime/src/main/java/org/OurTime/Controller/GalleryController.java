package org.OurTime.Controller;

import javax.servlet.http.HttpSession;

import org.OurTime.DTO.GalleryDTO;
import org.OurTime.DTO.MemberDTO;
import org.OurTime.Service.GalleryService;
import org.OurTime.Service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class GalleryController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
@Autowired 
GalleryService gservice;
GalleryDTO gdto;
@Autowired 
MemberService mservice;
MemberDTO mdto;
	
	//������ ȭ��(model�� ��Ƽ� ȭ�� �ѷ��ֱ�)
	@RequestMapping(value="Gallery_Detail", method=RequestMethod.GET)
	public void Gallery_Detail(Model model, GalleryDTO gdto) {
		System.out.println("Gallery_Detail");
		model.addAttribute("detail", gservice.detail(gdto));
	}
	//�� ���� �ִ� ȭ�� (Profile�� �ִ� �۾��� �����ͼ� model�� ȭ�鿡 �Ѹ���)
	@RequestMapping(value = "Gallery_Write", method=RequestMethod.GET)
	public void Gallery_Write(MemberDTO mdto, Model model) {
		System.out.println("aaa="+mdto);
		model.addAttribute("MyProfile", mservice.MyProfile(mdto));
		
	}
	//�۾��� ��ư�� ������ �� ���� ���(insert)
	@RequestMapping(value = "Gallery_Write1", method=RequestMethod.POST)
	public String PostGallery_Write(GalleryDTO gdto, Model model) {
		System.out.println("Gallery_Write1");
		
		gservice.PostGallery_Write(gdto);
		model.addAttribute("loadSult","success");
		return "redirect:/";
	}
	//����ȭ��
	@RequestMapping(value="Gallery_Update", method=RequestMethod.GET)
	public void Gallery_Update(Model model, GalleryDTO gdto) {
		System.out.println("Gallery_Update");
		model.addAttribute("detail", gservice.detail(gdto));
	}
	//������ư �������� ����
	@RequestMapping(value="Gallery_Update1",method=RequestMethod.POST)
	public String Gallery_Update1(GalleryDTO gdto, RedirectAttributes rttr) {
		System.out.println("Gallery_Update1="+gdto);
		gservice.PostGallery_Update(gdto);
		 rttr.addAttribute("no", gdto.getNo());
		return "redirect:/";
	}
	
	
	
	//������ư ������ �� (redirect�� ���� )
	@RequestMapping(value="Gallery_Delete", method=RequestMethod.POST)
	public String Gallery_Delete(GalleryDTO gdto) {
		gservice.Gallery_Delete(gdto);
		return "redirect:/Gallery_Delete1";
	}
	//����
	@RequestMapping(value="Gallery_Delete1", method=RequestMethod.GET)
	public void Gallery_Delete() {
		
	}
	
	
}
