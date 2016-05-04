package com.zq.dahuadesignpattern.builder;

/**
 * Created by Intellij IDEA
 * Date: 16-5-4
 * Time: 下午11:37
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class MainFrame {
    public static void main(String[] args) {

        Builder builderAB = new ConcreateBuilderAB();
        Builder builderXY = new ConcreateBuilderXY();
        Director director = new Director();

        Product productAB = director.construct(builderAB);

        Product productXY = director.construct(builderXY);

        productAB.show();
        productXY.show();
    }
}
