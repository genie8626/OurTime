package org.OurTime.mapper;

import org.OurTime.DTO.GalleryAttachDTO;

public interface GalleryAttachDAO {
	//파일 업로드 insert
	public void insert(GalleryAttachDTO battdto);
	// 파일 업로드 update
	public void Update(GalleryAttachDTO battdto);
}
