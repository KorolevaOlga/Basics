pacage com.epam.JavaIntro.Travel;

import java.util.ArrayList;

import Program.Travel.TravelVoucher.TravelType;
import Program.Travel.TravelVoucher.Country;
import Program.Travel.TravelVoucher.Transport;
import Program.Travel.TravelVoucher.FoodType;


public class Main {

    public static void main(String[] args) {

        TravelVoucher voucher1 = new TravelVoucher(Country.Египет, TravelType.REST, Transport.AIRPLANE, FoodType.ALL_INCLUSIVE, 7, 700);
        TravelVoucher voucher2 = new TravelVoucher(Country.Египет, TravelType.REST, Transport.AIRPLANE, FoodType.ALL_INCLUSIVE, 10, 1000);
        TravelVoucher voucher3 = new TravelVoucher(Country.Египет, TravelType.REST, Transport.AIRPLANE, FoodType.FB, 7, 650);
        TravelVoucher voucher4 = new TravelVoucher(Country.Турция, TravelType.REST, Transport.AIRPLANE, FoodType.ALL_INCLUSIVE, 7, 900);
        TravelVoucher voucher5 = new TravelVoucher(Country.Турция, TravelVoucher.TravelType.REST, Transport.AIRPLANE, FoodType.ALL_INCLUSIVE, 7, 930);
        TravelVoucher voucher6 = new TravelVoucher(Country.Грузия, TravelType.TREATMENT, Transport.AIRPLANE, FoodType.BB, 9, 880);
        TravelVoucher voucher7 = new TravelVoucher(Country.Израиль, TravelType.TREATMENT, Transport.AIRPLANE, FoodType.HB, 10, 1300);
        TravelVoucher voucher8 = new TravelVoucher(Country.Таиланд, TravelType.EXCURSION, Transport.AIRPLANE, FoodType.ALL_INCLUSIVE, 7, 1000);

        ArrayList<TravelVoucher> all = new ArrayList<>();
        all.add(voucher1);
        all.add(voucher2);
        all.add(voucher3);
        all.add(voucher4);
        all.add(voucher5);
        all.add(voucher6);
        all.add(voucher7);
        all.add((voucher8));

        AllVoucher all2 = new AllVoucher(all);
      
        System.out.println("Выбор по стране, транспорту, типу питания, количеству дней: ");
      
        all2.choiceAll2(TravelVoucher.Country.Египет, TravelVoucher.Transport.BUS, TravelVoucher.FoodType.BB, 10);
        all2.choiceAll2(TravelVoucher.Country.Египет, TravelVoucher.Transport.AIRPLANE, FoodType.ALL_INCLUSIVE, 10);
      
        System.out.println("Выбор путевки по стране: ");
      
        all2.choiceCountry(TravelVoucher.Country.Египет);
      
        System.out.println("Выбор путевки по цене: ");
      
        all2.choicePrice(900);

        System.out.println("вывести по возрастанию цены: ");

        all.sort(TravelVoucher.sortPrice);
      
        for (TravelVoucher voucher : all) {
            System.out.println(voucher);


        }
    }
}
