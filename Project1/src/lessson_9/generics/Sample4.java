package lessson_9.generics;

public class Sample4 {
    public static void main(String[] args) {
        Short arr[] = {1, 2, 3, 4};
        Short val = 2;
        boolean flIn = Math.isIn(val, arr);
        System.out.println(flIn);
    }
}

class Math {
    public static <T> boolean isIn(T val, T[] arr) {
        for(T v : arr){
            if(v.equals(val)){
                return true;
            }
        }
        return false;
    }
}
