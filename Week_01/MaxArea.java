package week1.day1;

/**
 * @author : haozhang
 * @date : Created in  2020-08-26
 * @description :最大区域面积
 * <p>
 * https://leetcode-cn.com/problems/container-with-most-water/
 * </p>
 * @modified By：
 * @version: 1.0
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] sourceData = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 71};
        System.out.println(getMaxArea(sourceData));
        System.out.println(getMaxArea2(sourceData));
        test();
    }

    private static int getMaxArea(int[] sourceData) {
        int maxArea = 0;
        int j = sourceData.length - 1;
        for (int i = 0; i < sourceData.length; ) {
            if (j < i) {
                return maxArea;
            }
            if (sourceData[i] < sourceData[j]) {
                maxArea = Math.max(maxArea, sourceData[i] * (j - i));
                i++;
            } else {
                maxArea = Math.max(maxArea, sourceData[j] * (j - i));
                j--;
            }
        }
        return maxArea;
    }

    private static int getMaxArea2(int[] sourceData) {
        int maxArea = 0;
        int j = sourceData.length - 1;
        int minLength;
        for (int i = 0; i < j; ) {
            minLength = sourceData[i] < sourceData[j] ? sourceData[i++] : sourceData[j--];
            maxArea = Math.max(maxArea, minLength * (j - i + 1));
        }
        return maxArea;
    }

    private static void test() {
        int[] test = new int[]{1, 2}  ;
        int i = 0;
        System.out.println(test[i++]);
        System.out.println(test[i]);

    }
}
