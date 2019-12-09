package com.validator.comment.services;

import org.springframework.stereotype.Service;

import com.validator.comment.model.Comment;

@Service("CommentService")
public interface CommentService {

	public Boolean moderateComment(Comment comment);

}
