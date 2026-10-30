import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciCalculator {

    public static List<BigInteger> getFirst100Fibonacci() {
        List<BigInteger> fibonacciList = new ArrayList<>();

        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        fibonacciList.add(first);
        fibonacciList.add(second);

        for (int i = 2; i < 100; i++) {
            BigInteger next = first.add(second);
            fibonacciList.add(next);

            first = second;
            second = next;
        }

        return fibonacciList;
    }

    public static void main(String[] args) {
        List<BigInteger> hundredFibonacci = getFirst100Fibonacci();

        System.out.println("First 100 Fibonacci Numbers:");
        for (int i = 0; i < hundredFibonacci.size(); i++) {
            System.out.println((i + 1) + ": " + hundredFibonacci.get(i));
        }
    }
}
