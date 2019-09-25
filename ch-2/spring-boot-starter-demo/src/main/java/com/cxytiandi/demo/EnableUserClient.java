package com.cxytiandi.demo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

/**
 * 定义启动自动配置的注解
 *
 * @Import({UserAutoConfigure.class})，通过导入的方式实现把 UserAutoConfigure
 * 实例加入 SpringIOC 容器中，这样就能开启自动配置了
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({UserAutoConfigure.class})
public @interface EnableUserClient {

}
