package com.epam.JavaIntro.Count.bean;

import java.util.Objects;

public class Count {
    private int min;
    private int max;
    private int current;

    public Count(int min, int max, int current) {
        this.min = min;
        this.max = max;
        this.current = current;
    }

    public Count() {
        min = 1;
        max = 10;
        current = 2;
    }

    public void increase() {
        current++;
        if (current > max) {
            current = min;
        }
    }

    public void decrease() {
        current--;
        if (current < min) {
            current = max;
        }
    }

    public void value() {
        System.out.println(current);
    }

    public void myInfo() {
        System.out.println(min);
        System.out.println(max);
        System.out.println(current);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Count)) return false;
        Count count = (Count) o;
        return getMin() == count.getMin() && getMax() == count.getMax() && getCurrent() == count.getCurrent();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMin(), getMax(), getCurrent());
    }

    @Override
    public String toString() {
        return "Count{" +
                "min=" + min +
                ", max=" + max +
                ", current=" + current +
                '}';
    }
}



