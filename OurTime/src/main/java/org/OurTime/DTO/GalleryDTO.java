package org.OurTime.DTO;

import java.util.ArrayList;

public class GalleryDTO {
	private int no;
	private String title;
	private String content;
	private String email;
	private String regiDate;
	private String filename;
	
	//GalleryDTO & GalleryAttachDTO Connection
	private ArrayList<GalleryAttachDTO> attachList;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegiDate() {
		return regiDate;
	}

	public void setRegiDate(String regiDate) {
		this.regiDate = regiDate;
	}

	public ArrayList<GalleryAttachDTO> getAttachList() {
		return attachList;
	}

	public void setAttachList(ArrayList<GalleryAttachDTO> attachList) {
		this.attachList = attachList;
	}
	
	

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "GalleryDTO [no=" + no + ", title=" + title + ", content=" + content + ", email=" + email + ", regiDate="
				+ regiDate + ", filename=" + filename + ", attachList=" + attachList + "]";
	}




	
}
