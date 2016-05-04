package com.zq.dahuadesignpattern.builder;

/**
 * Created by Intellij IDEA
 * Date: 16-5-4
 * Time: 下午11:35
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class Director {
    public Product construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
        return builder.getProduct();
    }
}
