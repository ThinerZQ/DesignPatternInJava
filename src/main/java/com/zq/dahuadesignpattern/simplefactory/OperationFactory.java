package com.zq.dahuadesignpattern.simplefactory;

/**
 * Created by Intellij IDEA
 * Date: 16-4-28
 * Time: 上午12:12
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {

        Operation operation = null;

        switch (operate)
        {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }

}

