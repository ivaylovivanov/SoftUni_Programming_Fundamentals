/**
 * You are given two values of the same type as input. The values can be of type 
 * int, char of string. Create a method GetMax() that returns the greater of the 
 * two values: 
 */
package Lab_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P08_Greater_of_Two_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next().toLowerCase();
        switch (type) {
            case "int":
                System.out.println(GetMax(sc.nextLong(), sc.nextLong()));
                break;
            case "char":
                System.out.println(GetMax(sc.next().charAt(0), sc.next().charAt(0)));
                break;
            default:
                System.out.println(GetMax(sc.next(), sc.next()));
                break;
        }
    }
    
    static long GetMax(long a, long b){
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
    
    static char GetMax(char a, char b){
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
    
    static String GetMax(String a, String b){
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }
}
