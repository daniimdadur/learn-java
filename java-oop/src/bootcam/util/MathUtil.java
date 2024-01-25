package bootcam.util;

public class MathUtil {

    //example static in method
    public static int sum(int...values){
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
