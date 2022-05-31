//package Program;
//
//import java.util.Scanner;
//
//public class CompositionFactory {
//
//
//        public Composition createComposition (Flower.NameFlower nameFlower, Flower.Color color) {
//            Composition composition = null;
//            FlowerFactory flowerFactory = new FlowerFactory();
//
//            Scanner scanner4 = new Scanner(System.in);
//            int a = scanner4.nextInt();
//            while (a != 0) {
//                if(a == 1){
//                System.out.println("Укажите количество цветов одного вида: ");
//                Scanner scanner = new Scanner(System.in);
//                int amount = scanner.nextInt();
//                for (int i = 0; i < amount; i++) {
//                    Flower flower = flowerFactory.flowerCreate(nameFlower, color);
//                    composition.getFlowers().add(flower);
//                }
//            }
//                if (a == 2) {
//
//                }
//                return composition;
//        }
//}

