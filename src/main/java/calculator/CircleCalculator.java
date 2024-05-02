package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    public CircleCalculator(ArrayList<Double> resultArrList) {
        super(resultArrList);
    }

    public double calculate(double radius){
        return pi * radius * radius;
    }

    @Override
    public void inquiryResults(){
        for (Double circleResult : super.getResultArrList()) {
            System.out.println("연산결과 = " + circleResult);
        }
    }
}
