package lesson;

import java.util.Scanner;

public class Th4 {
    public static void main(String[] args) {
        int b; // вид прогрессии
        int n; // колличество членов прогрессии
        int a; // первый член прогрессии, а после используем для вычисления n'го члена прогрессии
        int d; // разность для арифметической прогрессии
        int q; // знаменатель для геометрической прогрессии

        Scanner scan = new Scanner(System.in);
        System.out.println("что бы вывести арифметическую прогрессию введите 1, геометрическую 2");
        b = scan.nextInt();
        System.out.println("Для скольки членов вывести прогрессию?");
        n = scan.nextInt();
        if (b == 1) {
            System.out.println("Введите первый член прогрессии");
            a = scan.nextInt();
            System.out.println("Введите разность арифметической прогрессии");
            d = scan.nextInt();
            int j = 1;
            System.out.println(a + " -1 член прогрессии ");
            while (j < n) {
                a = a + d;
                j++;
                System.out.println(a + " -" + j + " член прогрессии");
            }

        }
        if (b == 2) {
            System.out.println("Введите первый член прогрессии");
            a = scan.nextInt();
            System.out.println("Введите знаменатель геометрической прогрессии");
            q = scan.nextInt();
            scan.close();
            System.out.println(a + " -1 член прогрессии ");
            int j = 1;
            while (j < n) {
                a = a * q;
                j++;
                System.out.println(a + " -" + j + " член прогрессии");
            }
        }
    }
}
