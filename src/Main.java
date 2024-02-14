import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] menuItems = {"Bubblegum", "Toffee", "Ice cream", "Milk chocolate",
                "Doughnut", "Pancake"};

        double[] prices = {2,0.2,5,4,2.5,3.2};

        int[] earnedAmount = {202,118,2250,1680,1075,80};

        double income = 0;

        System.out.println("Prices: ");

        for(int i = 0; i<menuItems.length; i++) {
            System.out.println(menuItems[i]+ ": $" + prices[i]);
        }

        System.out.println("\nEarned amount:");
        for(int i = 0; i<menuItems.length; i++) {
            System.out.println(menuItems[i]+ ": $" + earnedAmount[i]);
            income += earnedAmount[i];
        }

        System.out.println("\nIncome: $" + income);

        System.out.println("Staff expenses:");
        int staff = scanner.nextInt();
        System.out.println("Other expenses:");
        int other = scanner.nextInt();
        int total = staff+other;

        System.out.print("Net income: $" + (income-total));
        
    }
}