package com.zq.dahuadesignpattern.factorymethod;

/**
 * Created by Intellij IDEA
 * Date: 16-5-2
 * Time: 下午11:13
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class MutiFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new MutiOperation();
    }
}
