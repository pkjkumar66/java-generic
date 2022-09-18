package com.pkj.generic;

public class WildCard<T extends Number> {
    T num;

    WildCard(T num) {
        this.num = num;
    }

    boolean absEqual(WildCard<?> obj) {
        if (Math.abs(num.doubleValue()) == Math.abs(obj.num.doubleValue()))
            return true;

        return false;
    }
}
