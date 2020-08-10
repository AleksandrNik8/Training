package lesson02;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drinks cocacola = new Drinks(10, "CocaCola");
        Drinks sprite = new Drinks(15, "Sprite");
        Drinks pepsi = new Drinks(20, "Pepsi");
        Expense expense = new Expense(0);
        int a;
        do {
            System.out.println("Введите 1 что бы посмотреть меню напитков");
            a = scanner.nextInt();

        } while (a != 1);
        System.out.println(cocacola.getName() + " стоит " + cocacola.getCoast());
        System.out.println(sprite.getName() + " стоит " + sprite.getCoast());
        System.out.println(pepsi.getName() + " стоит " + pepsi.getCoast());
        do {
            System.out.println("Что бы внести деньги на счет нажмите 1");
            a = scanner.nextInt();
        } while (a != 1);

        do {
            System.out.println("Введите сумму пополнения");
            int b = scanner.nextInt();
            expense.setExpense(expense.getExpense() + b);
            System.out.println("На вашем счету " + expense.getExpense());
        } while (expense.getExpense() < 10);

        do {
            System.out.println("что бы купить CocaCola нажмите 1");
            System.out.println("что бы купить Sprite нажмите 2");
            System.out.println("что бы купить Pepsi нажмите 3");
            a = scanner.nextInt();
            if (a != 1 & a != 2 & a != 3) {
                System.out.println("неправильный номер напитка");
            }
            // тут я хотел что бы в while условие проверялось и если пользователь ввел значение
            // вне диапазана 1-3 выводилось сообщение "неправильнный номер напитка",
            // но если и правильный номер выводилось тоже сообщение поэтому применил дополнительно if
        } while (a != 1 & a != 2 & a != 3);
        //  System.out.println("Неправильный номер напитка");
        scanner.close();
        if (a == 1) {
            if (expense.getExpense() >= cocacola.getCoast()) {
                expense.setExpense(expense.getExpense() - cocacola.getCoast());
                System.out.println("Заберите CocaCola, остаток на вашем счете " + expense.getExpense());
            } else {
                System.out.println("на вашем счете недостаточно денег, на вашем счете " + expense.getExpense());
            }
        } else if (a == 2) {
            if (expense.getExpense() >= sprite.getCoast()) {
                expense.setExpense(expense.getExpense() - sprite.getCoast());
                System.out.println("Заберите Sprite, остаток на вашем счете " + expense.getExpense());
            } else {
                System.out.println("на вашем счете недостаточно денег, на вашем счете " + expense.getExpense());
            }
        } else if (a == 3) {
            if (expense.getExpense() >= pepsi.getCoast()) {
                expense.setExpense(expense.getExpense() - pepsi.getCoast());
                System.out.println("Заберите Pepsi, остаток на вашем счете " + expense.getExpense());
            } else {
                System.out.println("на вашем счете недостаточно денег, на вашем счете " + expense.getExpense());
            }
        }
    }
}



