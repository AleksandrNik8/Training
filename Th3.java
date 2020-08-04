package lesson;

public class Th3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 0;
        int j = 0;
        while (j < 9) {
            for (int i = 0; i < 9; i++) {
                c = a * b;
                System.out.println(b + "*" + a + "=" + c);
                a = a + 1;
                if (a==10) {
                    j++;
                    b++;
                    a = 2;
                }
                }
            }
        }



    }