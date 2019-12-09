package com.validator.comment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comment")
public class Comment {

	@Id
	private String commentId;

	@Indexed(unique = true)
	private String commentMessage;

	public Comment() {
		super();
	}

	public Comment(String commentId, String commentMessage) {
		super();
		this.commentId = commentId;
		this.commentMessage = commentMessage;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getCommentMessage() {
		return commentMessage;
	}

	public void setCommentMessage(String commentMessage) {
		this.commentMessage = commentMessage;
	}

}
