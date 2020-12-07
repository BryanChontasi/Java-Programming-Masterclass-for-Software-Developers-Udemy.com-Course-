public class SharedDigit {
    public static boolean hasSharedDigit (int d1, int d2){
        if(d1 <10 || d1 >99 ||d2 <10 || d2 >99 ){
            return false;
        }
        String d1ToString = Integer.toString(Math.abs(d1));
        String d2ToString = Integer.toString(Math.abs(d2));

        for(int i = 0; i < d2ToString.length(); i++){
            if(d1ToString.contains(Character.toString(d2ToString.charAt(i)))){
                return true;
            }
        }
        return false;
    }
}
