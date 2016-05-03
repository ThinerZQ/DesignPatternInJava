package com.zq.dahuadesignpattern.facepattern;

/**
 * Created by Intellij IDEA
 * Date: 16-5-4
 * Time: 上午12:07
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }
    public void do1_2(){
        subSystemOne.print();
        subSystemTwo.print();
    }
    public void do2_3(){
        subSystemTwo.print();
        subSystemThree.print();
    }
}
