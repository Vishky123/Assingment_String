import java.util.Scanner;

public class Ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine().trim();
        int index_1 = sc.nextInt();
        int index_2 = sc.nextInt();
        System.out.println(str.substring(index_1, index_2));
        sc.close();
    }
}
