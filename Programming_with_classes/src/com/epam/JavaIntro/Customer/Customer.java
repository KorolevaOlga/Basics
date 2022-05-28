package com.epam.JavaIntro.Customer;

import java.util.Objects;

public class Customer {
    {
        startId++;
    }

    private static int startId = 0;
    private int id = startId;

    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int numberCard;
    private int numberBankAccount;

    public Customer() {
    }

    public Customer(String surname, String name, String patronymic, String address, int numberCard, int numberBankAccount) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.numberCard = numberCard;
        this.numberBankAccount = numberBankAccount;
    }

    public String toString() {
        String string = "";
        string = string + id + ":" + surname + " " + name + " " + patronymic + ".\n" +
                address + ". " + "Номер карты: " + numberCard + " Номер счета: " + numberBankAccount;
        return string;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public void setNumberBankAccount(int numberBankAccount) {
        this.numberBankAccount = numberBankAccount;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public int getNumberBankAccount() {
        return numberBankAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return id == customer.id && getNumberCard() == customer.getNumberCard() && getNumberBankAccount() == customer.getNumberBankAccount() && Objects.equals(getSurname(), customer.getSurname()) && Objects.equals(getName(), customer.getName()) && Objects.equals(getPatronymic(), customer.getPatronymic()) && Objects.equals(getAddress(), customer.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getSurname(), getName(), getPatronymic(), getAddress(), getNumberCard(), getNumberBankAccount());
    }
}

