package org.OurTime.DTO;

public class GallCriteria {
	
	private int pageNum;
	
	private int inAmount;

	@Override
	public String toString() {
		return "GallCriteria [pageNum=" + pageNum + ", inAmount=" + inAmount + "]";
	}

	public GallCriteria() {
		this(1,10);
	}
	public GallCriteria(int pageNum, int inAmount) {
		this.pageNum=pageNum;
		this.inAmount=inAmount;
	}
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getInAmount() {
		return inAmount;
	}

	public void setInAmount(int inAmount) {
		this.inAmount = inAmount;
	}
	
	
}
