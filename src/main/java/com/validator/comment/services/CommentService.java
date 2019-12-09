package com.validator.comment.services;

import org.springframework.stereotype.Service;

import com.validator.comment.model.Comment;
import com.validator.comment.model.ResponseBean;

@Service("CommentService")
public interface CommentService {

	public ResponseBean moderateComment(Comment comment);

}
