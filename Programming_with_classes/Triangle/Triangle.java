package Program.Triangle;

public class Triangle {
    private int a;
    private int b;
    private int c;

    private double a1;
    private double a2;
    private double b1;
    private double b2;
    private double c1;
    private double c2;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(int a1, int a2, int b1, int b2, int c1, int c2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
        this.c1 = c1;
        this.c2 = c2;
    }

        public void perimeter() {
            System.out.println("Периметр треугольника: ");
            System.out.println( a + b + c);
        }
        public void area() {
        int pp = (a + b + c)/ 2;
            System.out.println("Периметр треугольника: ");
            System.out.println((int) Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)));
    }
    public void medianIntersection() {
        System.out.println("Точки пересечения медиан: ");
 double d1 = (a1 + b1 + c1)/ 3;
 double d2 = (a2 + b2 + c2)/ 3;
        System.out.println((Math.round(d1) + ", " + Math.round(d2)));

}
    }

