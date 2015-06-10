package com.javarush.test.level14.lesson06.home01;

/**
 * Created on 6/7/15.
 *
 * @author sadv1r
 * @version 0.1
 */
public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 800;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - Belarus. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
