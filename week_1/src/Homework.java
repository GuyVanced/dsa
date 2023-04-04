import java.lang.reflect.Array;
import java.util.Arrays;
public class Homework {
    public static void main(String[] args) {
        Homework homework = new Homework();
        int[] numbers = {14,2,15,21,1,5,6};
        int maxElement = homework.getMaxElement(numbers);
        int minElement = homework.getMinElement(numbers);
        int sumOfTheElement = homework.sumTheArrayElements(numbers);
        System.out.println("The given array is : " + Arrays.toString(numbers));
        System.out.println("The max element of the array is " + maxElement);
        System.out.println("The minimun element is : " + minElement);
        System.out.println("The sum of the elements is : " + sumOfTheElement );
//        int[] list = {2,7,3,5,6,16};
        homework.rearrangeArrayElements(numbers);
        System.out.println("Rearranged array is : " + Arrays.toString(numbers));
    }
    public int getMaxElement(int[] numbers){
        int max = numbers[0];

        for (int number: numbers
             ) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }
    public int getMinElement(int[] numbers){
        int min = numbers[0];

        for (int number: numbers
        ) {
            if(number < min) {
                min = number;
            }
        }
        return min;
    }
    public int sumTheArrayElements(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum = sum + numbers[i];

        }
        return sum;

    }
    public void rearrangeArrayElements(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (i%2 ==0 ){
                if (numbers[i]%2 != 0 ){
                    numbers[i]++;
                }
            } else if (i%2 !=0) {
                if(numbers[i]%2 ==0 ){
                    numbers[i]++;
                }

            }

        }

    }
}
