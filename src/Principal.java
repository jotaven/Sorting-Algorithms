import java.util.Scanner;

import java.util.ArrayList;


public class Principal {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> array = new ArrayList<Integer>();
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
                    //remove();
                    break;
                case 3:
                    shuffle();
                    break;
                case 4:
                    sort();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (true);
    }


    // print menu
    public static void printMenuPrincipal() {
        System.out.println("  --- MENU ---");
        if (array.isEmpty()) {
            System.out.println("Array vazio!");
        } else {
            System.out.println("Array: ");
            for (Integer integer : array) {
                System.out.print("[" + integer + "]");
            }
            System.out.println();
        }

        System.out.println("1 - Inserir");
        System.out.println("2 - Remover");
        System.out.println("3 - Embaralhar");
        System.out.println("4 - Ordenar");
        System.out.println("5 - Sair");
    }

    // print menu de ordenação
    public static void printSortMenu() {
        System.out.println("  --- MENU DE ORDENAÇÃO ---\n");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        System.out.println("4 - Merge Sort");
        System.out.println("5 - Quick Sort");
        System.out.println("6 - Voltar");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sort() {
        do {
            clearScreen();
            printSortMenu();
            System.out.print("\nDigite uma opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    BubbleSort.sort(array);
                    return;
                case 2:
                    SelectionSort.sort(array);
                    return;
                case 3:
                    InsertionSort.sort(array);
                    return;
                case 4:
                    MergeSort.sort(array);
                    return;
                case 5:
                    QuickSort.sort(array);
                    return;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (true);
    }


    public static void insert() {
        System.out.print("Insira um número: ");
        int n = sc.nextInt();

        if (array.contains(n)) {
            System.out.println("Número já existe no array!");
        } else {
            array.add(n);
        }
    }

    public static void remove() {
        System.out.print("Insira um número: ");
        int n = sc.nextInt();
        array.remove(n);
    }

    public static void shuffle() {
        for (int i=0; i<array.size(); i++) {
            int randomPosition = (int) (Math.random() * array.size());
            int temp = array.get(i);
            array.set(i, array.get(randomPosition));
            array.set(randomPosition, temp);
        }
    }
}

