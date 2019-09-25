package com.cxytiandi.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPorperties.class)
public class UserAutoConfigure {

	/**
	 * 使用配置开启 Starter 自动构建
	 *
	 * 通过 @ConditionalOnProperty 来指定是否开启配置
	 *
	 * 通过下面的配置，只有当启动类加了 @EnableUserClient 并且配置文件中
	 * spring.user.enable=true 的时候才会自动配置 UserClient
	 *
	 * @param userPorperties
	 * @return
	 */
	@Bean
	@ConditionalOnProperty(prefix = "spring.user",value = "enabled",havingValue = "true")
	public UserClient userClient(UserPorperties userPorperties) {
		return new UserClient(userPorperties);
	}

}
