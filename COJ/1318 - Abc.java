import java.util.*;

public class Main
{
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        String  str = " ";
            
        int Vector[] = new int[4];
            
        for(int i = 1; i < 4; i++){
            Vector[i] = sc.nextInt();
        }
        
        str = sc.next();
        Arrays.sort(Vector);
        
        if(str.equals("ABC")) {
            System.out.println(Vector[1] + " "+ Vector[2] + " " + Vector[3] + " ");
        }
            
        if(str.equals("ACB")) {
            System.out.println(Vector[1] + " " + Vector[3] + " " + Vector[2] + " ");
        }
		
        if(str.equals("BAC")) {
            System.out.println(Vector[2] + " " + Vector[1] + " " + Vector[3] + " ");
        }
		
        if(str.equals("BCA")) {
            System.out.println(Vector[2] + " " + Vector[3] + " " + Vector[1] + " ");
        }
		
        if(str.equals("CAB")) {
            System.out.println(Vector[3] + " " + Vector[1] + " " + Vector[2] + " ");
        }
		
        if(str.equals("CBA")) {
            System.out.println(Vector[3] + " " + Vector[2] + " " + Vector[1] + " ");
        }
    }
}