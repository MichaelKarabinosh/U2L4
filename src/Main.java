import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to the Tip Calculator (Version 1.2)");
        System.out.println("Do NOT type any symbols when using the calculator!");
        System.out.println("----------------------------------------------");

        Scanner s = new Scanner(System.in);
        System.out.print("Bill Amount: $");
        String initialBill = s.nextLine(); // The bill before any tip calculations
        double initialBillConv = Double.parseDouble(initialBill); // Converts the string into a double for parsing

        System.out.print("Percent Tip: ");
        String tipPercent = s.nextLine(); // The tip to be applied
        double tipPercentConv = Double.parseDouble(tipPercent)/100; // Whole number tip is divided by 100 for easier calculations

        System.out.print("Number of People Paying: ");
        String numPeople = s.nextLine();
        int numPeopleConv = Integer.parseInt(numPeople); // numPeople is initialized as an int

        TipCalculator l = new TipCalculator(initialBillConv, tipPercentConv, numPeopleConv);
        l.printBill();

        s.close(); // Stops the scanner s to prevent memory leak

    }
}