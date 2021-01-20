package org.OurTime.Service;

import java.util.ArrayList;

import org.OurTime.DTO.ReplyDTO;




public interface ReplyService {
	//댓글 insert
	public int replyIns(ReplyDTO rdto);
	//댓글 List
	public ArrayList<ReplyDTO> replyList(int bno);
	//댓글 update
	public int replyUpt(ReplyDTO rdto);
	//댓글 delete
	public int replyDel(ReplyDTO rdto);
}
