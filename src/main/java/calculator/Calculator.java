package calculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */

    private ArrayList<Integer> resultArrList;

    private ArrayList<Double> circleArrList;
    private static final double pi = 3.14;

    public Calculator(ArrayList<Integer> resultArrList, ArrayList<Double> circleArrList){
        this.resultArrList = resultArrList;
        this.circleArrList = circleArrList;
    }

    public int calculate(int num1, int num2, char operator) throws BadException {
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
        resultArrList.add(result);
        return result;

    }

    public double circle(double radius){
        return pi * radius * radius;
    }

    public ArrayList<Integer> getResultArrList() {
        return resultArrList;
    }

    public void setResultArrList(ArrayList<Integer> resultArrList) {
        this.resultArrList = resultArrList;
    }

    public ArrayList<Double> getCircleArrList() {
        return circleArrList;
    }

    public void setCircleArrList(ArrayList<Double> circleArrList) {
        this.circleArrList = circleArrList;
    }

    // 2-4
    public void removeResult(int index){
        this.resultArrList.remove(index);
    }

    public void inquiryResults(){
        for (Integer i : resultArrList) {
            System.out.println("연산결과 = "+resultArrList);
        }
    }

    public void inquiryCircleResults(){
        for (Double v : circleArrList) {
            System.out.println("연산결과 = " + circleArrList);
        }
    }
}
