public class Main {
    public static void main(String[] args) {
    /*
    *The cats spend most of the day playing. In particular, they play if
    * the temperature is between 25 and 35 (inclusive).
    * Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
    *
    * Write a method isCatPlaying that has 2 parameters. Method needs to return
    * true if the cat is playing, otherwise return false
    *
    * 1st parameter should be of type boolean and be named summer it represents if it is summer.
    * 2nd parameter represents the temperature and is of type int with the name temperature.
    *
    * Bryan Chontasi 30/11/2020
    * */

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        return ((summer)&& (temperature >= 25 && temperature <= 45)) ||
                ((!summer)&& (temperature>= 25 && temperature<=35));
    }
}