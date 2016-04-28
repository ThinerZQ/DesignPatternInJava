package com.zq.dahuadesignpattern.streatey;

/**
 * Created by Intellij IDEA
 * Date: 16-4-28
 * Time: 上午12:15
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(String type){
        switch(type){

            case "normal":
                cashSuper = new CashNorm();
                break;
            case "enough":
                cashSuper = new CashRebate(0.8);
                break;
            case "return":
                cashSuper = new CashReturn(300,100);
                break;
        }
    }
    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }

}
