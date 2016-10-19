/**
 * You are assigned to rework a given piece of code which is working without 
 * bugs but is not properly formatted. The given program tracks stock prices and
 * gives updates about the significance in each price change. Based on the 
 * significance, there are four kind of changes: 
 * no change at all (price is  * equal to the previous), 
 * minor (difference is below the significance threshold), 
 * price up
 * price down. 
 */
package Lab_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P11_Price_Change_Alert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double granica = sc.nextDouble();
        double last = sc.nextDouble();
        for (int i = 0; i < n - 1; i++){
            double c = sc.nextDouble();
            double div = Proc(last, c); 
            Boolean isSignificantDifference = CheckDifference(div, granica);
            String message = Get(c, last, div, isSignificantDifference);
            System.out.println(message);
            last = c;
        }
    }
    
    private static String Get(double c, double last, double difference, Boolean significantDifference)
        {
            String to = "";
            if (difference == 0)
            {
                to = String.format("NO CHANGE: {0}", c);
            }
            else if (!significantDifference)
            {
                to = String.format("MINOR CHANGE: {0} to {1} ({2:F2}%)", last, c, difference);
            }
            else if (significantDifference && difference > 0)
            {
                to = String.format("PRICE UP: {0} to {1} ({2:F2}%)", last, c, difference);
            }
            else if (significantDifference && difference < 0)
            {
                to = String.format("PRICE DOWN: {0} to {1} ({2:F2}%)", last, c, difference);
            }

            return to;
        }

        private static Boolean CheckDifference(double limit, double isDiff)
        {
            return Math.abs(limit) >= isDiff;
        }

        private static double Proc(double l, double c)
        {
            double r = ((c - l) / l)*100;
            return r;
        }
}
