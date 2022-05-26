package Program.State;

/*3.	Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей.  площадь, областные центры.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Town Grodno = new Town("Гродно", 356900, 142000, Town.Type.REGIONAL_CENTER);
        Town Brest = new Town("Брест", 340000, 146000, Town.Type.REGIONAL_CENTER);
        Town Gomel = new Town("Гомель", 508000, 139000, Town.Type.REGIONAL_CENTER);
        Town Vitebsk = new Town("Витебск", 362000, 124000, Town.Type.DISTRICT_CENTER);
        Town Mogilev = new Town("Могилев", 380000, 118000, Town.Type.REGIONAL_CENTER);
        Town Minsk = new Town("Минск", 1975000, 348000, Town.Type.CAPITAL);

        Town Bobruisk = new Town("Бобруйск", 211000, 96, Town.Type.DISTRICT_CENTER);
        District Bobruiski = new District("Бобруйский район", 16683, 1599, Bobruisk);
        District Mogilevski = new District("Могилевский  район", 40000, 1895, Mogilev);

        ArrayList<District> districtsMogilev= new ArrayList<>();
        districtsMogilev.add(Mogilevski);
        districtsMogilev.add(Bobruiski);

        Region Grodnenskii = new Region("Гродненская область", 1039000, 25000, Grodno, null);
        Region Brestskii = new Region("Брестская область", 1347000, 32000, Brest, null);
        Region Gomelskii = new Region("Гомельская область", 1427000, 40000, Gomel, null);
        Region Vitebskii = new Region("Витебская область",1136000, 40000, Vitebsk, null);
        Region Mogilevskii = new Region("Могилевская область", 1014843, 29000, Mogilev, districtsMogilev);
        Region Minskii = new Region("Минская область", 1473346, 38854, Minsk, null);
        Region Minsk_2 = new Region("Минск", 1975000, 348000, Minsk, null);

        ArrayList<Region> region = new ArrayList<>();
        region.add(Gomelskii);
        region.add(Grodnenskii);
        region.add(Brestskii);
        region.add(Vitebskii);
        region.add(Mogilevskii);
        region.add(Minskii);
        region.add(Minsk_2);




        State Belarus = new State("Беларусь", region, Minsk);

        Belarus.infoCenter();
        Mogilevskii.districtInfo();
        Belarus.regionsCenter();
        Belarus.countRegion();
        Belarus.getSquare();

    }
}
