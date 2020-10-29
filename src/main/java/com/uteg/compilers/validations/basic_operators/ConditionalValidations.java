package com.uteg.compilers.validations.basic_operators;

import com.uteg.compilers.basic_operators.ConditionalOperator;

import java.util.ArrayList;
import java.util.List;

public class ConditionalValidations {

    /** Static method to validate the arithmetic operators */

    public static List<Boolean> validate(String wordToValidate){
        ConditionalOperator conditionalOperator = new ConditionalOperator(wordToValidate); // Instantiating the class

        List<Boolean> booleanList = new ArrayList<Boolean>(); // Declare a list of boolean type

        // Adding all the validations to a boolean list
        booleanList.add(conditionalOperator.isQuestionMark());
        booleanList.add(conditionalOperator.isColon());

        // return the boolean list with all the boolean validations
        return booleanList;
    }
}
