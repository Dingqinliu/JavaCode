package date_time;

/**
 * 构造方法：
 * MyDate(MyDate date);
 * MyDate(int year,int month,int day);
 *
 * 对外方法
 * public void nextDay()
 * public void preDay()
 * public String toString()
 */

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(MyDate date){
        this.year=date.year;
        this.month=date.month;
        this.day=date.day;
    }

    public MyDate(int year, int month, int day) {
        check(year,month,day);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private static void check(int year, int month, int day) {
        if (year<0){
            throw new RuntimeException("year参数错误");
        }
        if (month<1||month>12){
            throw new RuntimeException("month参数错误");
        }
        int days=getDayOfMonth(year,month);
        if (day<1||day>days){
            throw new RuntimeException("day参数错误");
        }
    }

    private static final int[] DAYS={31,28,31,30,31,30,31,31,30,31,30,31};

    private static int getDayOfMonth(int year, int month) {
        if (month==2&&isLeapYear(year)){
            return 29;
        }
        return DAYS[month-1];//因为数组元素下标从0开始，即一月份的天数在数组中下标为0
    }

    private static boolean isLeapYear(int year) {
        return (year%400==0||(year%4==0 && year%100!=0));
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d",year,month,day);//返回日期的字符串形式
    }

    //日期往后一天
    public void nextDay(){
        day++;
        if (day<=getDayOfMonth(year,month)){
            return;
        }
        month++;
        day=1;
        if (month<=12){
            return;
        }
        year++;
        month=1;
    }

    //日期往前一天
    public void preDay(){
        day--;
        if (day>0){
            return;
        }
        month--;
        if (month>0){
            day=getDayOfMonth(year,month);//必须先自减再计算
            return;
        }
        year--;
        month=12;
        day=31;
    }
    public int DiffDays(MyDate from){
        if (this.compareTo(from)<=0){
            throw new RuntimeException("from的日期必须在当前日期之前");
        }
        MyDate copyFrom=new MyDate(from);
        int count=0;
        while (copyFrom.compareTo(this)<0){
            System.out.println(copyFrom);
            copyFrom.nextDay();//日期加一天
            count++;
        }
        return count;
    }

    public int compareTo(MyDate from) {
        if (this.year!=from.year){
            return this.year-from.year;
        }
        if (this.month!=from.month){
            return this.month-from.month;
        }
        return this.day-from.day;
    }
}
