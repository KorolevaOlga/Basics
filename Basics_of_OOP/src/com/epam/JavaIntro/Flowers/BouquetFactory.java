package Program;

import java.util.Scanner;

public class BouquetFactory {

    private final FlowerFactory flowerFactory;
    private final WrapperFactory wrapperFactory;

    public BouquetFactory(FlowerFactory flowerFactory, WrapperFactory wrapperFactory) {
        this.flowerFactory = flowerFactory;
        this.wrapperFactory = wrapperFactory;
    }

    public Bouquet createBouquet(Flower.NameFlower nameFlower, Flower.Color color, Wrapper.Type type) {
        Bouquet bouquet = new Bouquet();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Укажите количество цветов одного вида: ");
    int amount = scanner.nextInt();

    for (int i = 0; i < amount; i++) {
        Flower flower = flowerFactory.flowerCreate(nameFlower, color);
        bouquet.flowers.add(flower);
    }
            Wrapper wrapper = wrapperFactory.createWrapper(type);
            bouquet.wrapper = wrapper;
        return bouquet;
    }
    public void addF(Flower.NameFlower nameFlower, Flower.Color color, Bouquet bouquet) {
        Flower flower = flowerFactory.flowerCreate(nameFlower, color);
        bouquet.flowers.add(flower);
    }

    }
//    package Program;
//
//            import java.util.Scanner;
//
//public class BouquetFactory {
//
//    private final FlowerFactory flowerFactory;
//    private final WrapperFactory wrapperFactory;
//
//    public BouquetFactory(FlowerFactory flowerFactory, WrapperFactory wrapperFactory) {
//        this.flowerFactory = flowerFactory;
//        this.wrapperFactory = wrapperFactory;
//    }
//
//    public Bouquet createBouquet(Flower.NameFlower nameFlower, Flower.Color color, Wrapper.Type type) {
//        Bouquet bouquet = new Bouquet();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Укажите количество цветов одного вида: ");
//        int amount = scanner.nextInt();
//
//        for (int i = 0; i < amount; i++) {
//            Flower flower = flowerFactory.flowerCreate(nameFlower, color);
//            bouquet.flowers.add(flower);
//        }
//        Wrapper wrapper = wrapperFactory.createWrapper(type);
//        bouquet.wrapper = wrapper;
//
//        System.out.println(bouquet);
//        return bouquet;
//    }
//
//
//}


