import java.util.*;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int) (Math.random() * 9000) + 1000;
        return arr;
    }

    public static double[] findAverageMinMax(int[] nums) {
        int min = nums[0], max = nums[0], sum = 0;
        for (int n : nums) {
            sum += n;
            if (n < min)
                min = n;
            if (n > max)
                max = n;
        }
        return new double[] { sum / (double) nums.length, min, max };
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(arr);
        System.out.println("Average: " + result[0] + " Min: " + result[1] + " Max: " + result[2]);
    }
}
