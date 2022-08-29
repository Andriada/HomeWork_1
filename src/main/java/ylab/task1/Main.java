package ylab.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];
        int max = 0;
        int min = 0;
        int sum = 0;

        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(10) + 1;
            }
        }
        for (int[] num : nums) {
            for (int i : num) {
                System.out.println(i + "");
            }
        }
        for (int[] num : nums) {
            for (int i : num) {
                if (i < min) {
                    min = i;
                } else if (i > max) {
                    max = i;
                }
                sum += i;
            }
        }
        double average = ((double) sum/ (nums.length * nums[0].length));
        System.out.println("Sum elements " + sum);
        System.out.println("Min " + min);
        System.out.println("Max " + max);
        System.out.println("average " + average);
    }
}
