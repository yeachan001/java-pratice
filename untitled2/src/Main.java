import java.util.Scanner;//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int drinking, size, op;

                System.out.println("1.아메리카노 2.카페라떼 3.카푸치노");
                drinking = sc.nextInt();
                System.out.println("1.작게 2.보통 3.크게");
                size = sc.nextInt();
                System.out.println("1.샷추가 2.시럽추가 3.샷+시럽추가");
                op = sc.nextInt();

                if (drinking == 1) {
                        drinking = 3500;
                } else if (drinking == 2) {
                        drinking = 4000;
                } else if (drinking == 3) {
                        drinking = 4500;
                } else {
                        System.out.println("오류입니다.");
                        return;
                }
                if (size == 1) {
                        size = 0;

                } else if (size == 2) {
                        size = 500;
                } else if (size == 3) {
                        size = 1000;
                } else {
                        System.out.println("오류입니다.");
                        return;
                }

                if (op == 1) {
                        op = 500;
                } else if (op == 2) {
                        op = 300;
                } else if (op == 3) {
                        op = 800;
                } else {
                        System.out.println("오류입니다.");
                        return;
                }

                System.out.println("최종 가격은" + (drinking + size + op) + "원 입니다.");


        }
}
