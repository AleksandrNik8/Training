package lesson;

import java.util.Scanner;

public class Th1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Введите число");
        a = scan.nextInt();
       if (a>0) {
       System.out.print("Число положительное,");}
        if (a<0) {
            System.out.print("Число отрицательное,");}
        if (a==0) {
            System.out.print("Число равно 0,");}
        if (a % 2 == 0) {
            System.out.println(" четное.");
        } else {
            System.out.println(" нечетное.");
        }
        }
    }
