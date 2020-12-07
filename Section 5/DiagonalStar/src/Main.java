public class Main {

    public static void main(String[] args) {
        /*
        *Write a method named printSquareStar with one parameter of type int named number.
        *
        * If number is < 5, the method should print "Invalid Value".
        * The method should print diagonals to generate a rectangular pattern composed of stars (*).
        * This should be accomplished by using loops
        *
        * For each row or column, stars are printed based on four conditions (Read them carefully):
        * In the first or last row
        * In the first or last column
        * When the row number equals the column number
        * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
        *
        * Bryan Chontasi  03/12/2020
        * */

    printSquareStar(8);

    }

    public static void printSquareStar(int number){
        if(number < 5 ){
            System.out.println("Invalid Value");
            return;
        }
        for(int row = 1; row <= number; row++ ){
            for(int col=1; col <= number; col++){
                if(row ==1 || row == number || col == 1 || col==number
                     ||row == col ||(number-row)+1 == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
