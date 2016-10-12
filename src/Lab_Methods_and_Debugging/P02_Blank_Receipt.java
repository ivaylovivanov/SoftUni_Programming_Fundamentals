/**
 * Create a method that prints a blank cash receipt. The method should invoke 
 * three other methods: one for printing the header, one for the body and one 
 * for the footer of the receipt. 
 */
package Lab_Methods_and_Debugging;

/**
 *
 * @author There Be Dragons
 */
public class P02_Blank_Receipt {
    public static void main(String[] args) {
        PrintReceit();
    }
    
    static void PrintReceit(){
        Header();
        Body();
        Footer();
    }
    
    public static void Header(){
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }
    
    public static void Body() {
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }
    
    public static void Footer() {
        System.out.println("------------------------------");
        System.out.println("\u00A9 SoftUni");
    }
}
