package com.uteg.compilers.validations.modifiers;

import com.uteg.compilers.modifiers.NonAccessModifiers;

import java.util.ArrayList;
import java.util.List;

public class NonAccessModifiersValidations {

    /** Static method to validate the relational operators */

    public static List<Boolean> validate(String wordToValidate){
        NonAccessModifiers nonAccessModifiers = new NonAccessModifiers(wordToValidate); // Instantiating the class

        List<Boolean> booleanList = new ArrayList<Boolean>(); // Declare a list of boolean type

        // Adding all the validations to a boolean list
        booleanList.add(nonAccessModifiers.isAbstract());
        booleanList.add(nonAccessModifiers.isFinal());
        booleanList.add(nonAccessModifiers.isStrictfp());

        // return the boolean list with all the boolean validations
        return booleanList;
    }
}
