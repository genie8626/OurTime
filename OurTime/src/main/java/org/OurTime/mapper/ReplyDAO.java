package org.OurTime.mapper;

import java.util.ArrayList;

import org.OurTime.DTO.ReplyDTO;


public interface ReplyDAO {
	//댓글 insert
	  public int replyIns(ReplyDTO rdto);	
	//댓글 list(select)
	  public ArrayList<ReplyDTO> replyList(int bno);
	//댓글 delete
	  public int replyDel(ReplyDTO rdto); 
	//댓글 update
	  public int replyUpt(ReplyDTO rdto);
}
