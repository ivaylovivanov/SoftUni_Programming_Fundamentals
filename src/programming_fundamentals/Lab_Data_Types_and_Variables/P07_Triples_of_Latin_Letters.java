/**
 * Write a program to read an integer n and print all triples of the first n 
 * small Latin letters, ordered alphabetically:
 */
package programming_fundamentals.Lab_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P07_Triples_of_Latin_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    System.out.println(alphabet[i] + "" + alphabet[j] + "" + alphabet[k]);
                }
            }
        }
    }
}
