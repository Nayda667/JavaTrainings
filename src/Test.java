import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        int value = 234567;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(value > 0){
            result.add(value%10);
            value = value/10;
        }
        Collections.reverse(result);
        System.out.println(result);
    }
}
