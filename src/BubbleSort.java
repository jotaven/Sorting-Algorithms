import java.util.ArrayList;

public class BubbleSort {
    public static void sort(ArrayList<Integer> array) {
        int n = array.size();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if ((int) array.get(j - 1) > (int) array.get(j)) {
                    temp = (int) array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, temp);
                }
            }
        }
    }

    public static void illustrativeSort(ArrayList<Integer> array) {
        int n = array.size();
        int temp = 0;
        int tries = 0;
        clear();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                clear();
                System.out.println("===== Bubble Sort =====");
                System.out.println("Passo " + (i + 1) + ":");
                if ((int) array.get(j - 1) > (int) array.get(j)) {
                    temp = (int) array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, temp);
                    int k;
                    System.out.print("[");
                    for (k = 0; k < array.size() - 1; k++) {
                        if (k == j - 1 || k == j) {
                            System.out.print("\033[32m" + array.get(k) + "\033[0m, ");
                        } else {
                            System.out.print(array.get(k) + ", ");
                        }
                    }
                    if (k == j - 1 || k == j) {
                        System.out.println("\033[32m" + array.get(k) + "\033[0m]");
                    } else {
                        System.out.println(array.get(k) + "]");
                    }
                } else {
                    int k;
                    System.out.print("[");
                    for (k = 0; k < array.size() - 1; k++) {
                        if (k == j - 1 || k == j) {
                            System.out.print("\033[90m" + array.get(k) + "\033[0m, ");
                        } else {
                            System.out.print(array.get(k) + ", ");
                        }
                    }
                    if (k == j - 1 || k == j) {
                        System.out.println("\033[90m" + array.get(k) + "\033[0m]");
                    } else {
                        System.out.println(array.get(k) + "]");
                    }
                }
                System.out.println("Iteração: " + ++tries);
                sleep(100);
            }
        }
    }

    private static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Apenas testes
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(5);
        array.add(1);
        array.add(12);
        array.add(-5);
        array.add(16);
        array.add(6);
        array.add(-2);
        array.add(-1);
        array.add(-9);

        System.out.println("Unsorted array:");
        System.out.println(array);

        illustrativeSort(array);

        System.out.println("Sorted array:");
        System.out.println(array);
    }
}
