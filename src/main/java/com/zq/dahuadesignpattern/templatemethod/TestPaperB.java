package com.zq.dahuadesignpattern.templatemethod;

/**
 * Created by Intellij IDEA
 * Date: 16-5-2
 * Time: 下午11:35
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class TestPaperB extends TestPaper {
    @Override
    public String Answer1() {
        return "LMM";
    }

    @Override
    public String Answer2() {
        return "23";
    }

    @Override
    public String Answer3() {
        return "fmale";
    }
}
