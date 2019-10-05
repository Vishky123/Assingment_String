import java.util.Scanner;

public class Ques_1 {
    public static void main(String[] args) {
        int a,i;
        String S;
        char[] b;
        Scanner sc=new Scanner(System.in);
        S=sc.nextLine();
        a=S.length();
        b=S.toCharArray();
        System.out.print("Index=" );
        for(i=0;i<a;i++) {
            System.out.print(+ i + "\t");
        }
        System.out.println();
        System.out.print("chars=");
        for (i= 0; i <a ; i++) {
            System.out.print(b[i]+"\t");
        }
        sc.close();
    }
}
