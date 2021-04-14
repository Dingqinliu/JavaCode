import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String[] array=str.split(" ");
       // System.out.println(Arrays.toString(array));
            //reverse(array);
            for (int i=array.length-1;i>=0;i--){
                System.out.print(array[i]+" ");
            }
            //System.out.println(Arrays.toString(array));
        }
//        public static void reverse(String[] array){
//            int left=0;
//            int right=array.length-1;
//
//            while(left<right){
//                String temp=array[left];
//                array[left]=array[right];
//                array[right]=temp;
//                left++;
//                right++;
//            }
//        }
    }

