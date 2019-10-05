import java.util.Scanner;

public class Ques_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        input = input.toLowerCase();
        System.out.println("New Lower Case String :" + input);
        sc.close();
    }
}