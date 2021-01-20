package org.OurTime.DTO;

public class GalleryAttachDTO {
	private int no;
	private String fileName;
	private String uploadPath;
	private String uuid;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getUploadPath() {
		return uploadPath;
	}
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	@Override
	public String toString() {
		return "GalleryAttachDTO [no=" + no + ", fileName=" + fileName + ", uploadPath=" + uploadPath + ", uuid=" + uuid
				+ "]";
	}
	
}
