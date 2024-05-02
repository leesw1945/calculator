package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {



    public ArithmeticCalculator(ArrayList<Double> resultArrList) {
        super(resultArrList);
    }


    public double calculate(int num1, int num2, char operator) throws BadException {
        return operateFactory(operator).operate(num1, num2);
    }

    private  Operator operateFactory(char operator){
        return switch (operator) {
            case '+' -> new AddOperator();
            case '-' -> new SubtractOperator();
            case '*' -> new MultiplyOperator();
            case '/' -> new DivideOperator();
            case '%' -> new ModOperator();
            default -> throw new UnsupportedOperationException("올바른 선택이 아닙니다.");
        };
    }

    @Override
    public void inquiryResults(){
        for (Double result : super.getResultArrList()) {
            System.out.println("연산결과 = "+ result);
        }
    }
}
