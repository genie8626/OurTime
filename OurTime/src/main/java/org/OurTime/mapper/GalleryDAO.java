package org.OurTime.mapper;

import java.util.ArrayList;

import org.OurTime.DTO.GallCriteria;
import org.OurTime.DTO.GalleryDTO;


public interface GalleryDAO {
	
	
	//insert
	public void PostGallery_Write(GalleryDTO gdto);
	//List
	public ArrayList<GalleryDTO> list2(GallCriteria bcri);
	//paging
	public int getTotal();
	//select
	public GalleryDTO detail(GalleryDTO bdto);
	//update
	public void PostGallery_Update(GalleryDTO gdto);
	//delete
	public void Gallery_Delete(GalleryDTO gdto);
}
