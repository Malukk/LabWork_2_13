package labWork_2_13_1to3;

/**
 * Created by Bulik on 11.08.2016.
 */
public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    public MyDayOfWeek nextDay(){

        MyDayOfWeek[] dayOfWeeks = MyDayOfWeek.values();
        int nextIndex = this.ordinal();
        if (nextIndex == dayOfWeeks.length-1){
            return dayOfWeeks[0];
        }else {
            return dayOfWeeks[++nextIndex];
        }
    }


}
