/**
 * Given an input integer, you must determine which primitive data types are 
 * capable of properly storing that input.You receive N – integer which can be 
 * arbitrarily large or small.You must determine if the given primitives are 
 * capable of storing it. 
 * If yes, then print:
 * {N} can fit in:
 * dataType
 * If there is more than one appropriate data type, print each one on its own 
 * line and order them by size
 * (sbyte < byte < short < ushort < int < uint < long).
 * If the number cannot be stored in one of the four aforementioned primitives, 
 * print the line: 
 * {N} can't fit in any type
 */
package Exercises_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author Ivailo
 */
public class P19_Different_Integers_Size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        Boolean flag = true;
        try {
            byte byteVal = Byte.parseByte(value);
            if (flag) {
                System.out.println(String.format("%s can fit in:", value));
                flag = false;
            }
            System.out.println("* byte");
        } catch (NumberFormatException e){
        }
        
        try {
            short shortVal = Short.parseShort(value);
            if (flag) {
                System.out.println(String.format("%s can fit in:", value));
                flag = false;
            }
            System.out.println("* short");
        } catch (NumberFormatException e){
        }
                
        try {
            int intVal = Integer.parseInt(value);
            if (flag) {
                System.out.println(String.format("%s can fit in:", value));
                flag = false;
            }
            System.out.println("* int");
        } catch (NumberFormatException e){
        }
                        
        try {
            long longVal = Long.parseLong(value);
            if (flag) {
                System.out.println(String.format("%s can fit in:", value));
                flag = false;
            }
            System.out.println("* long");
        } catch (NumberFormatException e){
            System.out.println(String.format("%s can't fit in any type", value));
        }
    }    
}
