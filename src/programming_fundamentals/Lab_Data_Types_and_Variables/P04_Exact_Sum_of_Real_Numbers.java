/**
 * Write program to enter n numbers and calculate and print their exact 
 * sum (without rounding).
 */
package programming_fundamentals.Lab_Data_Types_and_Variables;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P04_Exact_Sum_of_Real_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        BigDecimal sum = BigDecimal.valueOf(0);
        
        for (int i = 0; i < n; i++) {
            Scanner sc1 = new Scanner(System.in);
            sum = sum.add(sc1.nextBigDecimal());
        }
        
        System.out.print(sum);
    }
}
