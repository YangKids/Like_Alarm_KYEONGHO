package com.yangkids.model.service;

import org.springframework.stereotype.Service;

import com.yangkids.model.dto.ArticleLike;
import com.yangkids.model.dto.CommentLike;

@Service
public interface CommentLikeService {
	public int selectCommentLike(CommentLike commentLike);
	public void Commentinsert(CommentLike commentLike);
	public void Commentdelete(CommentLike commentLike);
}
