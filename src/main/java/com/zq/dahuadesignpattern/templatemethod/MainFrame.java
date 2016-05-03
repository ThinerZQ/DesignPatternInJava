package com.zq.dahuadesignpattern.templatemethod;

/**
 * Created by Intellij IDEA
 * Date: 16-5-2
 * Time: 下午11:36
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class MainFrame {

    public static void main(String[] args) {
        TestPaper paperA = new TestPaperA();
        TestPaper paperB = new TestPaperB();

        System.out.println("A's answer: ");
        paperA.testQuestion1();
        paperA.testQuestion2();
        paperA.testQuestion3();

        System.out.println("B's answer:");
        paperB.testQuestion1();
        paperB.testQuestion2();
        paperB.testQuestion3();
    }
}
