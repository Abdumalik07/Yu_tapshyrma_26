package com.company;

public class Main {

    public static void main(String[] args) {
        /* Box деген generic класс тузунуз.
Ичинде Box деген объектти кайтарган статический generic метод болсун. */

        Box<Integer> box = new Box<>(1);
        System.out.println(Box.getObjectTypeOfBox(box));



    }
}
