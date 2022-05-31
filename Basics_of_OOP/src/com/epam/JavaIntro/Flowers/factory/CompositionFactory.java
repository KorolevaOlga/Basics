package flovers.flowers.src.Program;

import java.util.Scanner;

public class CompositionFactory {

    private final FlowerFactory flowerFactory;

    public CompositionFactory(FlowerFactory flowerFactory) {
        this.flowerFactory = flowerFactory;
    }

    public Composition createComposition() {
        Composition composition = new Composition();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите название цветов: " +
                "1 - Роза," +
                "2 - Лилия," +
                "3 - Гортензия," +
                "4 - Тюльпан," +
                "5 - Гипсофила");

        int numberName = scanner.nextInt();

        System.out.println("Укажите цвет: " +
                "1 - красный," +
                "2 - голубой," +
                "3 - розовый," +
                "4 - желтый," +
                "5 - белый");

        int numberColor = scanner.nextInt();

        System.out.println("Укажите количество цветов одного вида: ");

        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            Flower flower = flowerFactory.flowerCreate(numberName, numberColor);
            composition.flowers.add(flower);
        }
        return composition;
    }
}



