package ylab.task2;

public class Main {
    public static void main(String[] args) {
        int[] num = {5, 6, 3, 2, 5, 1, 4, 9};
        int buf;
        System.out.println("Sorted array elements");
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    buf = num[i];
                    num[i] = num[j];
                    num[j] = buf;
                }
            }
            System.out.println(num[i]);
        }
    }
}
