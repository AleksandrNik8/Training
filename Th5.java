package lesson;

import java.util.Scanner;

public class Th5 {
    public static void main(String[] args) {
        int a; //год
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год");
        a = scan.nextInt();
        if (a % 4 == 0 | a % 150 == 0) {
            System.out.println(a + " год високосный");
        } else {
            System.out.println("Введенный год " + a + " не является високосным");
        }
    }
}
