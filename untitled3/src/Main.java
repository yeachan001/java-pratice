    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double kor,Eng,math,Sci,sum,doubleAvg,intAvg;
            System.out.print("국어점수를 입력하시오 ");
            kor = sc.nextInt();
            System.out.print("영어점수를 입력하시오 ");
            Eng = sc.nextInt();
            System.out.print("수학점수를 입력하시오 ");
            math = sc.nextInt();
            System.out.print("과학점수를 입력하시오 ");
            Sci = sc.nextInt();

            int totalSubject = 4;
            sum = kor+Eng+math+Sci;
            intAvg = (int)sum/totalSubject;
            doubleAvg = sum/totalSubject;
            boolean boolRslt = false;
            boolRslt = intAvg == doubleAvg;


            System.out.println("점수의 총점은" + sum);

            System.out.println("점수의 평균은" + intAvg);

            System.out.println("실수의 평균은" + doubleAvg);

            System.out.println("정수 실수값 비교"+ boolRslt);



        }
    }