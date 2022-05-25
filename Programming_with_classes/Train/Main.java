package Program.Train1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Train[] trains = new Train[]{
                new Train("NewYork", 351, "13:50"),
                new Train("LosAngeles", 255, "18:35"),
                new Train("Boston", 453, "18:45"),
                new Train("Boston", 23, "11:20"),
                new Train("Atlanta", 568, "6.40"),
        };

        new MenuTrain(new Scanner(System.in)).start(trains);
    }
}

