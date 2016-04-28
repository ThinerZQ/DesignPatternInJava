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
public class CashNorm extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
