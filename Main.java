package lesson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in) ;
  int a;
  int b;
        System.out.println("Введите число a");
        a = scanner.nextInt();
        System.out.println("Введите число b");
        b = scanner.nextInt();
        if (a>b) {
            System.out.println("число a больше b");}
       else if (a<b) {
            System.out.println("число b больше a");}
       else if (a==b) {
            System.out.println("число a равно b");}
                }
      }

