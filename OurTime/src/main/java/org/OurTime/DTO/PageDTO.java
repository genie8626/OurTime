package org.OurTime.DTO;

public class PageDTO {
	private int startPage;
	private int endPage;
	private int total;
	private boolean prev;
	private boolean next;
	private GallCriteria gcri;
	
	public PageDTO(GallCriteria gcri, int total) {
		this.gcri=gcri;
		this.total=total;
		
		this.endPage=(int)(Math.ceil(gcri.getPageNum()/10.0))*10;
		this.startPage=this.endPage-9;
		
		int nowendPage=(int)(Math.ceil((total*1.0)/gcri.getInAmount()));
		
		if(nowendPage<endPage) {
			this.endPage=nowendPage;	
		}
		this.prev=this.startPage>1;
		this.next=this.endPage<nowendPage;
	}
	
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public GallCriteria getGcri() {
		return gcri;
	}
	public void setGcri(GallCriteria gcri) {
		this.gcri = gcri;
	}
	
	
}
