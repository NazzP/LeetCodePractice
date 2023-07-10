import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("XXI"));
        System.out.println(romanToInt("CM"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> charMap = new HashMap<>();

        charMap.put('I',1);
        charMap.put('V',5);
        charMap.put('X',10);
        charMap.put('L',50);
        charMap.put('C',100);
        charMap.put('D',500);
        charMap.put('M',1000);

        int result = 0;

        for(int i = 0; i < s.length()-1; i++){
            if (charMap.get(s.charAt(i)) >= charMap.get(s.charAt(i+1))){
                result += charMap.get(s.charAt(i));
            } else {
                result -= charMap.get(s.charAt(i));
            }
        }

        result += charMap.get(s.charAt(s.length()-1));

        return result;
    }
}