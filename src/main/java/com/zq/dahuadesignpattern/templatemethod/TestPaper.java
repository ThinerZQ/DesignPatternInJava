package com.zq.dahuadesignpattern.templatemethod;

/**
 * Created by Intellij IDEA
 * Date: 16-5-2
 * Time: 下午11:32
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public abstract class TestPaper {
    public void testQuestion1(){
        System.out.println("Question 1 : what's your name ?");
        System.out.println("Answer is : "+ Answer1());
    }


    public abstract String Answer1();

    public void testQuestion2(){
        System.out.println("Question 2 : what's your age ?");
        System.out.println("Answer is : "+ Answer2());
    }


    public abstract String Answer2();

    public void testQuestion3(){
        System.out.println("Question 3 : what's your gender ?");
        System.out.println("Answer is : "+ Answer3());
    }


    public abstract String Answer3();
}
