import java.util.ArrayList;

public class MergeSort {
    public static void sort(ArrayList<Integer> array) {
        int n = array.size();
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        ArrayList<Integer> left = new ArrayList<Integer>(mid);
        ArrayList<Integer> right = new ArrayList<Integer>(n - mid);
        for (int i = 0; i < mid; i++) {
            left.add(array.get(i));
        }
        for (int i = mid; i < n; i++) {
            right.add(array.get(i));
        }
        sort(left);
        sort(right);
        merge(array, left, right);

    }

    static void merge(ArrayList<Integer> array, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int leftSize = left.size();
        int rightSize = right.size();
        while (i < leftSize && j < rightSize) {
            if (left.get(i) <= right.get(j)) {
                array.set(k, left.get(i));
                i++;
            } else {
                array.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            array.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < rightSize) {
            array.set(k, right.get(j));
            j++;
            k++;
        }
    }
}
