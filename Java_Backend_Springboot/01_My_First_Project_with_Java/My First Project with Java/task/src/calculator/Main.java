package calculator;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bubblegum = 0;
        int toffee = 0;
        int iceCream = 0;
        int milkChocolate = 0;
        int doughNut = 0;
        int pancake = 0;

        bubblegum += 202;
        toffee += 118;
        iceCream += 2250;
        milkChocolate += 1680;
        doughNut += 1075;
        pancake += 80;
        int sum = bubblegum + toffee + iceCream + milkChocolate + doughNut + pancake;


        System.out.println("Earned amount: ");
        System.out.println("Bubblegum: $" + bubblegum);
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream: $" +iceCream);
        System.out.println("Milk chocolate: $" + milkChocolate);
        System.out.println("Doughnut: $" + doughNut);
        System.out.println("Pancake: $" + pancake + "\n");
        System.out.println("Income: = $" + sum);

        System.out.println("Staff expenses: ");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses: ");
        int otherExpenses = scanner.nextInt();
        int netIncome = sum - staffExpenses - otherExpenses;
        System.out.printf("Net income: $%d",netIncome);
        scanner.close();
    }
}