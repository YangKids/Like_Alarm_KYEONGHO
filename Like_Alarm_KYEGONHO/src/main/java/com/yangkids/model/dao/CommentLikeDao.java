package com.yangkids.model.dao;

import com.yangkids.model.dto.CommentLike;

public interface CommentLikeDao {
	int findCommentLike(CommentLike commentLike); 

	void Commentlikeup(CommentLike commentLike);

	void CommentlikeDown(CommentLike commentLike);
}
