package app;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {

        Date tanggal = new Date();  //memasukan milli second untuk mengetahui tanggal.
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2003);
        calendar.set(Calendar.MONTH,Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_WEEK,7);
        calendar.set(Calendar.DAY_OF_MONTH,13);
        calendar.set(Calendar.HOUR_OF_DAY, 10);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
