package alpha;
/*
 * @author Rohan Ghosh
 */
import java.util.*;
public class Alpha {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=s.charAt(0);
        if(Character.isLetter(ch)==true) System.out.println("alphabet");
        else System.out.println("not alphabet");
    }
    
}
