package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateReservation {
    int year;
    int month;
    int day;
    int hour;
    int minute;

    public DateReservation(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public DateReservation(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public DateReservation(int year, int month, int day, int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public static DateReservation getDateTreeParametrs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите желаемую дату резерва(в формате (число-месяц-год)): ");
        String date = sc.nextLine();
        String[] tempDate = date.trim().strip().split("-");
        int day = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int year = Integer.parseInt(tempDate[2]);
        return new DateReservation(day, month, year);
    }

    public static DateReservation getDateFiveParametrs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите желаемую дату резерва(в формате (число-месяц-год)): ");
        String date = sc.nextLine();
        System.out.print("Введите жедаемое время резерва (в формате (часы-минуты)): ");
        String time = sc.nextLine();
        String[] tempDate = date.trim().strip().split("-");
        int day = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int year = Integer.parseInt(tempDate[2]);
        String[] tempTime = time.trim().split("-");
        int hour = Integer.parseInt(tempTime[0]);
        int minute = Integer.parseInt(tempTime[1]);
        return new DateReservation(day, month, year, hour, minute);
    }
    public static DateReservation getCurrentDate(){
        Date currentDate = new Date();
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd-MM-yyyy");
        String formatDate = simpleDate.format(currentDate);
        String[] tempDate = formatDate.trim().strip().split("-");
        int day = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int year = Integer.parseInt(tempDate[2]);
        return new DateReservation(day, month, year);
    }

    @Override
    public String toString() {
        return String.format("Дата резерва: %d-%d-%d | Время резерва: %d-%d", day, month, year, hour, minute);
    }
}