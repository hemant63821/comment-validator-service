package com.validator.comment.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.validator.comment.model.Comment;
import com.validator.comment.model.ResponseBean;
import com.validator.comment.services.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {

	private static Logger log = Logger.getLogger(CommentController.class);

	@Resource(name = "commentService")
	private CommentService commentService;

	@RequestMapping(value = "/postComment", method = RequestMethod.POST, produces = "application/json")
	public ResponseBean validateComments(@RequestBody Comment request) {
		ResponseBean response = new ResponseBean();
		if (request.getCommentMessage() == null || request.getCommentMessage().isEmpty()) {
			response.setVaid(false);
			response.setResponseMessage("Please Provide some message");
		} else {
			commentService.moderateComment(request);
		}
		return response;
	}
}
