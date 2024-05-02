package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(ArrayList<Double> resultArrList) {
        super(resultArrList);
    }


    public double calculate(int num1, int num2, char operator) throws BadException {
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */

        int result = 0;

        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new BadException();
        }
        switch (operator) {
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
        return result;

    }

    @Override
    public void inquiryResults(){
        for (Double result : super.getResultArrList()) {
            System.out.println("연산결과 = "+ result);
        }
    }
}
