public class Test01 {
    public static void main(String[] args) {
        System.out.println(ToLowerCase("STR"));
    }

    //大写字母转小写
        private static String ToLowerCase(String str){
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c >= 65 && c <= 90) {
                    c += 32;
                }
                result += c;
            }
            return result;
        }

}