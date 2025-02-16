public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 0;
        try {
            System.out.println(10 / x); // potential ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
            System.out.println("Original Exception: " + e.getMessage()); // Log the original exception
        } finally {
            System.out.println("finally block executed");
            //Avoid modifying x here to prevent masking the original exception
        }
    }
} 