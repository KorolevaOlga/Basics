package ProgramClasses;

public class Test2 {
    private int one;
    private int second;


    Test2(int one2, int second2) {
        one = one2;
        second = second2;
    }

    Test2() {
        one = 18;
        second = 30;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getOne() {
        return one;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }


}
