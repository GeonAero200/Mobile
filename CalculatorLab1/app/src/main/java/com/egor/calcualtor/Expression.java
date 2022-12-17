package com.egor.calcualtor;

public class Expression {

    private String expression = "";

    public void saveExpression(String value){
        expression += value;
    }
    public String getExpression(){
        return expression;
    }
    public void clearExpression(){
        expression = "";
    }
}
