import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요.");
        int score = sc.nextInt();
        String grade;

        if (score>=90) {
            grade = "A";
        } else if (score>=80) {
            grade = "B";
        }
        else if (score>=70) {
            grade = "c";
        }
        else if (score>=60) {
            grade = "D";
        }   else if (score>=0) {
            grade = "F";
        }
        else {
            grade = "error";
        }
        System.out.println("학점" + grade);


    }
}