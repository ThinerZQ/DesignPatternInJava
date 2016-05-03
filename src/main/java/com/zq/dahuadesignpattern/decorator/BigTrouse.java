package com.zq.dahuadesignpattern.decorator;

/**
 * Created by Intellij IDEA
 * Date: 16-4-30
 * Time: 上午12:41
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class BigTrouse extends Finery{

    public BigTrouse(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.print("Big Trouser");
        person.show();
    }
}
