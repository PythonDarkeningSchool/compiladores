package com.uteg.compilers.validations.basic_operators;

import com.uteg.compilers.basic_operators.BitwiseOperators;

import java.util.ArrayList;
import java.util.List;

public class BitwiseValidations {

    /** Static method to validate the arithmetic operators */

    public static List<Boolean> validate(String wordToValidate){
        BitwiseOperators bitwiseOperators = new BitwiseOperators(wordToValidate); // Instantiating the class

        List<Boolean> booleanList = new ArrayList<Boolean>(); // Declare a list of boolean type

        // Adding all the validations to a boolean list
        booleanList.add(bitwiseOperators.isBitwiseAnd());
        booleanList.add(bitwiseOperators.isBitwiseOr());
        booleanList.add(bitwiseOperators.isBitwiseXor());
        booleanList.add(bitwiseOperators.isBitwiseCompliment());
        booleanList.add(bitwiseOperators.isLeftShift());
        booleanList.add(bitwiseOperators.isRightShift());
        booleanList.add(bitwiseOperators.isZeroFillRightShift());

        // return the boolean list with all the boolean validations
        return booleanList;
    }
}
