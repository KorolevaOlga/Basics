package Car;

import java.util.Objects;

public class Wheel {
    private String brand;
    private double diameter;
    private String type;

    public Wheel(String brand, double diameter, int type) {
        this.brand = brand;
        this.diameter = diameter;
        if(type == 1) {
            this.type = "Зимнее";
        }
        if(type == 2) {
            this.type = "Летнее";
        }
    }


    public double getDiameter() {
        return diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wheel)) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.getDiameter(), getDiameter()) == 0 && Objects.equals(brand, wheel.brand) && Objects.equals(type, wheel.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, getDiameter(), type);
    }

    @Override
    public String toString() {
        return "Колесо: " +
                "бренд: " + brand +
                ", диаметр: " + diameter +
                ", тип:" + type + "\n";
    }
}









































//package Program;
//
//import java.util.Scanner;
//
//public class Wheel {
//    public enum Type {
//        Winter,
//        Summer
//    }
//
//    private String brand;
//    private double diameter;
//    private Type type;
//
//    public void Wheel(String brand, double diameter, Type type) {
//        this.brand = brand;
//        this.diameter = diameter;
//        this.type = type;
//    }
//
//    public String toString() {
//        String string = "";
//        string += "Brand: " + brand + "diameter: ";
//        if (type == Type.Winter) {
//            string += "; Winter";
//        }
//        if (type == Type.Summer) {
//            string += "; Summer";
//        }
//
//return string;
//    }
//
//    public double getDiameter() {
//        return diameter;
//    }
//    public static Wheel get(Scanner scanner) {
//        Wheel one = new Wheel();
//
//        System.out.println("Введите бренд: ");
//        one.brand = scanner.toString();
//
//        System.out.println("Введите тип. 1 - зимнее, 2 - летнее");
//        while(true) {
//            int number = scanner.nextInt();
//            if(number == 1){
//                one.type = Type.Winter;
//            }
//            if(number == 2) {
//                one.type = Type.Summer;
//            }
//            else{
//                System.out.println("Некорректное значение. Повторите попытку");
//                continue;
//            }
//            return one;
//        }
//    }
//}
