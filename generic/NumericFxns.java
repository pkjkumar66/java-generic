package com.pkj.generic;

public class NumericFxns<T extends Number> {
    T obj;

    NumericFxns(T obj) {
        this.obj = obj;
    }

    double square() {
        return obj.intValue() * obj.intValue();
    }
}
