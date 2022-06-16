import javax.swing.event.SwingPropertyChangeSupport;

public class Main {

    void solution(int[] array, int k) {

        int garis = 0;
        k = array.length < k ? array.length : k;
        for (int a = 0; a < array.length; a++) {
            garis = garis < ("" + array[a]).length() ? ("" + array[a]).length() : garis;
        }

        int catat = 0;
        for (int a = 1; a <= 3; a++) {
            if (a % 2 == 1) {
                if (catat == array.length && a == 3) {
                    k = array.length % k == 0 ? k - (array.length % k) : array.length % k;

                }
                for (int b = 0; b < k; b++) {
                    System.out.print("+");
                    for (int c = 0; c < garis; c++) {
                        System.out.print("-");
                    }
                    if (b + 1 == k) {
                        System.out.println("+");
                    }
                    if (b + 1 == k && a == 3) {
                        System.out.print("");
                        if (catat < array.length) {
                            a = 1;
                        }
                    }
                }
            } else {
                if (catat < array.length) {
                    for (int b = 0; b < k; b++) {
                        System.out.print("|");
                        if (("" + array[catat]).length() < garis) {
                            for (int c = 0; c < (garis - ("" + array[catat]).length()); c++) {
                                System.out.print(" ");
                            }
                        }
                        System.out.print(array[catat]);
                        catat++;
                        if (catat == array.length) {
                            b = k;
                        }

                    }
                    System.out.println("|");
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] array1 = { 4, 35, 80, 123, 12345, 44, 8, 5, 24, 3 };
        Main mencoba1 = new Main();
        mencoba1.solution(array1, 4);
    }
}
