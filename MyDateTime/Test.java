package date_time;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        MyDate date=new MyDate();
        //MyTime time=new MyTime(0,0,5);
        MyDateTime dateTime=new MyDateTime(2021,3,1,0,0,3);


        while (true){
            System.out.println(dateTime);
            dateTime.preSecond();
            TimeUnit.SECONDS.sleep(1);
        }
//        while (true){
//            System.out.println(time);
//            time.preSecond();
//            TimeUnit.SECONDS.sleep(1);
//      }
    }
}
