package com.validator.comment.service.impl;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.validator.comment.dao.CommentDao;
import com.validator.comment.model.Comment;
import com.validator.comment.model.ResponseBean;
import com.validator.comment.services.CommentService;

public class CommentServiceImpl implements CommentService {
	
	@Autowired
	CommentDao commentDao;
	
	private static Logger log = Logger.getLogger(CommentServiceImpl.class);

	public ResponseBean moderateComment(Comment comment) {
		ResponseBean response = new ResponseBean();
		log.debug("validating the comment with id :-" + comment.getCommentId());
		try {
			if(checkIfMessageIsValid(comment.getCommentMessage()) == true) {
				commentDao.addComment(comment);
			}
			else {
				response.setVaid(false);
				response.setResponseMessage("InAppropiate Commnets not Allowed");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("An error occurred while saving a new comment to the mongo database", e);
			response.setVaid(false);
			response.setResponseMessage("error in storing the comment");
			
		}
		return response;
	}
	
	private static boolean checkIfMessageIsValid(String message) {
		String[] blockedWords =  new String[] {"poop", "sht", "fcuk"};
		boolean res = Arrays.stream(blockedWords).anyMatch(itr -> message.contains(itr.toLowerCase()));
		return res;
	}

}
