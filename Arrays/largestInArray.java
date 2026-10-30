import java.util.*;
public class largestInArray {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }

            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value in array is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,2,6,7,5};
        System.out.println("largest value is : " + getLargest(number));
    }
    
}
