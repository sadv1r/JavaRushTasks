package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //Напишите тут ваш код
        Map<String, Cat> cat = new HashMap<>();
        cat.put("1", new Cat("1"));
        cat.put("2", new Cat("2"));
        cat.put("3", new Cat("3"));
        cat.put("4", new Cat("4"));
        cat.put("5", new Cat("5"));
        cat.put("6", new Cat("6"));
        cat.put("7", new Cat("7"));
        cat.put("8", new Cat("8"));
        cat.put("9", new Cat("9"));
        cat.put("10", new Cat("10"));
        return cat;

    }



    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //Напишите тут ваш код
        Set<Cat> cats = new HashSet<>();
        for(Map.Entry<String, Cat> entry : map.entrySet()) {
            cats.add(entry.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
