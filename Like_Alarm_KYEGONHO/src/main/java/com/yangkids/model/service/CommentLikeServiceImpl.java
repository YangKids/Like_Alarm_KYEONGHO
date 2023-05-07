/**
 * 
 */
package com.yangkids.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangkids.model.dao.ArticleDao;
import com.yangkids.model.dao.ArticleLikeDao;
import com.yangkids.model.dao.CommentLikeDao;
import com.yangkids.model.dto.ArticleLike;
import com.yangkids.model.dto.CommentLike;

/**
 * @author user
 *
 */
@Service
public class CommentLikeServiceImpl implements CommentLikeService {

	private CommentLikeDao commentDao;
	

	@Autowired
	public void setBoardDao(CommentLikeDao commentDao) {
		this.commentDao = commentDao;
	}
	@Override
	public int selectCommentLike(CommentLike commentLike) {
		return commentDao.findCommentLike(commentLike);
	}

	@Override
	public void Commentinsert(CommentLike commentLike) {
		commentDao.Commentlikeup(commentLike);
	}
	
	@Override
	public void Commentdelete(CommentLike commentLike) {
		commentDao.CommentlikeDown(commentLike);		
	}
}
