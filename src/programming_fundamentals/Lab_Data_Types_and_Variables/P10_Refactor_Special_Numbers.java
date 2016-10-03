/**
 * 10. Refactor Special Numbers
 */
package programming_fundamentals.Lab_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P10_Refactor_Special_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0; 
        int temp = 0; 
        Boolean isSpecial = false;
        for (int i = 1; i <= num; i++)
        {
            temp = i;
            while (i > 0)
            {
                sum += i % 10;
                i = i / 10;
            }
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.println(String.format("%s -> True", temp));
            } else {
                System.out.println(String.format("%s -> False", temp));
            }
            sum = 0;
            i = temp;
        }
    }
}
