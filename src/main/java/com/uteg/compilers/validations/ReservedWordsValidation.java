package com.uteg.compilers.validations;

import com.uteg.compilers.ReservedWords;

import java.util.ArrayList;
import java.util.List;

public class ReservedWordsValidation {

    /** Static method to validate the arithmetic operators */

    public static List<Boolean> validate(String wordToValidate){
        ReservedWords reservedWords = new ReservedWords(wordToValidate); // Instantiating the class

        List<Boolean> booleanList = new ArrayList<Boolean>(); // Declare a list of boolean type

        // Adding all the validations to a boolean list
        booleanList.add(reservedWords.isReservedWord());

        // return the boolean list with all the boolean validations
        return booleanList;
    }
}
