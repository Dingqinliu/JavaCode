package date_time;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate from=new MyDate(2021,2,12);
        MyDate to=new MyDate(2021,2,14);

        System.out.printf("从%s到%s经过了%d天",from,to,to.DiffDays(from));
    }
}
