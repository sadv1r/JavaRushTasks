package com.javarush.test.level14.lesson06.home01;

/**
 * Created on 6/7/15.
 *
 * @author sadv1r
 * @version 0.1
 */
public abstract class Hen {
    abstract int getCountOfEggsPerMonth();
    String getDescription() {
        return "Я курица.";
    }
}
