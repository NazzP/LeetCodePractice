public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(1111));

    }
    public static boolean isPalindrome(int x){
        String value = String.valueOf(x);
        StringBuilder sb = new StringBuilder(value);
        return sb.reverse().toString().equals(value);
    }
}