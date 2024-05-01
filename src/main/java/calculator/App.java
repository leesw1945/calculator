package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

//        int[] resultArr = new int[10];
//        int index = 0;
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

//            resultArr[index] = result;
//            index++;

            String lineFeed = sc.nextLine();
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();
            if (exit.equals("exit")){
                break;
            }
        }
//        System.out.println(Arrays.toString(resultArr));
    }
}
