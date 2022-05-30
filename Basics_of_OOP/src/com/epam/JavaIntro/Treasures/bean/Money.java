package com.epam.JavaIntro.Treasures.bean;

import java.util.Objects;

public class Money extends Treasure {

    enum MoneyType {
        COIN,
        BANKNOTE
    }

    private MoneyType moneyType;

    public Money() {
    }

    public Money(int number, String category, String name, String description, int price, MoneyType moneyType) {
        super(number, category, name, description, price);
        this.moneyType = moneyType;
    }

    public MoneyType getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(MoneyType moneyType) {
        this.moneyType = moneyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        if (!super.equals(o)) return false;
        Money money = (Money) o;
        return getMoneyType() == money.getMoneyType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMoneyType());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
