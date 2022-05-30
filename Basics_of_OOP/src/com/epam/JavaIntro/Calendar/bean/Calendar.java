package com.epam.JavaIntro.Calendar.bean;

import java.util.List;
import java.util.Objects;

public class Calendar {

    private List<Dates> dates;

    public Calendar() {
    }

    public Calendar(List<Dates> dates) {
        this.dates = dates;
    }

    public List<Dates> getDates() {
        return dates;
    }

    public void setDates(List<Dates> dates) {
        this.dates = dates;
    }

    public void infoDays(int number, Dates.Month month, int year) {
        for (int i = 0; i < dates.size(); i++) {
            if ((number == dates.get(i).number && dates.get(i).month.equals(month)) && dates.get(i).year == year) {
                System.out.println(dates.get(i).type);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calendar)) return false;
        Calendar calendar = (Calendar) o;
        return Objects.equals(getDates(), calendar.getDates());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDates());
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "dates=" + dates +
                '}';
    }

    public static class Dates {

        int number;
        Month month;
        int year;
        DaysWeek daysWeek;
        Type type;

        public Dates() {
        }

        public Dates(int number, Month month, int year, DaysWeek daysWeek, Type type) {
            this.number = number;
            this.month = month;
            this.year = year;
            this.daysWeek = daysWeek;
            this.type = type;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public Month getMonth() {
            return month;
        }

        public void setMonth(Month month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public DaysWeek getDaysWeek() {
            return daysWeek;
        }

        public void setDaysWeek(DaysWeek daysWeek) {
            this.daysWeek = daysWeek;
        }

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        enum Month {
            JANUARY,
            FEBRUARY,
            MARCH,
            APRIL,
            MAY,
            JUNE,
            JULY,
            AUGUST,
            SEPTEMBER,
            OCTOBER,
            NOVEMBER,
            DECEMBER
        }

        enum DaysWeek {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }

        enum Type {
            WORK_DAY,
            CELEBRATION_WORK_DAY,
            CELEBRATION_NOT_WORKING,
            DAY_OFF,
            CELEBRATION_DAY_OFF
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dates dates = (Dates) o;
            return number == dates.number && year == dates.year && month == dates.month && daysWeek == dates.daysWeek && type == dates.type;
        }

        @Override
        public int hashCode() {
            return Objects.hash(number, month, year, daysWeek, type);
        }

        @Override
        public String toString() {
            return "Dates{" +
                    "number=" + number +
                    ", month=" + month +
                    ", year=" + year +
                    ", daysWeek=" + daysWeek +
                    ", type=" + type +
                    '}';
        }
    }

}
