package com.uteg.compilers.validations.basic_operators;

import com.uteg.compilers.basic_operators.ArithmeticOperators;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticValidations {

    /** Static method to validate the arithmetic operators */

    public static List<Boolean> validate(String wordToValidate){

        ArithmeticOperators arithmeticOperators = new ArithmeticOperators(wordToValidate); // Instantiating the class

        List<Boolean> booleanList = new ArrayList<Boolean>(); // Declare a list of boolean type

        // Adding all the validations to a boolean list
        booleanList.add(arithmeticOperators.isAddition());
        booleanList.add(arithmeticOperators.isSubtraction());
        booleanList.add(arithmeticOperators.isMultiplication());
        booleanList.add(arithmeticOperators.isDivision());
        booleanList.add(arithmeticOperators.isModulus());
        booleanList.add(arithmeticOperators.isIncrement());
        booleanList.add(arithmeticOperators.isDecrement());

        // return the boolean list with all the arithmetic validations
        return booleanList;
    }
}
