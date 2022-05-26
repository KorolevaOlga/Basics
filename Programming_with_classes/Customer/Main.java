package Customer;

import java.util.List;

public class Main {

        public static void main(String[] args) {

            Customers customer = new Customers();

            customer.addCustomers(new Customer("Popov", "Ivan", "Nikiforivich", "Leninskaja, 25", 234456778, 234));
            customer.addCustomers(new Customer("Sidorov", "Maksim", "Mikhailivich", "Sovientskaja, 5", 678807654, 123));
            customer.addCustomers(new Customer("Ivanov", "Sergey", "Stepanovich", "Solnechnaja, 87", 765432316, 567));


            System.out.println("Список покупателей в алфавитном порядке: ");
            List<Customer> alphabeticalOrder = customer.getListBySurname();
            for(Customer c: alphabeticalOrder){
                System.out.println(c);
            }

            System.out.println("Карты в заданном диапазоне: ");
            List<Customer> cardOrder = customer.getListCreditCardRange(393333443, 922222232);
            for (Customer c: cardOrder){
                System.out.println(c);
            }
        }
    }
    

