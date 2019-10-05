import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        char[] chr = str.toCharArray();
        for (int i = 0; i < chr.length; i++)
        {
            if (chr[i]=='a'||chr[i]=='e'||chr[i]=='i'||chr[i]=='o'||chr[i]=='u'||chr[i]=='A'||chr[i]=='E'||chr[i]=='I'||chr[i]=='O'||chr[i]=='U')
            {
                chr[i]='*';
            }
        }
        for (int i = 0; i < chr.length; i++) {
            System.out.print(chr[i]);
        }
        sc.close();
    }
}


