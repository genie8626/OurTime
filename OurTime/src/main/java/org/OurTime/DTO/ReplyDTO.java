package org.OurTime.DTO;

public class ReplyDTO {
	private int no;
	private int replyno;
	private String email;
	private String reply_cont;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getReplyno() {
		return replyno;
	}
	public void setReplyno(int replyno) {
		this.replyno = replyno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReply_cont() {
		return reply_cont;
	}
	public void setReply_cont(String reply_cont) {
		this.reply_cont = reply_cont;
	}
	@Override
	public String toString() {
		return "ReplyDTO [no=" + no + ", replyno=" + replyno + ", email=" + email + ", reply_cont=" + reply_cont + "]";
	}
	
	
	
}
