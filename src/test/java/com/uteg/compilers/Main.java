package com.uteg.compilers;

import com.uteg.compilers.validations.basic_operators.*;

import java.util.*;

public class Main {

    /** Class attributes */

    private static final Scanner scanner = new Scanner(System.in);


    /** Class main method  */

    public static void main(String[] args) {
        System.out.println("Insert a word/character: ");
        String token = scanner.nextLine();  // Read user input

        for(String word: token.split(" ")){ // Iterating over all the words/characters given by the user
            String wordToValidate = word.trim(); // Removing blanks spaces from given the word

            List<Boolean> arithmeticValidations = ArithmeticValidations.validate(wordToValidate); // Performing the arithmetic validations

            List<Boolean> relationalValidations = RelationalValidations.validate(wordToValidate); // Performing the relational validations
            List<Boolean> bitwiseValidations = BitwiseValidations.validate(wordToValidate); // Performing the bitwise validations
            List<Boolean> conditionalValidations = ConditionalValidations.validate(wordToValidate); // Performing the conditional validations
            List<Boolean> logicalValidations = LogicalValidations.validate(wordToValidate); // Performing the logical validations
            List<Boolean> assignmentValidations = AssignmentValidations.validate(wordToValidate); // Performing the assignment validations

            // Create a boolean list with all the validations
            List<Boolean> allLexicalValidations = Arrays.asList(
                    arithmeticValidations.contains(true),
                    relationalValidations.contains(true),
                    bitwiseValidations.contains(true),
                    logicalValidations.contains(true),
                    assignmentValidations.contains(true),
                    conditionalValidations.contains(true)
            );


            // Verify if the current word/character pass the lexical validations
            if(!allLexicalValidations.contains(true)){
                System.out.printf("(Error) - The word/character: (%s), did not pass the lexical analysis%n", wordToValidate);
            }

        }

    }
}
