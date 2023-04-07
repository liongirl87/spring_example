package com.ex.lesson03.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.lesson03.DAO.ReviewMapper;
import com.ex.lesson03.model.Review;
import com.ex.lesson03.model.ReviewReal;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewMapper reviewMapper;
	// input: X
	// output: Review
	public Review getReview(int id) {
		return reviewMapper.selecttReview(id);
	}
	
	// input: Review	output: 
	public int addReview(ReviewReal review) {
		return reviewMapper.insertReview(review);
	}
	
	//addReviewAsField(4, "콤비네이션R", "손오공", 5.0, "너무 맛있당!!")
	public int addReviewAsField(int storeId1212, String menu444, String userName34,
			Double point11, String review333) {
		return reviewMapper.insertReviewAsField(storeId1212, menu444, userName34, point11, review333);
	}
	
	// input: id, review	output: 성공된 행의 개수 int
	public int updateReviewById(int id, String review) {
		return reviewMapper.updateReviewById(id, review);
	}
	
	public void deleteReviewById(int id) {
		reviewMapper.deleteReviewById(id);
	}
}
