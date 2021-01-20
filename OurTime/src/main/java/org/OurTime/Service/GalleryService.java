package org.OurTime.Service;

import java.util.ArrayList;

import org.OurTime.DTO.GallCriteria;
import org.OurTime.DTO.GalleryDTO;



public interface GalleryService {
	
	//insert
	public void PostGallery_Write(GalleryDTO gdto);
	//List
	public ArrayList<GalleryDTO> list2(GallCriteria gcri);
	//paging
	public int getTotal();
	//select
	public GalleryDTO detail(GalleryDTO gdto);
	//update
	public void PostGallery_Update(GalleryDTO gdto);
	//delete
	public void Gallery_Delete(GalleryDTO gdto);
}
