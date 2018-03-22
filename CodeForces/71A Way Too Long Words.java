
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for(int i = 0; i <= n; i++){
            String letter = in.nextLine();
            if(letter.length() > 10){
                    int first = letter.charAt(0);
                    int last = letter.length() - 1;
                    int r = last - 1;
                    System.out.println(letter.charAt(0) + "" + r + ""  + letter.charAt(last));
            }
            else{
                System.out.println(letter);
            }
        }
    }
}
