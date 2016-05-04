package com.zq.dahuadesignpattern.builder;

/**
 * Created by Intellij IDEA
 * Date: 16-5-4
 * Time: 下午11:31
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class ConcreateBuilderXY implements Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("Part X");
    }

    @Override
    public void buildPartB() {
        product.add("Part Y");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
