import java.util.Scanner;//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");

        int sum = 0;
        int N=sc.nextInt();
        for (int i=0; i<N; i++) {
            if (i % 2 == 1) {
                sum += i;
                System.out.println("1부터 N까지의 홀수 값의 합:" + sum);
            }
        }
    }
}