package school.exam1;

import java.util.Scanner;

public class exam5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("나이를 입력하세요:");
        int age = in.nextInt();
        if(age >= 19)
            System.out.println("성년");
        else
            System.out.println("미성년");
        in.close();
    }
}
