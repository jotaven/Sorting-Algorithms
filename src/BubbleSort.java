import java.util.ArrayList;

public class BubbleSort {
    public static void sort(ArrayList<Integer> array) {
        int n = array.size();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if ((int)array.get(j-1) > (int)array.get(j)) {
                    temp = (int)array.get(j-1);
                    array.set(j-1, array.get(j));
                    array.set(j, temp);
                }
            }
        }
    }
}
