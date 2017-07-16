package highest3;
/**
 * @author Rohan Ghosh
 */
import java.util.*;
public class Highest3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int tmp=(int)Math.max(b,c);
        System.out.println(Math.max(a, tmp));
    }
    
}
