package Program.Time;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;



    public Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        if (this.hours >= 24) {
            this.hours = 0;
        }
        if(this.minutes >= 60) {
            this.minutes = 0;
        }
        if (this.seconds >= 60) {
            this.seconds = 0;
        }

    }
    public void MyInfo() {
        System.out.println( hours + ": " + minutes + ": " + seconds);
    }
    public void setHours(int hours) {
        if (hours < 24 && hours > 0) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }
    public void setMinutes(int minutes) {
        if(minutes < 60 && minutes > 0) {
            this.minutes = minutes;
        }
         else {
            this.minutes = 0;
        }
    }
    public void setSeconds(int seconds) {
        if(seconds < 60 && seconds > 0) {
            this.seconds = seconds;
        }
        else {
            this.minutes = 0;
        }
    }
    public void changeHours(int meaning) {
        if (this.hours + meaning < 24 && this.hours + meaning > 0) {
            this.hours += meaning;
        } else {
            this.hours = 0;
        }
    }
    public void changeMinutes(int meaning){
        if(this.minutes + meaning < 60 && this.minutes + meaning > 0) {
            this.minutes += meaning;
        }
        else
        this.minutes = (this.minutes + meaning) % 60;
        this.changeHours((this.minutes + meaning)/60);
    }
    public void changeSeconds(int meaning) {
        if(this.seconds + meaning < 60 && this.seconds > 0) {
            this.seconds += meaning;
        }
        else {
            this.seconds = (this.seconds + meaning) % 60;
            this.changeMinutes((this.seconds + meaning) / 60);

        }
    }
}
