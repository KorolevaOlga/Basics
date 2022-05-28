package Program.Travel;

import java.util.ArrayList;
import java.util.Objects;

public class AllVoucher {
    ArrayList<TravelVoucher> result;

    public AllVoucher(ArrayList<TravelVoucher> all) {
        this.result = all;
    }

    public void choiceCountry(TravelVoucher.Country country) {
        for (TravelVoucher travelVoucher : result) {
            if (travelVoucher.country.equals(country)) {
                System.out.println(travelVoucher);
            }
        }
    }

    public void choicePrice(int price) {
        for (TravelVoucher travelVoucher : result) {
            if (travelVoucher.price <= price) {
                System.out.println(travelVoucher.toString());
            }
        }
    }
    public void choiceAll2(TravelVoucher.Country country, TravelVoucher.Transport transport, TravelVoucher.FoodType food, int amount){
        int count = 0;
        for (TravelVoucher travelVoucher : result) {
            if (travelVoucher.country.equals(country) && travelVoucher.transport.equals(transport)) {
                if (travelVoucher.food.equals(food) && travelVoucher.amountDays <= amount) {
                    count++;
                    System.out.println(travelVoucher);
                }
            }
        }
        if(count == 0) {
            System.out.println("Путевка с данными параметрами не найдена");

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllVoucher that = (AllVoucher) o;
        return Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        return "AllVoucher{" +
                "result=" + result +
                '}';
    }
}


