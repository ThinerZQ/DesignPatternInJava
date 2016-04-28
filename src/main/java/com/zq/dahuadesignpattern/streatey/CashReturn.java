package com.zq.dahuadesignpattern.streatey;

/**
 * Created by Intellij IDEA
 * Date: 16-4-29
 * Time: 上午12:03
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class CashReturn extends CashSuper {

    private double moneyCondition =0.0;
    private double moneyReturn =0.0;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money > moneyCondition){
            return money - moneyReturn;
        }
        return money;
    }
}
