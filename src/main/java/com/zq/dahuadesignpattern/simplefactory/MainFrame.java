package com.zq.dahuadesignpattern.simplefactory;

import java.util.Scanner;

/**
 * Created by Intellij IDEA
 * Date: 16-4-28
 * Time: 下午11:38
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class MainFrame {
    public static void main(String[] args) {


        compute();
    }
    public static void compute(){
        Scanner scanner = new Scanner(System.in);
        double number1 =scanner.nextDouble();
        String oper = scanner.next();
        double number2 = scanner.nextDouble();

        Operation operation = OperationFactory.createOperation(oper);
        operation.setOper1(number1);
        operation.setOper2(number2);

        System.out.println(number1 + oper + number2 + " = "+operation.getResult());
    }
}
