import java.util.ArrayList;

public class QuickSort {
    public static void sort(ArrayList<Integer> array) {
        int n = array.size();
        if (n < 2) {
            return;
        }
        quick(array, 0, n - 1);
    }

    private static void quick(ArrayList<Integer> array, int start, int end) {
        if (start < end) {
            int p = partition(array, start, end);
            quick(array, start, p - 1);
            quick(array, p + 1, end);
        }
    }

    private static int partition(ArrayList<Integer> array, int start, int end) {
        int pivot = array.get(end);
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (array.get(j) < pivot) {
                i++;
                int temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
            }
        }
        int temp = array.get(i + 1);
        array.set(i + 1, array.get(end));
        array.set(end, temp);
        return i+1;
    }
}
