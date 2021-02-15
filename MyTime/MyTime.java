package date_time;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        check(hour,minute,second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime(MyTime time){
       this(time.hour,time.minute,time.second);
    }

    private void check(int hour,int minute,int second) {
        if (hour<0||hour>=24){
            throw new RuntimeException("hour参数错误");
        }
        if (minute<0||minute>=60){
            throw new RuntimeException("minute参数错误");
        }
        if (second<0||second>=60){
            throw new RuntimeException("second参数错误");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    //返回值代表time本次向后走一秒，是否走到第二天
    //true代表有进位  false代表没有进位
    public boolean nextSecond(){
        second++;
        if (second<60){
            return false;
        }
        minute++;
        second=0;
        if (minute<60){
            return false;
        }
        hour++;
        minute=0;

        if (hour<24){
            return false;
        }
        hour=0;
        return true;
    }
    //向前一秒
    public boolean preSecond(){
        second--;
        if (second>=0){
            return false;
        }
        minute--;
        second=59;
        if (minute>=0){
            return false;
        }
        hour--;
        minute=59;
        if (hour>=0){
            return false;
        }
        hour=23;
        return true;
    }

    public int DiffTime(MyTime from){
        if (this.compareTo(from)<=0){
            throw new RuntimeException("from的时刻必须在当前时刻之前");
        }
        MyTime copyFrom=new MyTime(from);
        int count=0;
        while (copyFrom.compareTo(this)<0){
            System.out.println(copyFrom);
            copyFrom.nextSecond();//时刻加一秒
            count++;
        }
        return count;
    }

    public int compareTo(MyTime from) {
        if (this.hour!=from.hour){
            return this.hour-from.hour;
        }
        if (this.minute!=minute){
            return this.minute-from.minute;
        }
            return this.second-from.second;
    }
}
