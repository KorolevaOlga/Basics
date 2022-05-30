package Payment;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

public class Payment {

   private List<Product> products;

    public Payment() {
    }

    public Payment(List<Product> products) {
        this.products = products;
    }


    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String sumPriceAll() {
        double sumPrice = 0.00;
        for (int i = 0; i < products.size(); i++) {
            sumPrice += products.get(i).price;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(sumPrice);
        return result;
    }

    public String sumWeightAll() {
        double sumWeight = 0.00;
        for (int i = 0; i < products.size(); i++) {
            sumWeight += products.get(i).weight;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(sumWeight);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment payment = (Payment) o;
        return Objects.equals(getProducts(), payment.getProducts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducts());
    }

    @Override
    public String toString() {
        return "Покупка: " + products +
                ", стоимость: " + sumPriceAll() +
                ", общий вес: " + sumWeightAll();
    }

    public static class Product {

        String name;
        int vendorCode;
        double price;
        double weight;

        public Product() {
        }

        Product(String name, int vendorCode, double price, double weight) {
            this.name = name;
            this.vendorCode = vendorCode;
            this.price = price;
            this.weight = weight;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setVendorCode(int vendorCode) {
            this.vendorCode = vendorCode;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getVendorCode() {
            return vendorCode;
        }

        public double getPrice() {
            return price;
        }

        public double getWeight() {
            return weight;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return vendorCode == product.vendorCode && Double.compare(product.price, price) == 0 && Double.compare(product.weight, weight) == 0 && Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, vendorCode, price, weight);
        }

        @Override
        public String toString() {
            String s = "Наименование товара: " + name +
                    ", артикул: " + vendorCode +
                    ", цена: " + price +
                    ", вес в кг: " + weight + '\n';
            return
                    s;
        }
    }


}
