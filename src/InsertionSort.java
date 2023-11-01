import java.util.ArrayList;

public class InsertionSort {
    public static void sort(ArrayList<Integer> array) {
        int n = array.size();
        for (int i = 1; i < n; i++) {
            int key = (int)array.get(i);
            int j = i - 1;
            while (j >= 0 && (int)array.get(j) > key) {
                array.set(j+1, array.get(j));
                j--;
            }
            array.set(j+1, key);
        }
    }
}
