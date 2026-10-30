//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Sum (For Loop): " + SumCalculator.sumUsingForLoop(number));
        System.out.println("Sum (While Loop): " + SumCalculator.sumUsingWhileLoop(number));
        System.out.println("Sum (Recursion): " + SumCalculator.sumUsingRecursion(number));

    }
}