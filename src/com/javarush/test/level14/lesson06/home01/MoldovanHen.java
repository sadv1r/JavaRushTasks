package com.javarush.test.level14.lesson06.home01;

/**
 * Created on 6/7/15.
 *
 * @author sadv1r
 * @version 0.1
 */
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 500;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - Moldova. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
