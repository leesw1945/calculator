package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(new ArrayList<>(), new ArrayList<>());

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("원하시는 계산을 입력하세요(원넓이 or 계산기)");
            String choice = sc.nextLine();

            if (choice.equals("원넓이")) {
                System.out.print("반지름을 입력해쥬세요");
                double radius = sc.nextDouble();
                String lineFeed = sc.nextLine();
                double area = calculator.circle(radius);
                calculator.getCircleArrList().add(area);
                System.out.println("원의 넓이는 " + area);

                System.out.println("저장된 원의 넓이");
                calculator.inquiryCircleResults();

                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
                String exit = sc.nextLine();
                if (exit.equals("exit")) {
                    break;
                }

            } else if (choice.equals("계산기")) {

                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                try {
                    calculator.calculate(num1, num2, operator);
                } catch (BadException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("결과: " + calculator.getResultArrList());
                String lineFeed = sc.nextLine();

                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.nextLine();
                if (remove.equals("remove")) {
                    calculator.removeResult(0);
                }
                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.nextLine();
                if (inquiry.equals("inquiry")) {
                    calculator.inquiryResults();
                }
                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
                String exit = sc.nextLine();
                if (exit.equals("exit")) {
                    break;
                }
                System.out.println(calculator.getResultArrList().toString());
            }
        }
    }
}
