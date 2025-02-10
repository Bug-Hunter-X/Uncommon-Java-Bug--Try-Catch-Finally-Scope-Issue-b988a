public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = Integer.parseInt("10a"); //Potential NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            x = 0; //Handle the exception by setting x to a default value
        } finally {
            System.out.println("x = " + x); //x will now be 0
        }
    }
}