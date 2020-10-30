package com.uteg.compilers.validations.PrimitiveDataTypes;

import com.uteg.compilers.PrimitiveDataTypes.Numbers;

import java.util.ArrayList;
import java.util.List;

public class NumbersValidation {

    /** Static method to validate the arithmetic operators */

    public static List<Boolean> validate(String wordToValidate){
        Numbers numbers = new Numbers(wordToValidate); // Instantiating the class

        List<Boolean> booleanList = new ArrayList<Boolean>(); // Declare a list of boolean type

        // Adding all the validations to a boolean list
        booleanList.add(numbers.isByte());
        booleanList.add(numbers.isDouble());
        booleanList.add(numbers.isChart());
        booleanList.add(numbers.isFloat());
        booleanList.add(numbers.isInt());
        booleanList.add(numbers.isLong());
        booleanList.add(numbers.isShort());

        // return the boolean list with all the boolean validations
        return booleanList;
    }
}
