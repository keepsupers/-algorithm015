package week1.day1;


/**
 * @author : haozhang
 * @date : Created in  2020-08-27
 * @description :移动0 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * https://leetcode-cn.com/problems/move-zeroes/
 * </p>
 * @modified By：
 * @version: 1.0
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] sourceData = new int[]{1, 0, 0, 0};
//        int[] endData = moveZeroes(sourceData);
        int[] endData = moveZeroes2(sourceData);
        for (int i = 0; i < endData.length; i++) {
            System.out.println(endData[i]);
        }
    }

    private static int[] moveZeroes(int[] sourceData) {
        if ((null == sourceData) || (sourceData.length < 2)) {
            return sourceData;
        }
        int j = 0;
        for (int i = 0; i < sourceData.length; i++) {
            if (sourceData[i] != 0) {
                sourceData[j] = sourceData[i];
                if (i != j) {
                    sourceData[i] = 0;
                }
                j++;
            }
        }

        return sourceData;
    }

    private static int[] moveZeroes2(int[] sourceData) {
        if ((null == sourceData) || (sourceData.length < 2)) {
            return sourceData;
        }
        int j = 0;
        for (int i = 0; i < sourceData.length; i++) {
            if (sourceData[i] != 0) {
                int temp = sourceData[j];
                sourceData[j] = sourceData[i];
                sourceData[i] = temp;
                j++;

            }
        }

        return sourceData;
    }
}
