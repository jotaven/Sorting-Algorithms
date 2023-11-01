import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> array = new ArrayList<Integer>();
    static Boolean isSorted = false;

    public static void main(String[] args) {
        do {
            clearScreen();
            printMenuPrincipal();
            System.out.print("\nDigite uma opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    insert();
                    break;
                case 2:
                    shuffle();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (true);
    }

    private static void printMenuPrincipal() {
        System.out.println("======== MENU ========");
        if (array.isEmpty()) {
            System.out.println("     Array vazio!");
        } else {
            if (isSorted) {
                System.out.println(" /Array ordenado: ");
                printList(array, null);
                System.out.println();
                System.out.println(" /Array Decrescente: ");
                printList(array, true);
            } else {
                System.out.println(" /Array: ");
                printList(array, null);
            }
            System.out.println();
        }
        System.out.println("======================\n");
        System.out.println("1 - Inserir");
        System.out.println("2 - Embaralhar");
        System.out.println("3 - Ordenar");
        System.out.println("4 - Sair");
    }

    private static void printSortMenu() {
        System.out.println("===== MENU DE ORDENAÇÃO =====\n");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        System.out.println("4 - Merge Sort");
        System.out.println("5 - Quick Sort");
        System.out.println("6 - Voltar");
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void sort() {
        do {
            if (array.isEmpty()) {
                System.out.println("Array vazio!");
                sleep(1000);
                return;
            }
            clearScreen();
            printSortMenu();
            System.out.print("\nDigite uma opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    BubbleSort.illustrativeSort(array);
                    isSorted = true;
                    return;
                case 2:
                    SelectionSort.sort(array);
                    isSorted = true;
                    return;
                case 3:
                    InsertionSort.sort(array);
                    isSorted = true;
                    return;
                case 4:
                    MergeSort.sort(array);
                    isSorted = true;
                    return;
                case 5:
                    QuickSort.sort(array);
                    isSorted = true;
                    return;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (true);
    }

    private static void insert() {
        System.out.print("Insira um número: ");
        int n = sc.nextInt();

        if (array.contains(n)) {
            System.out.println("Número já existe no array!");
        } else {
            array.add(n);
            isSorted = false;
        }
    }

    public static void shuffle() {
        for (int i = 0; i < array.size(); i++) {
            int randomPosition = (int) (Math.random() * array.size());
            int temp = array.get(i);
            array.set(i, array.get(randomPosition));
            array.set(randomPosition, temp);
            isSorted = false;
        }
    }

    private static void printList(ArrayList<Integer> array, Boolean descending) {
        descending = descending == null ? false : descending;
        if (descending) {
            System.out.print("[");
            for (int i = array.size() - 1; i > 0; i--) {
                System.out.print(array.get(i) + ", ");
            }
            System.out.print(array.get(0) + "]");
            return;
        }
        int i;
        System.out.print("[");
        for (i = 0; i < array.size() - 1; i++) {
            System.out.print(array.get(i) + ", ");
        }
        System.out.print(array.get(i) + "]");
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
