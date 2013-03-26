package Evaluator.Calculator.Calculators;

import Evaluator.Annotations.Operation;
import Evaluator.Calculator.Calculator;

public class NumberCalculator extends Calculator {
    
    @Operation(signature = "addDoubleDouble")
    public Double add(Double arg1, Double arg2) {
        return arg1 + arg2;
    }
    
    @Operation(signature = "addDoubleInteger")
    public Double add(Double arg1, Integer arg2) {
        return arg1 + arg2;
    }
    
    @Operation(signature = "addIntegerDouble")
    public Double add(Integer arg1, Double arg2) {
        return arg1 + arg2;
    }
    
    @Operation(signature = "addIntegerInteger")
    public Integer add(Integer arg1, Integer arg2) {
        return arg1 + arg2;
    }
    
    @Operation(signature = "substractDoubleDouble")
    public Double substract(Double arg1, Double arg2) {
        return arg1 - arg2;
    }
    
    @Operation(signature = "substractDoubleInteger")
    public Double substract(Double arg1, Integer arg2) {
        return arg1 - arg2;
    }
    
    @Operation(signature = "substractIntegerDouble")
    public Double substract(Integer arg1, Double arg2) {
        return arg1 - arg2;
    }
    
    @Operation(signature = "substractIntegerInteger")
    public Integer substract(Integer arg1, Integer arg2) {
        return arg1 - arg2;
    }
    
    @Operation(signature = "multiplyDoubleDouble")
    public Double multiply(Double arg1, Double arg2) {
        return arg1 * arg2;
    }
    
    @Operation(signature = "multiplyDoubleInteger")
    public Double multiply(Double arg1, Integer arg2) {
        return arg1 * arg2;
    }
    
    @Operation(signature = "multiplyIntegerDouble")
    public Double multiply(Integer arg1, Double arg2) {
        return arg1 * arg2;
    }
    
    @Operation(signature = "multiplyIntegerInteger")
    public Integer multiply(Integer arg1, Integer arg2) {
        return arg1 * arg2;
    }
    
    @Operation(signature = "divideDoubleDouble")
    public Double divide(Double arg1, Double arg2) {
        return arg1 / arg2;
    }
    
    @Operation(signature = "divideDoubleInteger")
    public Double divide(Double arg1, Integer arg2) {
        return arg1 / arg2;
    }
    
    @Operation(signature = "divideIntegerDouble")
    public Double divide(Integer arg1, Double arg2) {
        return arg1 / arg2;
    }
    
    @Operation(signature = "divideIntegerInteger")
    public Integer divide(Integer arg1, Integer arg2) {
        return arg1 / arg2;
    }
}
