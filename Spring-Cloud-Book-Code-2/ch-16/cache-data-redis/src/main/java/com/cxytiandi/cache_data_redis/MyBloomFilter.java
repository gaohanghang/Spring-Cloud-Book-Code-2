package com.cxytiandi.cache_data_redis;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class MyBloomFilter {
	public static void main(String[] args) {
		// 总数量
		int total = 1000000;
		BloomFilter<CharSequence> bf = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8), total);
		/*
			布隆过滤器存在一定的错误率，我们可以调节布隆过滤器的错误率，在create的时候指定第 3 个参数来指定错误率
		 */
		//BloomFilter<CharSequence> bf = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8), total, 0.0003);
		// 初始化 1000000 条数据到过滤器中
		for (int i = 0; i < total; i++) {
			bf.put("" + i);
		}
		// 判断值是否存在过滤器中
		int count = 0;
		for (int i = 0; i < total + 10000; i++) {
			if (bf.mightContain("" + i)) {
				count++;
			}
		}
		System.out.println(" 匹配数量 " + count);
	}
}
