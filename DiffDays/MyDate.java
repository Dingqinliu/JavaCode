public class MyDate {
    public int year;
    public int month;
    public int day;


    //1、校验，检测传入参数的合法性
    //year>1949
    //1<=month<=12;
    //1<=day<=每个月的天数
    //2、如果参数不符合，应该怎么办
    //抛异常，通知对方出错
    //尝试修复参数 比如15个月 年加1 月加3
    public MyDate(int year, int month, int day) {
        if (year < 1949) {
            RuntimeException exception = new RuntimeException("year参数错误");
            throw exception;
        }
        if (month < 1 || month > 12) {
            throw new RuntimeException("month参数错误");
        }

        if (day < 1 || day > getMonthday(month, year)) {
            throw new RuntimeException("day参数错误");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //根据year和month算出该月共有多少天
    public int getMonthday(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;//前面已经限定月份的取值，但Java语法要求所有分支必须有返回值
        }
    }
    public MyDate(MyDate from){
        this.year=from.year;
        this.month=from.month;
        this.day=from.day;
    }

    public boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);//判断闰年 闰年的2月有29天，非闰年的2月是28天
    }
    //@XXX这种语法叫做注解（Annotation）
    //主要用来声明一些方法/属性/类具备的特征
    //override表示重写/覆写

    @Override
    public String toString() {
        String s = String.format("%04d-%02d-%02d", year, month, day);
        return s;
    }

    public int DiffDays(MyDate from) {
        //this指向的对象和from指向的对象之间相差的天数
        //要求this大于from
        //但引用之间无法比较大小，所以用compareTo方法进行日期的大小比较
        if (this.compareTo(from) <= 0) {
            throw new RuntimeException("from的日期必须在当前日期之前");
        }
        //复制from计算，以免修改别人传入的from对象
        MyDate copyFrom=new MyDate(from);
        int count=0;
        while (copyFrom.compareTo(this) <0){
            //让from向后走一天
            //from.day++
            System.out.println(copyFrom);
            copyFrom.increment();//设置月和日的进位

            count++;
        }
        return count;
    }

    public void increment(){
        day++;
        if (day<=getMonthday(month,year)){
            return;//天数不大于当月总天数，不用进位
        }
        month++;
        day=1;
        if (month<=12){
            return;//月份数不大于一年总月数，不用进位
        }
        year++;
        month=1;
    }

    //定义一个比较方法（from,this）
    //如果this<from，返回任意负数
    //如果this==from，返回0
    //如果this>from,返回任意正数
    public int compareTo(MyDate from) {
//        if (this.year<from.year){
//            return -1;
//        }
//        if (this.year>from.year){
//            return this.year-from.year;
//        }
        //上述代码可直接写成一句
        if (this.year != from.year) {
            return this.year - from.year;
        }
        if (this.month != from.month) {//到这 说明this.year=from.year
            return this.month - from.month;
        }
        return this.day - from.day;//到这 说明this.month=from.month
    }
}




