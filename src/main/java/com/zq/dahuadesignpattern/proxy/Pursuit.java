package com.zq.dahuadesignpattern.proxy;

/**
 * Created by Intellij IDEA
 * Date: 16-4-30
 * Time: 上午10:37
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class Pursuit implements Proxy {

    private Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }


    @Override
    public void giveFlowers() {

        System.out.println("Flower");
    }

    @Override
    public void giveChocolate() {
        System.out.println("Chocolate");
    }

    @Override
    public void giveDolls() {
        System.out.println("Dolls");
    }
}
