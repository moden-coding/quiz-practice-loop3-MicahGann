/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. The test scores should be in a range from 0 to 100. If the user enters an invalid number
 *  tell them to re-enter the value. Keep track of the number of passing and failing test grades. Assume 
 *  that a failing grade is below a 60. When the user enters '-1', print out the number of passing and failing students.
 */


 import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int fail = 0;
        int pass = 0;
        while (true) {
            int score = Integer.valueOf(scanner.nextLine());
            if (score == -1) {
                break;
            } else if (score < 60) {
                fail = fail + 1;
                continue;
            } else if (score >= 60) {
                pass = pass +1;
                continue;
            } else if (score < 0 || score > 100) {
                System.out.println("Re-enter the Value.");
                continue;
            }
        }
        System.out.println("Passing Students: " + pass);
        System.out.println("Failing Students: " + fail);
    }
}
