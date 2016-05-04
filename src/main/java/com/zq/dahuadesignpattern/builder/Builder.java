package com.zq.dahuadesignpattern.builder;

/**
 * Created by Intellij IDEA
 * Date: 16-5-4
 * Time: 下午11:27
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public interface Builder {

    void buildPartA();
    void buildPartB();

    Product getProduct();


}
