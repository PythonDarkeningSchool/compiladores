package com.uteg.compilers.validations.basic_operators;

import com.uteg.compilers.basic_operators.LogicalOperators;

import java.util.ArrayList;
import java.util.List;

public class LogicalValidations {

    /** Static method to validate the arithmetic operators */

    public static List<Boolean> validate(String wordToValidate){
        LogicalOperators logicalOperators = new LogicalOperators(wordToValidate); // Instantiating the class

        List<Boolean> booleanList = new ArrayList<Boolean>(); // Declare a list of boolean type

        // Adding all the validations to a boolean list
        booleanList.add(logicalOperators.isLogicalAnd());
        booleanList.add(logicalOperators.isLogicalNot());
        booleanList.add(logicalOperators.isLogicalOr());

        // return the boolean list with all the boolean validations
        return booleanList;
    }
}
