package com.zq.dahuadesignpattern.factorymethod;

/**
 * Created by Intellij IDEA
 * Date: 16-5-2
 * Time: 下午10:58
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public abstract class Operation {

    public double num1;
    public double num2;

    public abstract double getResult();

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
