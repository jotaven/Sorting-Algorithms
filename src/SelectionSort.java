import java.util.ArrayList;

public class SelectionSort {
    public static void sort(ArrayList<Integer> array) {
        int n = array.size();
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if ((int)array.get(j) < (int)array.get(min_idx)) {
                    min_idx = j;
                }
            }
            int temp = (int)array.get(min_idx);
            array.set(min_idx, array.get(i));
            array.set(i, temp);
        }
    }
}
