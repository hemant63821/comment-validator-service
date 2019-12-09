package com.validator.comment.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.validator.comment.dao.CommentDao;
import com.validator.comment.model.Comment;
import com.validator.comment.services.CommentService;

public class CommentServiceImpl implements CommentService {
	
	@Autowired
	CommentDao commentDao;
	
	private static Logger log = Logger.getLogger(CommentServiceImpl.class);

	public Boolean moderateComment(Comment comment) {
		boolean output = false;
		log.debug("validating the comment with id :-" + comment.getCommentId());
		try {
			commentDao.addComment(comment);
		} catch (Exception e) {
			e.printStackTrace();
			output = false;
			log.error("An error occurred while saving a new comment to the mongo database", e);
		}
		return output;
	}

}
