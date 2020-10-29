package com.uteg.compilers.basic_operators;

public class AssignmentOperators {

    /** Class properties */

    private final String token;

    /** Class constructor
     *
     * param token: the word/character to be validated
     * */

    public AssignmentOperators(String token){
        this.token = token;
    }

    /** Returns true if the word to be evaluated is the 'simple assignment operator' operator */
    public boolean isSimpleAssignment(){
        if(token.equals("=")){
            System.out.printf("The word/character typed: (%s), it is an 'simple assignment' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'Add AND assignment operator' operator */
    public boolean isAddAndAssignment(){
        if(token.equals("+=")){
            System.out.printf("The word/character typed: (%s), it is an 'Add AND assignment' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'Subtract AND assignment' operator */
    public boolean isSubtractAndAssignment(){
        if(token.equals("-=")){
            System.out.printf("The word/character typed: (%s), it is an 'Subtract AND assignment operator' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'Multiply AND assignment' operator */
    public boolean isMultiplyAndAssignment(){
        if(token.equals("*=")){
            System.out.printf("The word/character typed: (%s), it is an 'Multiply AND assignment operator' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'Divide AND assignment' operator */
    public boolean isDivideAndAssignment(){
        if(token.equals("/=")){
            System.out.printf("The word/character typed: (%s), it is an 'Divide AND assignment operator' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'Modulus AND assignment' operator */
    public boolean isModulusAndAssignment(){
        if(token.equals("%=")){
            System.out.printf("The word/character typed: (%s), it is an 'Modulus AND assignment operator' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'Left shift AND assignment' operator */
    public boolean isLeftShiftAndAssignment(){
        if(token.equals("<<=")){
            System.out.printf("The word/character typed: (%s), it is an 'Left shift AND assignment operator' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'Right shift AND assignment' operator */
    public boolean isRightShiftAndAssignment(){
        if(token.equals(">>=")){
            System.out.printf("The word/character typed: (%s), it is an 'Right shift AND assignment operator' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'Bitwise shift AND assignment' operator */
    public boolean isBitwiseAndAssignment(){
        if(token.equals("&=")){
            System.out.printf("The word/character typed: (%s), it is an 'Bitwise shift AND assignment operator' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'Bitwise exclusive OR and assignment' operator */
    public boolean isBitwiseExclusiveOrAndAssignment(){
        if(token.equals("^=")){
            System.out.printf("The word/character typed: (%s), it is an 'Bitwise exclusive OR and assignment operator' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'Bitwise inclusive OR and assignment' operator */
    public boolean isBitwiseInclusiveOrAndAssignment(){
        if(token.equals("|=")){
            System.out.printf("The word/character typed: (%s), it is an 'Bitwise inclusive OR and assignment operator' operator%n", token);
            return true;
        }

        return false;
    }
}
