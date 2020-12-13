public class Main {
    public static void main(String[] args) {
//        Write a method called reverse() with an int array as a parameter.
//        The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//        To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//        For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].
//
//        The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]
//        and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]
//
//
//           Bryan Chontasi 11/12/2020


        //test 1
        int[] newArray = {1, 5, 3, 7, 11, 9, 15};
        ReverseArray.reverse(newArray);

        System.out.println("-------------------------------");
        //test 2
        int[] newArray2 = {12, 54, 75, 34, 7, 90, 100};
        ReverseArray.reverse(newArray2);
    }
}