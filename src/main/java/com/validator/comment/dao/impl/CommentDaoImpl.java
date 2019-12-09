package com.validator.comment.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.validator.comment.dao.CommentDao;
import com.validator.comment.model.Comment;

@Repository
@Qualifier("CommentDao")
public class CommentDaoImpl implements CommentDao {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public void addComment(Comment comment) {
		mongoTemplate.save(comment);
	}

}
