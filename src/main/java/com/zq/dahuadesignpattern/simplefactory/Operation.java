package com.zq.dahuadesignpattern.simplefactory;

/**
 * Created by Intellij IDEA
 * Date: 16-4-28
 * Time: 上午12:19
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public abstract class Operation {
    private double oper1;
    private double oper2;

    public abstract double getResult();

    public double getOper1() {
        return oper1;
    }

    public void setOper1(double oper1) {
        this.oper1 = oper1;
    }

    public double getOper2() {
        return oper2;
    }

    public void setOper2(double oper2) {
        this.oper2 = oper2;
    }
}
