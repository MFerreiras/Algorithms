import java.util.*;

public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0, r = 0, area = 0;
        String shape = sc.next();
        
        switch(shape){
            
            case "circle":
                r    = sc.nextDouble(); //radio
                area = 3.14 * (Math.pow(r, 2));
                System.out.printf("%.2f %n", area);
            break;
            
            case "triangle":
                a    = sc.nextDouble(); //altura
                b    = sc.nextDouble(); //base
                area = (a * b) / 2;
                System.out.printf("%.2f %n",area);
            break;
            
            case "rhombus":
                a    = sc.nextDouble(); //diagonal 1
                b    = sc.nextDouble(); //diagonal 2
                area = (a * b) / 2;
                System.out.printf("%.2f %n",area);
            break;
           
        }
    }
}