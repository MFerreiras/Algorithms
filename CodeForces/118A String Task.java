
package string.task;

import java.util.Scanner;

public class StringTask {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String point = "";
       String str = in.nextLine(); 
       str = str.replaceAll("a|A|e|E|i|I|o|O|u|U|y|Y", "");
       
       for(int i = 0; i < str.length(); i++){
           point += "." + str.charAt(i);
       }
       
       System.out.println(point.toLowerCase());
    }
}
