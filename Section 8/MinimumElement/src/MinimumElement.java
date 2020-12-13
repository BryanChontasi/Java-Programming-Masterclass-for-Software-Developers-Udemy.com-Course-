import java.util.Scanner;

public class MinimumElement {

    //changed method from private to public to test in Main class
    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number here");
        int number = scanner.nextInt();

        scanner.nextLine();
        return number;
    }

    //changed method from private to public to test in Main class
    public static int[] readElements( int elements){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int[] newArray = new int[elements];
        for (int i = 0; i< newArray.length; i++){
            int number = scanner.nextInt();
             scanner.nextLine();
            newArray[i] = number;
        }
        return newArray;
    }
    //changed method from private to public to test in Main class
    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
