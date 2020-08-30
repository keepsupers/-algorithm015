package week1.day1;

/**
 * @author : haozhang
 * @date : Created in  2020-08-25
 * @description :数组加一
 * <p>
 * https://leetcode-cn.com/problems/plus-one/
 * </P>
 * @modified By：
 * @version: 1.0
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        int[] result = plusOne(array);
    }

    private static int[] plusOne(int[] array) {

        if (array.length <= 0) {
            return null;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            array[i]++;
            array[i] = array[i] % 10;

            if (array[i] != 0) {
                return array;
            }
        }

        int[] result = new int[array.length + 1];
        result[0] = 1;
        return result;

    }


}
