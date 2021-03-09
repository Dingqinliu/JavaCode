package Homework;

public class LongPressedName {
    public static void main(String[] args) {
        String name1="alex";
        String typed1 = "aaleex";
        String name2 = "saeed";
        String typed2 = "ssaaedd";
        Boolean result1 = isLongPressedName(name1, typed1);
        Boolean result2 = isLongPressedName(name2, typed2);
        System.out.println(result1);
        System.out.println(result2);
    }


    //如果字符相同，双指针都移动一位。
    //如果不一样，name[i-1]存在，但typed[j]==name[i-1]，说明当前typed[j]是长按出来的，它右边可能也是长按出来的，j 移动一位，i 不动，继续考察。
    //如果不一样，且typed[j] != name[i-1]或name[i-1]就不存在，说明当前typed[j]键入错误，返回 false。
    private static Boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while(i < name.length() && j < typed.length()){ // 下标均未越界时
            char ret = name.charAt(i);
            i++;
            int i_num = 1, j_num = 0;
            while(i < name.length() && name.charAt(i) == ret){
                i++;
                i_num++;
            }
            while(j < typed.length() && typed.charAt(j) == ret){
                j++;
                j_num++;
            }
            if(i_num > j_num){
                return false;
            }
        }
        if(i < name.length() ^ j < typed.length()){
            return false;
        }
        return true;
    }
}
