package com.cxytiandi.cache_data_redis.service;

/**
 * 方法回调接口，用于执行回调的业务逻辑
 * @param <O>
 * @param <I>
 */
public interface Closure<O, I> {
	public O execute(I input);
}
