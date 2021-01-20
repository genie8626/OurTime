package org.OurTime.Service;

import java.util.ArrayList;

import org.OurTime.DTO.ReplyDTO;
import org.OurTime.mapper.ReplyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService  {
	@Autowired
	ReplyDAO rdao;
	
	@Override
	//´ñ±Û insert
	public int replyIns(ReplyDTO rdto) {
		System.out.println("reply controller="+rdto);
		return rdao.replyIns(rdto);
	}
	//´ñ±Û List
	public ArrayList<ReplyDTO> replyList(int bno) {
		return rdao.replyList(bno);
	}
	//´ñ±Û Delete
	public int replyDel(ReplyDTO rdto) {
		return rdao.replyDel(rdto);
	}	
	//´ñ±Û Update
	public int replyUpt(ReplyDTO rdto) {
		return rdao.replyUpt(rdto);
	}
}
