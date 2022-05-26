package Program.Time;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Time watch = new Time(15, 23, 18);
        Time www = new Time(45, 88 , 66);


        System.out.println("Текущее значение часов: ");
        watch.MyInfo();

        www.MyInfo();

        watch.setHours(35);
        watch.setMinutes(25);
        watch.setSeconds(15);

        watch.MyInfo();

        watch.changeHours(45);
        watch.changeMinutes(65);
        watch.changeSeconds(15);

        watch.MyInfo();
    }
}
