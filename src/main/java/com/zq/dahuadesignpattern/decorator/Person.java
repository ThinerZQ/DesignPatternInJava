package com.zq.dahuadesignpattern.decorator;

/**
 * Created by Intellij IDEA
 * Date: 16-4-30
 * Time: 上午12:30
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void show(){
        System.out.printf(", decorate %s",name);
    }

    public Person() {
    }
}
