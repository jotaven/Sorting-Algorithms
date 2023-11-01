import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Crie duas listas de inteiros não ordenados.
        ArrayList<Integer> array1 = new ArrayList<Integer>();

        array1.add(5);
        array1.add(4);
        array1.add(3);
        array1.add(2);

        ArrayList<Integer> array2 = new ArrayList<Integer>();

        array2.add(5);
        array2.add(4);
        array2.add(3);
        array2.add(2);

        // Chame os métodos Bubble Sort, Selection Sort e Insertion sort para classificar essas listas.

        BubbleSort.sort(array1);
        SelectionSort.sort(array2);

        // Exiba as listas ordenadas na saída padrão.

        System.out.println(array1);
        System.out.println(array2);

        // Teste o programa com diferentes listas de números não ordenados para verificar se os algoritmos de ordenação funcionam corretamente.

        ArrayList<Integer> array3 = new ArrayList<Integer>();
        array3.add(9);
        array3.add(3);
        array3.add(1);
        array3.add(2);

        BubbleSort.sort(array3);

        System.out.println(array3);


    }

}
