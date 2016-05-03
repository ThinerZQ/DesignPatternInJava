package com.zq.dahuadesignpattern.factorymethod;

/**
 * Created by Intellij IDEA
 * Date: 16-5-2
 * Time: 下午10:59
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class SubOperation extends Operation {

    @Override
    public double getResult() {
        return this.getNum1()- this.getNum2();
    }
}
