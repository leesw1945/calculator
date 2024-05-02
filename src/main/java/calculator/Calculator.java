package calculator;

import java.util.ArrayList;

public abstract class Calculator {

    private final ArrayList<Double> resultArrList;
    public static final double pi = 3.14;

    public Calculator(ArrayList<Double> resultArrList){
        this.resultArrList = resultArrList;
    }

    abstract void inquiryResults();


    public ArrayList<Double> getResultArrList() {
        return resultArrList;
    }

    public void removeResult(int index){
        this.resultArrList.remove(index);
    }


}
