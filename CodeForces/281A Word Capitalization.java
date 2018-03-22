import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char first = str.charAt(0);
        if(Character.isUpperCase(first))
        {
            System.out.println(str);
        }
        else{
            System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));
        }
    }
}
