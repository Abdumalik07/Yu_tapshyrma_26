package com.company;

public class Box <T>{
    private T a;

    public Box(T a) {
        this.a = a;
    }

    public static  <T> Box<T> getObjectTypeOfBox(Box<T> t){
        return t;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "a: "+a;    }


}

