package com.javarush.test.level12.lesson06.task03;

/* Исправь код. Вторая задача
Исправь код, чтобы программа компилировалась.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public Pet getChild() {
            return new Cat();
        }


    }

    public static class Cat extends Solution.Pet {

    }

}
