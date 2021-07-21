package com.odas.config;

import com.odas.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 这个也会被spring容器托管，注册到容器中，因为他本来就是一个@Component，
// @Configuration就代表这是一个配置类，就和我们之前看到的beans.xml，
// 所以如果光用这个配置类来管理pojo，那么其实User那里的@Component是不需要的，但习惯还是写了吧
@Configuration
// ComponentScan可以不写，写了就手动指定一下要扫描的包，不写应该是全目录扫描
@ComponentScan("com.odas.pojo")
// Import 导入另外一个配置文件
@Import(OdasConfig2.class)
public class OdasConfig {

    /**
     * 1. getUser拿到是因为@bean已经注册了，把component注解去掉一样可以拿到
     * 2. 注册一个bean就相当于我们之前写的一个标签
     * 3. 这个方法的名字，就相当于bean标签中的id属性
     * 4. 这个方法的返回值，就相当于bean标签中的class属性
     */
    @Bean
    // 方法名就是bean的名字
    public User getUser() {
        // 就是返回要注入到bean的对象
        return new User();
    }
}
