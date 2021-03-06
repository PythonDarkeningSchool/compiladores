package com.uteg.compilers;

import com.uteg.compilers.validations.PrimitiveDataTypes.NumbersValidation;
import com.uteg.compilers.validations.ReservedWordsValidation;
import com.uteg.compilers.validations.basic_operators.*;
import com.uteg.compilers.validations.modifiers.AccessModifiersValidations;
import com.uteg.compilers.validations.modifiers.NonAccessModifiersValidations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    /** Class attributes */

    private static final Scanner scanner = new Scanner(System.in);


    /** Class main method  */

    public static void main(String[] args) {
        System.out.println("Insert a word/character: ");
        String token = scanner.nextLine();  // Read user input

        for(String word: token.split(" ")){ // Iterating over all the words/characters given by the user
            String wordToValidate = word.trim(); // Removing blanks spaces from given the word

            if(wordToValidate.startsWith("//")) // Ignore the comments
                continue;

            // Step 1: validate if the wordToValidate is in the following category:
            List<Boolean> arithmeticValidations = ArithmeticValidations.validate(wordToValidate); // Performing the arithmetic validations
            List<Boolean> relationalValidations = RelationalValidations.validate(wordToValidate); // Performing the relational validations
            List<Boolean> bitwiseValidations = BitwiseValidations.validate(wordToValidate); // Performing the bitwise validations
            List<Boolean> conditionalValidations = ConditionalValidations.validate(wordToValidate); // Performing the conditional validations
            List<Boolean> logicalValidations = LogicalValidations.validate(wordToValidate); // Performing the logical validations
            List<Boolean> assignmentValidations = AssignmentValidations.validate(wordToValidate); // Performing the assignment validations
            List<Boolean> accessModifiersValidation = AccessModifiersValidations.validate(wordToValidate); // Performing the Access Modifiers validations
            List<Boolean> nonAccessModifiersValidations = NonAccessModifiersValidations.validate(wordToValidate); // Performing the Non Access Modifiers validations
            List<Boolean> reservedWordsValidation = ReservedWordsValidation.validate(wordToValidate); // Performing the Reserved Words validations
            List<Boolean> numbersValidation = NumbersValidation.validate(wordToValidate); // Performing the Numbers validations


            // Step 2: create a boolean list with all the validations
            List<Boolean> allLexicalValidations = Arrays.asList(
                    arithmeticValidations.contains(true),
                    relationalValidations.contains(true),
                    bitwiseValidations.contains(true),
                    logicalValidations.contains(true),
                    assignmentValidations.contains(true),
                    conditionalValidations.contains(true),
                    accessModifiersValidation.contains(true),
                    nonAccessModifiersValidations.contains(true),
                    reservedWordsValidation.contains(true),
                    numbersValidation.contains(true)
            );


            // Step 3: verify if the current word/character pass the lexical validations
            if(!allLexicalValidations.contains(true)){

                // Step 4: if the current word/character did not pass the lexical validations, iterating over all their characters to validate again
                char[] charList = wordToValidate.toCharArray();

                for(char character: charList){
                    arithmeticValidations = ArithmeticValidations.validate(String.valueOf(character)); // Performing the arithmetic validations
                    relationalValidations = RelationalValidations.validate(String.valueOf(character)); // Performing the relational validations
                    bitwiseValidations = BitwiseValidations.validate(String.valueOf(character)); // Performing the bitwise validations
                    conditionalValidations = ConditionalValidations.validate(String.valueOf(character)); // Performing the conditional validations
                    logicalValidations = LogicalValidations.validate(String.valueOf(character)); // Performing the logical validations
                    assignmentValidations = AssignmentValidations.validate(String.valueOf(character)); // Performing the assignment validations
                    accessModifiersValidation = AccessModifiersValidations.validate(String.valueOf(character)); // Performing the Access Modifiers validations
                    nonAccessModifiersValidations = NonAccessModifiersValidations.validate(String.valueOf(character)); // Performing the Non Access Modifiers validations
                    reservedWordsValidation = ReservedWordsValidation.validate(String.valueOf(character)); // Performing the Reserved Words validations
                    numbersValidation = NumbersValidation.validate(String.valueOf(character)); // Performing the Numbers validations

                    allLexicalValidations = Arrays.asList(
                            arithmeticValidations.contains(true),
                            relationalValidations.contains(true),
                            bitwiseValidations.contains(true),
                            logicalValidations.contains(true),
                            assignmentValidations.contains(true),
                            conditionalValidations.contains(true),
                            accessModifiersValidation.contains(true),
                            nonAccessModifiersValidations.contains(true),
                            reservedWordsValidation.contains(true),
                            numbersValidation.contains(true)
                    );

                    if(!allLexicalValidations.contains(true))
                        System.out.printf("(Error) - The word/character: (%s), did not pass the lexical analysis%n", character);

                }
            }

        }

    }
}
