import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        String shape = sc.next();
       
        switch(shape){
            case "rectangle":
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a * b);
                break;
                
            case "square":
                a = sc.nextInt();
                System.out.println((int)Math.pow(a,2));
                break;
        }
    }
}
