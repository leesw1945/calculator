package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // 배열 1-5, 1-6
//        int[] resultArr = new int[10];
//        int index = 0;
//        int[] shiftArr = new int[resultArr.length];

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

            // 배열 1-5
//            resultArr[index] = result;
//            index++;

            // 한칸씩 앞으로 땡기기 1-6
//            if (index == 10){
//                resultArr[0] = 0;
//                for (int i = 0; i < resultArr.length; i++){
//                    resultArr[i] = resultArr[i+1];
//                }
//
//                for (int i = 1; i <= resultArr.length; i++){
//                    shiftArr[i - 1] = resultArr[i];
//                }
//            }

            // ArrayList 1-7
            resultArrList.add(result);

            String lineFeed = sc.nextLine();
            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.nextLine();
            if (remove.equals("remove")){
                resultArrList.remove(0);
            }
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();
            if (exit.equals("exit")){
                break;
            }
        }
        // 1-5, 1-6
//        System.out.println(Arrays.toString(resultArr));
//        System.out.println(Arrays.toString(shiftArr));
        System.out.println(resultArrList.toString());
    }
}
