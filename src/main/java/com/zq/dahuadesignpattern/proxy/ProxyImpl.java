package com.zq.dahuadesignpattern.proxy;

/**
 * Created by Intellij IDEA
 * Date: 16-4-30
 * Time: 上午10:39
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class ProxyImpl implements Proxy {

    Pursuit pursuit;

    public ProxyImpl(Girl girl){
        pursuit = new Pursuit(girl);
    }


    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {

        pursuit.giveChocolate();
    }

    @Override
    public void giveDolls() {

        pursuit.giveDolls();
    }
}
