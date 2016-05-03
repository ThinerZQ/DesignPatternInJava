package com.zq.dahuadesignpattern.proxy;

/**
 * Created by Intellij IDEA
 * Date: 16-4-30
 * Time: 上午10:42
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class MainFrame {
    public static void main(String[] args) {
        Girl girl = new Girl("lmm");
        Proxy proxy = new ProxyImpl(girl);
        proxy.giveFlowers();
        proxy.giveChocolate();
        proxy.giveDolls();
    }
}
