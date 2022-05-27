package com.epam.JavaIntro.Account.bean;

import java.util.Objects;

public class Account {

    enum Status {
        BLOCKED,
        UNBLOCKED
    }

    String owner;
    String dateOpening;
    String numberAccount;
    double amount;
    Status status;

    public Account() {
    }

    public Account (String owner, String dateOpening, String numberAccount, double amount, Status status) {
        this.owner = owner;
        this.dateOpening = dateOpening;
        this.numberAccount = numberAccount;
        this.amount = amount;
        this.status = status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Double.compare(account.amount, amount) == 0 && Objects.equals(owner, account.owner) && Objects.equals(dateOpening, account.dateOpening) && Objects.equals(numberAccount, account.numberAccount) && status == account.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, dateOpening, numberAccount, amount, status);
    }
    @Override
    
    public String toString() {
        return
                "Владелец: " + owner +
                        ", дата создания: " + dateOpening +
                        ", номер счета: " + numberAccount +
                        ", сумма: " + amount +
                        ", статус: " + status;
    }
}
