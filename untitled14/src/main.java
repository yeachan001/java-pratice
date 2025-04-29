import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

       
        System.out.println("하나의 정수 입력:");
        x = sc.nextInt();

        if (x >=1 &&  x<=100) {
            System.out.println("1에서 100사이의 값입니다.");
        }else{
            System.out.println("1에서 100사이의 값이 아닙니다.");
        }

    }
}