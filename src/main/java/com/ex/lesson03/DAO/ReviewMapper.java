package com.ex.lesson03.DAO;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ex.lesson03.model.Review;
import com.ex.lesson03.model.ReviewReal;

@Repository
public interface ReviewMapper {
	
	public Review selecttReview(@Param("id") int id);
	public int insertReview(ReviewReal review);
	
	// @Param 있기 떄문에 하나의 맵이 xml로 넘어간다
	public int insertReviewAsField(
			@Param("storeId") int storeId33553,
			@Param("menu") String menu234234,
			@Param("userName") String userName2345,
			@Param("point") Double point223,
			@Param("review") String review5235);
	
	public int updateReviewById(
			@Param("id") int id,
			@Param("review") String review);
	
	public void deleteReviewById(int id);	// int로 넣어도 괜찮음 맵퍼 마음 &select는 예외
	
	
}
