package com.odas.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {

    /**
     * @Autowired 直接在属性上使用即可，也可以在set方式上使用
     * 1. 使用Autowired我们可以不用编写set方法(当然我在下面是写了set方法，主要是照顾不用自动装配的bean)
     * 2. @Autowired 会先根据类型进行注入，如果容器中有多个满足类型的实例，就会根据id进行注入，并不是
     * 单纯地只根据类型注入
     * 3. 如果显示定义了Autowired的属性为false(默认为true)，说明这个对象可以在容器中不存在，否则不允许为空
     * 4. 可以通过Qualifier来指定具体是哪个id的bean，注意autowire和qualifier要一起出现，是一套
     * 5. 还有一个叫@Resource的类似注解，这个是java的注解，和autowire的区别是resource是先byName搜在byType搜的
     */
    @Autowired (required = false)
    @Qualifier (value = "cat1")
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
