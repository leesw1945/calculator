package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        ArrayList<Integer> resultArrList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int result = 0;
        while (true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            switch (operator){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                default:
                    System.out.println("잘 못 입력하였습니다.");
                    continue;
            }
            System.out.println("결과: " + result);

            // ArrayList 1-7
            resultArrList.add(result);

            String lineFeed = sc.nextLine();
            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.nextLine();
            if (remove.equals("remove")){
                resultArrList.remove(0);
            }
            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            if (inquiry.equals("inquiry")){
                for (int select : resultArrList){
                    System.out.println(select);
                }
            }
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();
            if (exit.equals("exit")){
                break;
            }
        }
        System.out.println(resultArrList.toString());
    }
}
