package com.javarush.test.level14.lesson06.home01;

/**
 * Created on 6/7/15.
 *
 * @author sadv1r
 * @version 0.1
 */
public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - Ukraine. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
