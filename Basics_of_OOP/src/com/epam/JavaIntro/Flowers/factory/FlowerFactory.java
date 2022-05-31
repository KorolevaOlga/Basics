package flovers.flowers.src.Program;

import flovers.flowers.src.Program.Flower.NameFlower;
import flovers.flowers.src.Program.Flower.Color;

public class FlowerFactory {


    public Flower flowerCreate(int number, int number2) {
        Flower flower = null;

        switch (number) {
            case 1 -> {
                switch (number2) {
                    case 1 -> {
                        flower = new Flower(NameFlower.ROSE, Color.RED, 30.50);
                        break;
                    }
                    case 2 -> {
                        flower = new Flower(NameFlower.ROSE, Color.BLUE, 30.50);
                        break;
                    }
                    case 3 -> {
                        flower = new Flower(NameFlower.ROSE, Color.PINK, 30.50);
                        break;
                    }
                    case 4 -> {
                        flower = new Flower(NameFlower.ROSE, Color.YELLOW, 30.50);
                        break;
                    }
                    case 5 -> {
                        flower = new Flower(NameFlower.ROSE, Color.WHITE, 30.50);
                        break;
                    }
                }
            }
            case 2 -> {
                switch (number2) {
                    case 1 -> {
                        flower = new Flower(NameFlower.LILY, Color.RED, 25.30);
                        break;
                    }
                    case 2 -> {
                        flower = new Flower(NameFlower.LILY, Color.BLUE, 25.30);
                        break;
                    }
                    case 3 -> {
                        flower = new Flower(NameFlower.LILY, Color.PINK, 25.30);
                        break;
                    }
                    case 4 -> {
                        flower = new Flower(NameFlower.LILY, Color.YELLOW, 25.30);
                        break;
                    }
                    case 5 -> {
                        flower = new Flower(NameFlower.LILY, Color.WHITE, 25.30);
                        break;
                    }
                }
            }

            case 3 -> {
                switch (number2) {
                    case 1 -> {
                        flower = new Flower(NameFlower.HYDRANGEA, Color.RED, 22.20);
                        break;
                    }
                    case 2 -> {
                        flower = new Flower(NameFlower.HYDRANGEA, Color.BLUE, 22.20);
                        break;
                    }
                    case 3 -> {
                        flower = new Flower(NameFlower.HYDRANGEA, Color.PINK, 22.20);
                        break;
                    }
                    case 4 -> {
                        flower = new Flower(NameFlower.HYDRANGEA, Color.YELLOW, 22.20);
                        break;
                    }
                    case 5 -> {
                        flower = new Flower(NameFlower.HYDRANGEA, Color.WHITE, 22.20);
                        break;
                    }
                }
            }
            case 4 -> {
                switch (number2) {
                    case 1 -> {
                        flower = new Flower(NameFlower.TULIP, Color.RED, 5.50);
                        break;
                    }
                    case 2 -> {
                        flower = new Flower(NameFlower.TULIP, Color.BLUE, 5.50);
                        break;
                    }
                    case 3 -> {
                        flower = new Flower(NameFlower.TULIP, Color.PINK, 5.50);
                        break;
                    }
                    case 4 -> {
                        flower = new Flower(NameFlower.TULIP, Color.YELLOW, 5.50);
                        break;
                    }
                    case 5 -> {
                        flower = new Flower(NameFlower.HYDRANGEA, Color.WHITE, 5.50);
                        break;
                    }
                }
            }
            case 5 -> {
                switch (number2) {
                    case 1 -> {
                        flower = new Flower(NameFlower.GYPSOPHILA, Color.RED, 1.00);
                        break;
                    }
                    case 2 -> {
                        flower = new Flower(NameFlower.GYPSOPHILA, Color.BLUE, 1.00);
                        break;
                    }
                    case 3 -> {
                        flower = new Flower(NameFlower.GYPSOPHILA, Color.PINK, 1.00);
                        break;
                    }
                    case 4 -> {
                        flower = new Flower(NameFlower.GYPSOPHILA, Color.YELLOW, 1.00);
                        break;
                    }
                    case 5 -> {
                        flower = new Flower(NameFlower.GYPSOPHILA, Color.WHITE, 1.00);
                        break;
                    }
                }
            }
        }
        return flower;
    }
}
