import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double yearlyCost = 0;
        double winterCost;
        double fallCost;
        double summerCost;
        double springCost;

        System.out.println("What was your maintenance cost for the winter");
        winterCost = scan.nextDouble();
        System.out.println("What was your maintenance cost for the spring");
        springCost = scan.nextDouble();
        System.out.println("What was your maintenance cost for the summer");
        summerCost = scan.nextDouble();
        System.out.println("What was your maintenance cost for the fall");
        fallCost = scan.nextDouble();

        yearlyCost = winterCost + springCost + summerCost + fallCost;

        System.out.println("Your yearly maintenance cost for is $" + yearlyCost + ".");
    }
}