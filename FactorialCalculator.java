/*Why we need to consider about coding best practices?
● Benefits of Best Practices:
○ Improved Code Quality: Fewer bugs, easier debugging, and enhanced
software reliability.
○ Efficient Collaboration: Easier teamwork and smoother handovers.
○ Future-Proofing: Code that can evolve with changing requirements.*/

public class FactorialCalculator {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

