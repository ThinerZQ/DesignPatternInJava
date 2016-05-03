package com.zq.dahuadesignpattern.decorator;

/**
 * Created by Intellij IDEA
 * Date: 16-4-30
 * Time: 上午12:38
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class TShirts extends Finery {

    public TShirts(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.print(" Tshirts");
        person.show();
    }
}
