package oe;

/**
 *
 * @author Rohan Ghosh
 */
import java.util.*;
public class Oe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(n%2==0) System.out.println("EVEN");
        else System.out.println("ODD");
    }
    
}
