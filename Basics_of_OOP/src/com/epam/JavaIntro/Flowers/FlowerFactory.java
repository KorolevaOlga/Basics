package Program;


public class FlowerFactory {


    public Flower flowerCreate(Flower.NameFlower nameFlower, Flower.Color color) {
       Flower flower = null;

       switch (nameFlower) {
           case ROSE -> {
               flower = new Flower(Flower.NameFlower.ROSE, color, 30.5);
               break;
           }
           case LILY -> {
               flower = new Flower(Flower.NameFlower.LILY, color, 25.3);
               break;
           }
           case HYDRANGEA -> {
               flower = new Flower(Flower.NameFlower.HYDRANGEA, color, 22.20);
               break;
           }
           case TULIP -> {
               flower = new Flower(Flower.NameFlower.TULIP, color, 5.50);
               break;
           }
           case GYPSOPHILA -> {
               flower = new Flower(Flower.NameFlower.GYPSOPHILA, color, 1.0);
               break;
           }
       }
       return flower;
   }
}
//package Program;
//
//
//public class FlowerFactory {
//
//    public Flower flowerCreate(Flower.NameFlower nameFlower, Flower.Color color) {
//        Flower flower = null;
//
//        switch (nameFlower) {
//            case ROSE -> {
//                flower = new Flower(Flower.NameFlower.ROSE, color, 30.5);
//                break;
//            }
//            case LILY -> {
//                flower = new Flower(Flower.NameFlower.LILY, color, 25.3);
//                break;
//            }
//            case HYDRANGEA -> {
//                flower = new Flower(Flower.NameFlower.HYDRANGEA, color, 22.20);
//                break;
//            }
//            case TULIP -> {
//                flower = new Flower(Flower.NameFlower.TULIP, color, 5.50);
//                break;
//            }
//            case GYPSOPHILA -> {
//                flower = new Flower(Flower.NameFlower.GYPSOPHILA, color, 1.0);
//                break;
//            }
//        }
//        return flower;
//    }
//}
