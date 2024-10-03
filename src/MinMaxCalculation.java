public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {23, 5, 6, 89, 15, 10};
        int min =  Integer.MAX_VALUE;
        int max =  Integer.MIN_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
