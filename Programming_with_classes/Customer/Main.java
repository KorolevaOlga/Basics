package Customer;
/*
Определить конструкторы, set- и get- методы и метод toString(). Создать второй класс, агрегирующий масив Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

Найти и вывести:
а) список покупателей в алфавитном порядке;
b)список покупателей, у которых номер кредитной карточки находится в заданном интервале.
*/

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
    

