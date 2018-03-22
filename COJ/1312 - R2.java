import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int r1  = sc.nextInt();
        int s   = sc.nextInt();
        int temp = s;
        int r2  = (s - r1) + temp;
        System.out.println(r2);
    }
}
