public class Hanoi {
        public static void game(int n,int begin,int end){
            if (n==1){
                System.out.printf("从%d移动到%d\n",begin,end);
                return;
            }
            int other=3-begin-end;
            game(n-1,begin,end);
            System.out.printf("从%d移动到%d\n",begin,end);
            game(n-1,other,end);
        }

        public static void main(String[] args) {
            game(4,0,2);
        }

}
