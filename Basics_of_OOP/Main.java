package Payment;

import Payment.Payment.Product;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Product product = new Product("Конфеты \"Милка\"", 10961486, 6.59, 0.11);
        Product product1 = new Product("Джем манго-маракуйя-яблоко", 10107740, 7.29, 0.2);
        Product product2 = new Product("Печенье волебное с предсказаниями", 101068545, 9.99, 0.03);
        Product product3 = new Product("Варенье из сосновых шишек", 10946331, 19.77, 0.48);
        Product product4 = new Product("Паста арахисовая Nutbutter", 10805356, 12.42, 0.32);
        Product product5 = new Product("Урбеч из кокоса \"Ореховые истории\"", 10832317, 12.81, 0.3);
        Product product6 = new Product("Миндаль горький неочищенный", 10939740, 130.0, 1.4);
        Product product7 = new Product("Масло какао \"Royal Forest\"", 10839146, 27.06, 0.2);
        Product product8 = new Product("Масло тыквенное \"Pelzmann. Штирийское\"", 101020772, 29.72, 0.25);
        Product product9 = new Product("Масло арбузное \"Дом Кедра\"", 101005560, 20.88, 0.25);
        Product product10 = new Product("Масло грецкого ореха \"Pelzmann\"", 101020767, 23.30, 0.25);

        ArrayList<Product> purchase = new ArrayList<Product>();
        purchase.add(product);
        purchase.add(product1);
        purchase.add(product2);

        Payment order = new Payment(purchase);

        ArrayList<Product> purchase1 = new ArrayList<Product>();
        purchase1.add(product);
        purchase1.add(product10);
        purchase1.add(product4);
        purchase1.add(product7);

        Payment order1 = new Payment(purchase1);


        System.out.println(order);
        System.out.println(order1);

    }
}


