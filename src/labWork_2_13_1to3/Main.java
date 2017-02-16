package labWork_2_13_1to3;

import java.util.Scanner;

/**
 * Created by Bulik on 11.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        //labWork_2_13_1
        for(MyDayOfWeek dayOfWeek : MyDayOfWeek.values()){
            System.out.println(dayOfWeek);
        }
        //labWork_2_13_2
        System.out.println("***************************************");
        for(MyDayOfWeek dayOfWeek : MyDayOfWeek.values()){
            switch (dayOfWeek){
                case TUESDAY:
                case THURSDAY:
                case SATURDAY:
                    System.out.println("My Java day: " + dayOfWeek);
            }
        }
        //lab2_13_3
        System.out.println("*******************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of week: ");
        String day = scanner.next();
        try {
            MyDayOfWeek dday = MyDayOfWeek.valueOf(day.toUpperCase());
            System.out.println("The next day of week: " + dday.nextDay());
        }catch (IllegalArgumentException exp){
            System.out.println("Day of week incorrect!");
        }

    }
}
