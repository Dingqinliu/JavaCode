//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
public class JZ05 {
    public String replaceSpace(String s){
//        return s.replace(" ","%20");//1、最咸鱼的方法
//        }

    StringBuilder res = new StringBuilder();
        for(int i =0;i<s.length();i++){
        if(s.charAt(i)==' '){
            res.append("%20");
        }else{
            res.append(s.charAt(i));
        }
    }
        return res.toString();
    }
