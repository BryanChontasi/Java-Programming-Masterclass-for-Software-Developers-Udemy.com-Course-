import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array){

        System.out.println("Array = " + Arrays.toString(array));

        int maxArray = array.length -1;
        int halfArray = array.length /2; // to use it in the for loop

        for(int i = 0; i < halfArray; i++){
            int temp = array[i]; //temp to store temporal value
            array[i] = array[maxArray - i];
            array[maxArray - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
