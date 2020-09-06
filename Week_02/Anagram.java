package week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : haozhang
 * @date : Created in  2020-09-01
 * @description :字母异位词; 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词
 * <p>
 * https://leetcode-cn.com/problems/valid-anagram/description/
 * </p>
 * @modified By：
 * @version: 1.0
 */
public class Anagram {

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        boolean result = isAnagram(str1, str2);
        System.out.println(result);
        System.out.println(isAnagram2(str1, str2));
        System.out.println(isAnagram3(str1, str2));
    }

    private static boolean isAnagram(String str1, String str2) {
        char[] sourceStr = str1.toCharArray();
        char[] resultStr = str2.toCharArray();
        if (sourceStr.length != resultStr.length) {
            return false;
        }
        Arrays.sort(sourceStr);
        Arrays.sort(resultStr);
        return Arrays.equals(sourceStr, resultStr);
    }

    private static boolean isAnagram2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] resultArray = new int[26];
        System.out.println(resultArray[12]);
        char[] firstStr = str1.toCharArray();
        char[] secondStr = str2.toCharArray();
        for (int i = 0; i < firstStr.length; i++) {
            resultArray[firstStr[i] - 'a']++;
            resultArray[secondStr[i] - 'a']--;
        }
        for (int temp : resultArray) {
            if (temp != 0) {
                return false;
            }
        }
        return Arrays.stream(resultArray).noneMatch(k -> k != 0);
//        return Arrays.stream(resultArray).allMatch(k -> k == 0);
    }


    private static boolean isAnagram3(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> resultMap = new HashMap<>(26);
        for (int i = 0; i < str1.length(); i++) {
            resultMap.put(str1.charAt(i), resultMap.getOrDefault(str1.charAt(i), 0) + 1);
            resultMap.put(str2.charAt(i), resultMap.getOrDefault(str2.charAt(i), 0) - 1);
        }
//        for (char c : resultMap.keySet()) {
//            if (resultMap.get(c) != 0) {
//                return false;
//            }
//        }

        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
