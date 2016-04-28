package com.zq.dahuadesignpattern.streatey;

/**
 * Created by Intellij IDEA
 * Date: 16-4-29
 * Time: 上午12:02
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class CashRebate extends CashSuper {

    private double moneyRebate =0;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
