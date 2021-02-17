package date_time;

//年月日时分秒之差
public class MyDateTime {
//    private int year;
//    private int month;
//    private int day;
    private MyDate date;
//    private int hour;
//    private int minute;
//    private int second;
    private MyTime time;

    public MyDateTime(MyDateTime dateTime){
//        this.date=dateTime.date;//BUG fix
//        this.time=dateTime.time;//BUG fix
        //上述两语句，date/time是引用类型
        //所以=赋值，只复制了引用，没有复制对象
        this.date=new MyDate(dateTime.date);//深拷贝
        this.time=new MyTime(dateTime.time);
    }

    public MyDateTime(int year,int month,int day,int hour,int minute,int second){
        this.date=new MyDate(year,month,day);
        this.time=new MyTime(hour, minute, second);
    }
    //部分构造，只传年月日，时分秒默认设置成0时0分0秒
    public MyDateTime(int year,int month,int day){
        this(year,month,day,0,0,0);
    }
    public MyDateTime(MyDate date){
        this.date=new MyDate(date);
        this.time=new MyTime(0,0,0);
    }

    @Override
    public String toString() {
        return String.format("%s %s",date,time);
    }

    //向后走一秒
    public void nextSecond(){
        if (time.nextSecond()){
            date.nextDay();
        }
    }
    //向前走一秒
    public void preSecond(){
        if (time.preSecond()){
            date.preDay();
        }
    }
}
