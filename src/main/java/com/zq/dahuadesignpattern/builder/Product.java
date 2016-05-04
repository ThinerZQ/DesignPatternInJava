package com.zq.dahuadesignpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA
 * Date: 16-5-4
 * Time: 下午11:31
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }
    public void show(){
        System.out.println("Porduct : ");
        for (String part :
                parts) {
            System.out.print(part+" , ");
        }
    }
}
