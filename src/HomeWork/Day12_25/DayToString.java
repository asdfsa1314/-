package HomeWork.Day12_25;

import java.util.Scanner;

public class DayToString {
    Scanner s =  new Scanner(System.in);
    int year;
    int month;
    int day;

    public static void main(String[] args) {
        DayToString hehe = new DayToString();
        input(hehe);
        DtoString(hehe);

    }

    public static void input(DayToString a){
        System.out.println("输入年:");
        a.year = a.s.nextInt();
        System.out.println("输入月:");
        a.month = a.s.nextInt();
        System.out.println("输入日:");
        a.day = a.s.nextInt();
    }

    public static void DtoString(DayToString a){
        int sum = 0;
        for (int i = a.month; i > 0; i--) {

            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    sum = 31 +sum;
                    break;
                case 2:
                    if (isLeapYear(a.year)) {
                        sum = 29 + sum;
                    } else {
                        sum = 28 + sum;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    sum = 30 + sum;
                    break;
            }

        }


        System.out.println("是["+a.year+"]年的"+sum+"天");
    }

    public static boolean isLeapYear(int year){
        boolean isLeapYear = false;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("--------------------闰年-------------------");
            isLeapYear = true;
        } else {
            System.out.println("--------------------非闰年-------------------");
            isLeapYear = false;
        }
        return isLeapYear;
    }

}
