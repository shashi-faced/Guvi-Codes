import java.util.Scanner;
 
public class check22{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        char firstChar = str.charAt(0);
        result = result + Character.toUpperCase(firstChar);
        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char previousChar = str.charAt(i - 1);
            if (previousChar == ' ') {
                result = result + Character.toUpperCase(currentChar);
            } else {
                result = result + currentChar;
            }
        }
        System.out.println(result);
    }
}