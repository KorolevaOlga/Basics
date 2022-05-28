package com.epam.JavaIntro.Customer;

import java.util.*;

public class Customers {
   private ArrayList<Customer> base = new ArrayList<>();

   public void addCustomers(Customer customer){
       base.add(customer);
   }

   List<Customer> getListBySurname(){
       List<Customer> sorting = new ArrayList<>(base);
       Collections.sort(sorting, new Comparator<Customer>() {
           @Override
           public int compare(Customer o1, Customer o2) {
               return o1.getSurname().compareToIgnoreCase(o2.getSurname());
           }
       });
       return sorting;
    }

    List<Customer> getListCreditCardRange(int rangeStart, int rangeEnd){
       List<Customer> sorting = new ArrayList<>();
       for(Customer c: base) {
           if(c.getNumberCard() >= rangeStart && c.getNumberCard() <= rangeEnd) {
               sorting.add(c);
           }
       }
       return sorting;
    }
}



