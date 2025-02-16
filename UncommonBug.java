public class UncommonBug {
    public static void main(String[] args) {
        int x = 0;
        try {
            System.out.println(10 / x); // potential ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
        } finally {
            System.out.println("finally block executed"); //Always executed
            x = 10; //Modifying x in finally
            System.out.println(10 / x); //This will run without error
        }
    }
}