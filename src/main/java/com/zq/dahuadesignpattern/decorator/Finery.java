package com.zq.dahuadesignpattern.decorator;

/**
 * Created by Intellij IDEA
 * Date: 16-4-30
 * Time: 上午12:35
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class Finery extends Person{

    protected Person person;

    public Finery() {

    }

    public Finery(Person person) {
        this.person = person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person!= null){
            person.show();
        }
    }
}
