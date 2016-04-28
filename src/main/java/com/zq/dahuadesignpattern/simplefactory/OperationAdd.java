package com.zq.dahuadesignpattern.simplefactory;

/**
 * Created by Intellij IDEA
 * Date: 16-4-28
 * Time: 上午12:28
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class OperationAdd extends Operation {

    public double getResult() {
        return this.getOper1() + this.getOper2();
    }
}
