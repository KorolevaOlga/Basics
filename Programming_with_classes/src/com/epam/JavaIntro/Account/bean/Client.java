package com.epam.JavaIntro.Account.bean;

import java.util.*;

public class Client {
    String name;
    ArrayList<Account> accounts;

    public Client() {
    }

    public Client(String name, ArrayList<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public void allSum() {
        double sum = 0;
        for (Account account : accounts) {
            sum += account.amount;
        }
        System.out.println(sum);
    }

    public void positiveSum() {
        double sum = 0;
        for (Account account : accounts) {
            if (account.amount > 0) {
                sum += account.amount;
            }
        }
        System.out.println(sum);
    }


    public void negativeSum() {
        double sum = 0;
        for (Account account : accounts) {
            if (account.amount < 0) {
                sum = sum + account.amount;
            }
        }
        System.out.println(sum);
    }

    void statusBlocked() {
        List<Account> blocked = new ArrayList<>();
        for (Account account : accounts) {
            if (account.status == Account.Status.BLOCKED) {
                blocked.add(account);
            }
        }
        for (Account account : blocked) {
            System.out.println(account.toString());
        }

    }

    void statusUnblocked() {
        List<Account> unblocked = new ArrayList<>();
        for (Account account : accounts) {
            if (account.status == Account.Status.UNBLOCKED) {
                unblocked.add(account);
            }
        }
        for (Account account : unblocked) {
            System.out.println(account.toString());
        }

    }

    public void askAccountNumber(String s) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).numberAccount.equals(s)) {
                System.out.println(accounts.get(i));

            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Comparator<Account> getSortSum() {
        return sortSum;
    }

    public static void setSortSum(Comparator<Account> sortSum) {
        Client.sortSum = sortSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return name.equals(client.name) && accounts.equals(client.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accounts);
    }

    public static Comparator<Account> sortSum = new Comparator<Account>() {
        @Override
        public int compare(Account o1, Account o2) {
            return (int) (o1.amount - o2.amount);
        }
    };

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
