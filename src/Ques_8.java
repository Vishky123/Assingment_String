import java.util.Scanner;

public class Ques_8 {
    public static void main(String[] args) {
        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int upperCaseWeight = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                upperCaseWeight += (int) input.charAt(i);
            }
        }
        System.out.println("UpperCaseWeight of input String :" + upperCaseWeight);
        sc.close();
    }
}
