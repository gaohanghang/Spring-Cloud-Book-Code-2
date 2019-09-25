package com.cxytiandi.cache_guava;

import java.util.concurrent.TimeUnit;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class App {
	public static void main(String[] args) {
		final PersonDao dao = new PersonDao();
		/*
			通过 CacheBuilder 构建一个缓存对象，设置写入数据 1 分钟后过期
			，在 load 方法中加字数据库的数据，然后通过 CacheBuilder 对象的 get 方法获取数据。
			如果缓存中存在数据则从数据库中获取数据返回，如果缓存中不存在对应的数据则只需 load 中的逻辑，
			从数据库中查询数据并缓存。

			expireAfterAccess，当缓存项在指定的时间段内没有被读或写就会被回收。这种策略类似于基于容量回收策略。

			expireAfterWrite，当缓存项在指定的时间段内没有更新就会被回收。
		 */
		LoadingCache<String, Person> cahceBuilder = CacheBuilder.newBuilder().expireAfterWrite(1, TimeUnit.SECONDS)
				.build(new CacheLoader<String, Person>() {
					@Override
					public Person load(String key) throws Exception {
						return dao.findById(key);
					}
				});

		try {
			for(;;) {
				Person person = cahceBuilder.get("1");
				System.out.println(person.getName());
				Thread.sleep(200);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
