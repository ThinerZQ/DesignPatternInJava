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
public class OperationDiv extends Operation {

    public double getResult() {
        double result = 0;
        if (getOper2() == 0) {
            try {
                throw new Exception("divided number can not be 0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        result = getOper1() / getOper2();
        return result;
    }
}
