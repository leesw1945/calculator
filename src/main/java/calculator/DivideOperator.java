package calculator;

public class DivideOperator implements Operator {
    @Override
    public int operate(int num1, int num2){
        if (num2 == 0){
            throw new ArithmeticException("0이 입력될 수 없다");
        }
        return num1 / num2;
    }
}
