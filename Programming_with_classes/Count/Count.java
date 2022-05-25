package Program.Count;

public class Count {
    private int min, max, current;

    public Count(int min, int max, int current) {
        this.min = min;
        this.max = max;
        this.current = current;

    }

    public Count() {
        min = 1;
        max = 10;
        current = 2;
    }

    public void Increase() {
        current++;
        if (current > max) {
            current = min;
        }
    }

    public void Decrease() {
        current--;
        if (current < min) {
            current = max;
        }
    }

    public void value() {
        System.out.println(current);
    }

    public void myInfo() {
        System.out.println(min);
        System.out.println(max);
        System.out.println(current);
    }
}



