package com.ex.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.lesson02.bo.UsedGoodsBO;
import com.ex.lesson02.model.UsedGoods;

@RestController
public class Lesson02Ex01RestController {

	
	@Autowired
	private UsedGoodsBO usedGoodsBO;
	
	// http://localhost/lesson02/ex01
	@RequestMapping("/lesson02/ex01")
	public List<UsedGoods> ex01() {
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
		return usedGoodsList; // list => JSON String Response body에 들어감
		
		
	}
}
