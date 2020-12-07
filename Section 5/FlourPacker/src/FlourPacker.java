public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        for(int i = 0; i <=bigCount; i ++){
            if( (i * 5 <= goal ) &&  (i * 5 + smallCount >= goal)){
                return true;
            }
        }
        return false;
    }
}
