package com.uteg.compilers.validations.basic_operators;

import com.uteg.compilers.basic_operators.RelationalOperators;

import java.util.ArrayList;
import java.util.List;

public class RelationalValidations {

    /** Static method to validate the relational operators */

    public static List<Boolean> validate(String wordToValidate){
        RelationalOperators relationalOperators = new RelationalOperators(wordToValidate); // Instantiating the class

        List<Boolean> booleanList = new ArrayList<Boolean>(); // Declare a list of boolean type

        // Adding all the validations to a boolean list
        booleanList.add(relationalOperators.isEqual());
        booleanList.add(relationalOperators.isNoEqual());
        booleanList.add(relationalOperators.isGreaterThan());
        booleanList.add(relationalOperators.isLessThan());
        booleanList.add(relationalOperators.isGreaterThanOrEqualTo());
        booleanList.add(relationalOperators.isLessThanOrEqualTo());

        // return the boolean list with all the boolean validations
        return booleanList;
    }
}
