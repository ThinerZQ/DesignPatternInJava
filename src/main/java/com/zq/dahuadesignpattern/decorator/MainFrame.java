package com.zq.dahuadesignpattern.decorator;

/**
 * Created by Intellij IDEA
 * Date: 16-4-30
 * Time: 上午12:43
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class MainFrame {
    public static void main(String[] args) {
        Person person = new Person("bird");

        TShirts tShirts = new TShirts(person);
        BigTrouse bigTrouse = new BigTrouse(tShirts);

        bigTrouse.show();

    }
}
