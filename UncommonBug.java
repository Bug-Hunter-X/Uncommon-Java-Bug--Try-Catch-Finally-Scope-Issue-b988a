public class UncommonBug {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = Integer.parseInt("10a"); //Potential NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
        } finally {
            System.out.println("x = " + x); //x is still 5, not 10
        }
    }
}