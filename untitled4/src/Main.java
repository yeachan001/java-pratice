import java.util.Scanner;

public class Main   {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


        double kor,math,Eng,Sci,Double,doubleAvg,sum,intAvg;

        int totalSubject = 4;
        boolean boolRslt = false;

        System.out.println("국어점수를 입력하시오");
        kor = sc.nextLong();
        System.out.println("수학점수를 입력하시오");
        math = sc.nextLong();
        System.out.println("영어점수를 입력하시오");
        Eng = sc.nextLong();
        System.out.println("과학점수를 입력하시오");
        Sci = sc.nextLong();

         sum = kor+math+Eng+Sci;
         intAvg = (int)sum/totalSubject;
         doubleAvg = sum/totalSubject;
         boolRslt=intAvg==doubleAvg;

        System.out.print("점수 평균은 + sum");

        System.out.print("정수 평균은 + sum");

        System.out.print("실수 평균은 + sum");

        System.out.print("점수 실수값 비교 + sum");





    }
}