import java.util.Scanner;

class CoffeePriceCalculat2or {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int drinkType = sc.nextInt();

        System.out.println("사이즈를 선택하세요: 1-small 2-medium 3-Large");
        int size = sc.nextInt();

        System.out.println("옵션을 선택하세요: 1-기본 2-샷추가 3-샷과 시럽 모두 추가");
        int op = sc.nextInt();

        int basePrice = 0;

        switch (drinkType) {
            case 1:
                basePrice = 3000; 
                break;
            case 2:
                basePrice = 4000;
                break;
            case 3:
                basePrice = 4500;
                break;
            default:
                System.out.println("잘못된 음료 선택입니다.");
                return;
        }



        System.out.println("최종 가격은: " + basePrice + "원 입니다.");
    }
}
