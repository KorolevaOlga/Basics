package Customer;

public class Customer {
    {
        startId++;
    }

    private static int startId = 0;
    private int id = startId;

    private String surname, name, patronymic, address;
    private int numberCard, numberBankAccount;

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

}

