public class IsPalindrome {
    public static void main(String[] args) {
        int a=12521;
        boolean b = isPalindrome(a);
        System.out.println(b);
    }

    private static boolean isPalindrome(int x) {
        String rev = new StringBuilder(x + "").reverse().toString();
        return (x + "").equals(rev);
    }
}
