package com.odas.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component 等价于 <bean id="user" class="com.odas.pojo.User"/>
// id 默认类名小写
// component 就是组件的意思，使用这个注解，说明这个类被spring管理了(被注册到Spring中)，就是bean
@Component
public class User {
    // 相当于<property name="name" value="Odas"/>
    @Value("Odas")
    public String name;
}
