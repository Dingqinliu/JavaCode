public class leapYear {
    public static void main(String[] args) {
        System.out.println("1000-2000之间所有的闰年有:");
        for (int i=1000;i<=2000;i++){
            if((i%4==0&&i%100!=0)||(i%400==0)){
                System.out.printf("%d ",i);
            }
        }
    }
}
