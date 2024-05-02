package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    public ArithmeticCalculator(ArrayList<Double> resultArrList, AddOperator addOperator, SubtractOperator subtractOperator,
                                MultiplyOperator multiplyOperator, DivideOperator divideOperator) {
        super(resultArrList);
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
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
                result = addOperator.operate(num1, num2);
                break;
            case '-':
                result = subtractOperator.operate(num1, num2);
                break;
            case '/':
                if (num2 == 0) {
                    throw new BadException();
                }
                result = divideOperator.operate(num1, num2);
                break;
            case '*':
                result = multiplyOperator.operate(num1, num2);
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
