package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        public Human(String name) {
            this.name = name;
        }

        //напишите тут ваши переменные и конструкторы
        String name;

        public Human(String name, String lastname) {
            this.name = name;
            this.lastname = lastname;
        }

        String lastname;

        public Human(String name, String lastname, String nickname) {
            this.name = name;
            this.lastname = lastname;
            this.nickname = nickname;
        }

        String nickname;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String city;

        public Human(String name, String lastname, int age) {
            this.name = name;
            this.lastname = lastname;
            this.age = age;
        }

        public Human(String name, String lastname, String nickname, int age) {
            this.name = name;
            this.lastname = lastname;
            this.nickname = nickname;
            this.age = age;
        }

        public Human(String name, String lastname, String nickname, String city, int age, int clas) {
            this.name = name;
            this.lastname = lastname;
            this.nickname = nickname;
            this.city = city;
            this.age = age;
            this.clas = clas;
        }

        public Human(String name, String lastname, String nickname, String city, int clas) {
            this.name = name;
            this.lastname = lastname;
            this.nickname = nickname;
            this.city = city;
            this.clas = clas;
        }

        public Human(int clas) {
            this.clas = clas;
        }

        public Human(String name, String lastname, String city, int age, int clas) {
            this.name = name;
            this.lastname = lastname;
            this.city = city;
            this.age = age;
            this.clas = clas;
        }

        int age, clas;

        public Human(int age, int clas) {
            this.age = age;
            this.clas = clas;
        }
    }
}
