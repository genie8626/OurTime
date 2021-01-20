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
	
	//디테일 화면(model에 담아서 화면 뿌려주기)
	@RequestMapping(value="Gallery_Detail", method=RequestMethod.GET)
	public void Gallery_Detail(Model model, GalleryDTO gdto) {
		System.out.println("Gallery_Detail");
		model.addAttribute("detail", gservice.detail(gdto));
	}
	//글 쓸수 있는 화면 (Profile에 있는 글쓴이 가져와서 model로 화면에 뿌리기)
	@RequestMapping(value = "Gallery_Write", method=RequestMethod.GET)
	public void Gallery_Write(MemberDTO mdto, Model model) {
		System.out.println("aaa="+mdto);
		model.addAttribute("MyProfile", mservice.MyProfile(mdto));
		
	}
	//글쓰기 버튼을 눌렀을 때 최종 등록(insert)
	@RequestMapping(value = "Gallery_Write1", method=RequestMethod.POST)
	public String PostGallery_Write(GalleryDTO gdto, Model model) {
		System.out.println("Gallery_Write1");
		
		gservice.PostGallery_Write(gdto);
		model.addAttribute("loadSult","success");
		return "redirect:/";
	}
	//수정화면
	@RequestMapping(value="Gallery_Update", method=RequestMethod.GET)
	public void Gallery_Update(Model model, GalleryDTO gdto) {
		System.out.println("Gallery_Update");
		model.addAttribute("detail", gservice.detail(gdto));
	}
	//수정버튼 눌렀을때 수정
	@RequestMapping(value="Gallery_Update1",method=RequestMethod.POST)
	public String Gallery_Update1(GalleryDTO gdto, RedirectAttributes rttr) {
		System.out.println("Gallery_Update1="+gdto);
		gservice.PostGallery_Update(gdto);
		 rttr.addAttribute("no", gdto.getNo());
		return "redirect:/";
	}
	
	
	
	//삭제버튼 눌렀을 때 (redirect로 삭제 )
	@RequestMapping(value="Gallery_Delete", method=RequestMethod.POST)
	public String Gallery_Delete(GalleryDTO gdto) {
		gservice.Gallery_Delete(gdto);
		return "redirect:/Gallery_Delete1";
	}
	//삭제
	@RequestMapping(value="Gallery_Delete1", method=RequestMethod.GET)
	public void Gallery_Delete() {
		
	}
	
	
}
