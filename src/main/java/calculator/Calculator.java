package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    ArrayList<Integer> resultArrList = new ArrayList<>();

    int result = 0;

    public int calculate(int num1, int num2, char check) throws BadException {
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */

        if (check != '+' && check != '-' && check != '*' && check != '/')
        {
            throw new BadException();
        }
        switch (check){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new BadException();
                    }
                    result = num1 / num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                default:
                    System.out.println("잘 못 입력하였습니다.");
                    break;
            }
            resultArrList.add(result);
            return result;

    }
}
