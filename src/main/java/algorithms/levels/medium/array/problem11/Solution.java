package algorithms.levels.medium.array.problem11;

/**
 * Проблема №11:
 * В массиве имеется n не отрицательных чисел, где каждое число это точка в координатной системе (i,ai).
 * Найти две линии, которые по оси x образуют контейнер наибольшей площади.
 */
public class Solution {

    public int maxArea(int[] height) {

        int max = 0;
        for (int i = 0; i < height.length; i++) {
            int j = height.length - 1;
            while (i < j) {
                int area = ((j - i) * Math.min(height[i], height[j]));
                if (area > max) {
                    max = area;
                }
                j--;
            }
        }
        return max;
    }
}
