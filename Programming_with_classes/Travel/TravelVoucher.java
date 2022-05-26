package Program.Travel;

import java.util.Comparator;
import java.util.Objects;

public class TravelVoucher {

    enum Country {
        Египет,
        Турция,
        Израиль,
        Грузия,
        Таиланд
    }

    enum TravelType {
        REST,
        EXCURSION,
        TREATMENT,
        SHOPPING,
        CRUISE
    }

    enum Transport {
        BUS,
        TRAIN,
        AIRPLANE
    }

    enum FoodType {
        OB,
        BB,
        HB,
        FB,
        ALL_INCLUSIVE
    }


    Country country;
    TravelType type;
    Transport transport;
    FoodType food;
    int amountDays;
    int price;


    public TravelVoucher(Country country, TravelType type, Transport transport, FoodType food, int amountDays, int price) {
        this.country = country;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.amountDays = amountDays;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TravelVoucher)) return false;
        TravelVoucher that = (TravelVoucher) o;
        return amountDays == that.amountDays && price == that.price && country == that.country && type == that.type && transport == that.transport && food == that.food;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, type, transport, food, amountDays, price);
    }

    @Override
    public String toString() {
        return "Доступные путевки: {" +
                "страна: " + country +
                ", тип: " + type +
                ", транспорт: " + transport +
                ", тип питания: " + food +
                ", количество дней: " + amountDays +
                ", стоимость тура: " + price +
                '}';
    }
    public static Comparator<TravelVoucher> sortPrice = new Comparator<TravelVoucher>() {
        @Override
        public int compare(TravelVoucher o1, TravelVoucher o2) {
            return (int) (o1.price - o2.price);
        }
    };
}

