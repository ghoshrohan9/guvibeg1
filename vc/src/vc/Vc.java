package vc;

/**
 *
 * @author Rohan Ghosh
 */
import java.util.*;
public class Vc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        S=S.toLowerCase();
        char ch=S.charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("VOWEL");
        }
        else System.out.println("CONSONANT");
    }
    
}
