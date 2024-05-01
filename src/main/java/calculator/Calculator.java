package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private ArrayList<Integer> resultArrList = new ArrayList<>();

    public ArrayList<Integer> getResultArrList() {
        return resultArrList;
    }

    public void setResultArrList(ArrayList<Integer> resultArrList) {
        this.resultArrList = resultArrList;
    }

    public int calculate(int num1, int num2, char operator) throws BadException {
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */

        int result = 0;

        if (operator != '+' && operator != '-' && operator != '*' && operator != '/')
        {
            throw new BadException();
        }
        switch (operator){
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
