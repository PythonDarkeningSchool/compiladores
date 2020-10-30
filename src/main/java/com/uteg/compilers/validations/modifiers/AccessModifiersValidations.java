package com.uteg.compilers.validations.modifiers;

import com.uteg.compilers.modifiers.AccessModifiers;

import java.util.ArrayList;
import java.util.List;

public class AccessModifiersValidations {

    /** Static method to validate the relational operators */

    public static List<Boolean> validate(String wordToValidate){
        AccessModifiers accessModifiers = new AccessModifiers(wordToValidate); // Instantiating the class

        List<Boolean> booleanList = new ArrayList<Boolean>(); // Declare a list of boolean type

        // Adding all the validations to a boolean list
        booleanList.add(accessModifiers.isPrivate());
        booleanList.add(accessModifiers.isDefault());
        booleanList.add(accessModifiers.isProtected());
        booleanList.add(accessModifiers.isPublic());

        // return the boolean list with all the boolean validations
        return booleanList;
    }
}
