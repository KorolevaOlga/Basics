package com.epam.JavaIntro.Flowers.factory;

import java.util.Scanner;

public class BouquetFactory {

    private final CompositionFactory compositionFactory;
    private final WrapperFactory wrapperFactory;

    public BouquetFactory(CompositionFactory compositionFactory, WrapperFactory wrapperFactory) {
        this.compositionFactory = compositionFactory;
        this.wrapperFactory = wrapperFactory;
    }

    Scanner scanner = new Scanner(System.in);

    private void Menu() {
        System.out.println("\n Для добавления в композицию цветов нажмите 1," +
                "\n Для добавления упаковки нажмите 2," +
                "\n Для информации о композиции и цене нажмите 3," +
                "\n Для выхода нажмите 0");
    }

    public Bouquet createBouquet() {
        Bouquet bouquet = new Bouquet();
        if (this.scanner != null) {
            int key;
            do {
                Menu();
                Scanner scan = new Scanner(System.in);
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:
                        Composition composition = compositionFactory.createComposition();
                        for (int j = 0; j < composition.flowers.size(); j++) {
                            bouquet.flowers.add(composition.flowers.get(j));
                        }
                        break;
                    case 2:
                        System.out.println("Укажите упаковку: " +
                                "1 - бумага," +
                                "2 - целлофан," +
                                "3 - крафтовая бумага");
                        int numberPaper = scan.nextInt();

                        Wrapper wrapper = wrapperFactory.createWrapper(numberPaper);
                        bouquet.wrapper = wrapper;
                        break;
                    case 3:
                        System.out.println(bouquet.toString());
                        break;
                }
            } while ((key != 0));
        }
        return bouquet;
    }
}
