package com.zq.dahuadesignpattern.factorymethod;

/**
 * Created by Intellij IDEA
 * Date: 16-5-2
 * Time: 下午11:14
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class MainFrame {
    public static void main(String[] args) {
        IFactory factory = new MutiFactory();
        Operation operation = factory.createOperation();

        operation.setNum1(19);
        operation.setNum2(8);

        System.out.println(operation.getResult());
    }
}
