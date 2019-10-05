import java.util.Scanner;

public class Ques_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String Value : ");
        String stringInput = sc.nextLine();
        System.out.println("Enter value of subString : ");
        String subString = sc.nextLine();
        System.out.println("Enter the  value to be Replaced with   : ");
        String subStringForReplacement = sc.nextLine();

        String newString = stringInput.replace(subString,subStringForReplacement);
        System.out.println("new string : " + newString);
        sc.close();
    }
}
