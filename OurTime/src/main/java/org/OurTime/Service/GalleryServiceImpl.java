package org.OurTime.Service;

import java.util.ArrayList;

import org.OurTime.DTO.GallCriteria;
import org.OurTime.DTO.GalleryDTO;
import org.OurTime.mapper.GalleryAttachDAO;
import org.OurTime.mapper.GalleryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GalleryServiceImpl implements GalleryService{
@Autowired
GalleryDAO gdao;
@Autowired
GalleryAttachDAO gattdao;
//insert
	public void PostGallery_Write(GalleryDTO gdto) {
		gdao.PostGallery_Write(gdto);
		System.out.println("첨부파일 여부 = "+gdto.getAttachList());
		if(gdto.getAttachList()!=null) {
			gdto.getAttachList().forEach(attach->{
				attach.setNo(gdto.getNo());
				gattdao.insert(attach);
				
			});
		}
	}
	//List
	public ArrayList<GalleryDTO> list2(GallCriteria bcri){
		return gdao.list2(bcri);
	}
	
	//paging
	public int getTotal() {
		return gdao.getTotal();
	}
	//select
	public GalleryDTO detail(GalleryDTO gdto) {
		return gdao.detail(gdto);
	}
	//update
	public void PostGallery_Update(GalleryDTO gdto) {
		System.out.println("gdto service="+gdto);
		gdao.PostGallery_Update(gdto);
		gdto.getAttachList().forEach(attach->{
			attach.setNo(gdto.getNo());
			gattdao.Update(attach);
			
		});
	}
	//delete
	public void Gallery_Delete(GalleryDTO gdto) {
		gdao.Gallery_Delete(gdto);
	}
	
	
	
	
	}

