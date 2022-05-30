package com.epam.JavaIntro.Calendar.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Calendar.Dates day = new Calendar.Dates(1, Calendar.Dates.Month.APRIL, 2022, Calendar.Dates.DaysWeek.FRIDAY, Calendar.Dates.Type.WORK_DAY);
       Calendar.Dates day1 = new Calendar.Dates(2, Calendar.Dates.Month.APRIL, 2022, Calendar.Dates.DaysWeek.SATURDAY, Calendar.Dates.Type.DAY_OFF);
       Calendar.Dates day2 = new Calendar.Dates(3, Calendar.Dates.Month.APRIL, 2022, Calendar.Dates.DaysWeek.SUNDAY, Calendar.Dates.Type.DAY_OFF);
       Calendar.Dates day3 = new Calendar.Dates(4, Calendar.Dates.Month.APRIL, 2022, Calendar.Dates.DaysWeek.MONDAY, Calendar.Dates.Type.WORK_DAY);

        List<Calendar.Dates> dates = new ArrayList<Calendar.Dates>();

        dates.add(day);
        dates.add(day1);
        dates.add(day2);
        dates.add(day3);

        Calendar calendar = new Calendar(dates);

        calendar.infoDays(1, Calendar.Dates.Month.APRIL, 2022);

    }
}

