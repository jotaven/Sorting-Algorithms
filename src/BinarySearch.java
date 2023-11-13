import java.util.ArrayList;

public class BinarySearch {
    public static int search(ArrayList<Integer> array, int key) {
        int result = recursiveIllustrativeBinarySearch(array, key, 0, array.size() - 1, 0);

        return result;
    }

    private static int recursiveBinarySearch(ArrayList<Integer> array, int key, int left, int right) {
        if (right >= left && left <= array.size() - 1) {
 
            int mid = (left + right) / 2;
 
            if (array.get(mid) == key)
                return mid;
 
            if (array.get(mid) > key)
                return recursiveBinarySearch(array, left, mid - 1, key);

            return recursiveBinarySearch(array, mid + 1, right, key);
        }
 
        return -1;
    }

    private static int recursiveIllustrativeBinarySearch(ArrayList<Integer> array, int key, int left, int right, int iterations) {
        if (right >= left && left <= array.size() - 1) {
            clear();
            System.out.println("===== Busca Binária =====");
            System.out.println("Valor para pesquisa: " + key);
            System.out.println("Iteração " + (iterations + 1) + ":");
            System.out.println("Buscando no intervalo [" + left + ", " + right + "]");
            
            int mid = (left + right) / 2;

            System.out.println("Conferindo o valor no index " + mid);
            if (array.get(mid) == key) {
                System.out.println("O valor foi encontrado no index " + mid);
                return mid;
            }

            if (array.get(mid) > key) {
                System.out.println("O valor está na medade esquerda");
                sleep(300);
                return recursiveIllustrativeBinarySearch(array, key, left, mid - 1, ++iterations);
            } else {
                System.out.println("O valor está na medade direita");
                sleep(300);
                return recursiveIllustrativeBinarySearch(array, key, mid + 1, right, ++iterations);
            }
        }

        System.out.println("O valor não foi encontrado no array!");
        return -1;
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
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            array.add(i+1);
        }

        System.out.println(search(array, 40));
    }
}
