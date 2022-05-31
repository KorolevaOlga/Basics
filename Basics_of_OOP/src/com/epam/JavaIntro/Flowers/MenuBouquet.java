package flovers.flowers.src.Program;

import java.util.Scanner;

public class MenuBouquet {
    private final Scanner scanner;

    public MenuBouquet(Scanner scanner){
        this.scanner = scanner;
    }
public void start() {
    System.out.println("\"Создайте композицию. Укажите желаемые базовые цветы, их цвет и упаковку: \"");
    FlowerFactory flowerFactory = new FlowerFactory();
    CompositionFactory compositionFactory = new CompositionFactory(flowerFactory);
    WrapperFactory wrapperFactory = new WrapperFactory();
    BouquetFactory bouquetFactory = new BouquetFactory(compositionFactory, wrapperFactory);

    Bouquet bouquet = bouquetFactory.createBouquet();

}

}
