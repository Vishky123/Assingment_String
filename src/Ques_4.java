import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the string");
        String inputString = sc.nextLine();
        inputString = inputString.toLowerCase();
        char[] ch = inputString.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count += 1;
                switch (count) {
                    case 1:
                        ch[i] = '*';
                        break;
                    case 2:
                        ch[i] = '^';
                        break;
                    case 3:
                        ch[i] = '!';
                        break;
                    case 4:
                        ch[i] = '*';
                        break;
                    case 5:
                        ch[i] = '^';
                        break;
                }
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        sc.close();
    }
}
