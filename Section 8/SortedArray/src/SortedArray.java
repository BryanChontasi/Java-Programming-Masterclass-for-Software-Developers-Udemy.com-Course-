import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    //getInteger() returns the array with values from scanner
    public static int[] getIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[size];
        System.out.println("Enter "+ size + " integer values: \r");
        for (int i = 0; i< array.length; i++){
            array[i]= scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    //printArray() returns array printed one by one
    public static void  printArray(int[] array){
        for (int i = 0; i<array.length; i++){
            System.out.println("Element "+ i + " contents " + array[i]);
        }
    }

    //sortIntegers() returns array sorted in descending order
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int tmp;

        while (flag){
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i+1] = tmp;
                    flag = true;
                }
            }
        }
        return  sortedArray;
    }
}
