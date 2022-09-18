package com.pkj.generic;

public class MyClass<T, V> {
    T obj1;
    V obj2;

    public MyClass(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void showType() {
        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());
    }
}
