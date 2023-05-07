package com.yangkids.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yangkids.model.dto.ArticleLike;
import com.yangkids.model.dto.CommentLike;
import com.yangkids.model.service.ArticleLikeService;
import com.yangkids.model.service.CommentLikeService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api")
@Api(tags="댓글 좋아요 컨트롤러")
public class CommentLikeRestController {
	
	@Autowired
	private CommentLikeService commentLikeService;
	
	@GetMapping("/Commentlike")
	public ResponseEntity<?> findCommentLike(CommentLike commentId, CommentLike userId){
		int CommentlikeCnt = commentLikeService.selectCommentLike(commentId);
		return new ResponseEntity<Integer>(CommentlikeCnt, HttpStatus.OK);
	}
	
	@PostMapping("/Commentlikeup")
	public ResponseEntity<?> Commentlikeup(@RequestBody CommentLike commentLike, CommentLike commentId, CommentLike userId) {
		if(commentLikeService.selectCommentLike(commentLike)==0) {			
			commentLikeService.Commentinsert(commentLike);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);		
	}
	
	@DeleteMapping("/CommentlikeDown")
	public ResponseEntity<?> Commentlikedown(@RequestBody CommentLike commentLike, CommentLike commentId, CommentLike userId){
		if(commentLikeService.selectCommentLike(commentLike)==1) {
			commentLikeService.Commentdelete(commentLike);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);			
	}
}
