package com.uteg.compilers.validations.basic_operators;

import com.uteg.compilers.basic_operators.AssignmentOperators;

import java.util.ArrayList;
import java.util.List;

public class AssignmentValidations {

    /** Static method to validate the arithmetic operators */

    public static List<Boolean> validate(String wordToValidate){
        AssignmentOperators assignmentOperators = new AssignmentOperators(wordToValidate); // Instantiating the class

        List<Boolean> booleanList = new ArrayList<Boolean>(); // Declare a list of boolean type

        // Adding all the validations to a boolean list
        booleanList.add(assignmentOperators.isSimpleAssignment());
        booleanList.add(assignmentOperators.isAddAndAssignment());
        booleanList.add(assignmentOperators.isSubtractAndAssignment());
        booleanList.add(assignmentOperators.isMultiplyAndAssignment());
        booleanList.add(assignmentOperators.isDivideAndAssignment());
        booleanList.add(assignmentOperators.isModulusAndAssignment());
        booleanList.add(assignmentOperators.isLeftShiftAndAssignment());
        booleanList.add(assignmentOperators.isRightShiftAndAssignment());
        booleanList.add(assignmentOperators.isBitwiseAndAssignment());
        booleanList.add(assignmentOperators.isBitwiseExclusiveOrAndAssignment());
        booleanList.add(assignmentOperators.isBitwiseInclusiveOrAndAssignment());

        // return the boolean list with all the arithmetic validations
        return booleanList;
    }
}
