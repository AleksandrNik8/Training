package lesson;

public class Th3 {
    public static void main(String[] args) {
        int c = 0;
        for (int a = 2; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                c = a * b;
                System.out.println(a + "*" + b + "=" + c);
            }
        }
    }
    /*    int a = 2;
        int b = 1;
        int c = 0;
        int j = 0;
        while (j < 9) {
            for (int i = 0; i < 9; i++) {
                c = a * b;
                System.out.println(b + "*" + a + "=" + c);
                a = a + 1;
                if (a == 10) {
                    j++;
                    b++;
                    a = 2;
                }
            }
        }*/


}