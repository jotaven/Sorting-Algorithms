import java.util.ArrayList;

public class SequentialSearch {
    public static int search(ArrayList<Integer> array, int key) {
        int n = array.size();
        for (int i = 0; i < n; i++) {
            if ((int) array.get(i) == key) {
                return i;
            }
        }
        return -1;
    }

    public static int illustrativeSearch(ArrayList<Integer> array, int key) {
        int n = array.size();
        for (int i = 0; i < n; i++) {
            clear();
            System.out.println("===== Busca Sequencial =====");
            System.out.println("Valor para pesquisa: " + key);
            System.out.println("Iteração " + (i + 1) + ": Comparando elemento do index " + i);
            if ((int) array.get(i) == key) {
                System.out.println("\033[32mValor encontrado no index " + i + "\033[0m");
                return i;
            } else {
                System.out.println("Valor encontrado no index " + i + " Não é igual a " + key + "!");
            }
            sleep(200);
        }
        System.out.println("\033[31mValor não encontrado no array!\\033[0m");
        return -1;
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        // Apenas testes
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            array.add(i+1);
        }

        illustrativeSearch(array, 40);
    }
}
