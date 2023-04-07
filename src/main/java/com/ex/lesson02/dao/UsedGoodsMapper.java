package com.ex.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ex.lesson02.model.UsedGoods;

@Repository
public interface UsedGoodsMapper {
	
	// input: X
	// output: List<UsedGoods>
	public List<UsedGoods> selectUsedGoodsList();

}
