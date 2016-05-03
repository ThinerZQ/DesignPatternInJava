package com.zq.dahuadesignpattern.facepattern;

/**
 * Created by Intellij IDEA
 * Date: 16-5-4
 * Time: 上午12:09
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class MainFrame {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.do1_2();
        facade.do2_3();
    }
}
