

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        System.out.println(array.length);

        for (int j : array) {
            System.out.print("[" + j + "]");
        }
    }
}