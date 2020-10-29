package com.uteg.compilers.basic_operators;

public class ArithmeticOperators {

    /** Class properties */

    private final String token;

    /** Class constructor
     *
     * param token: the word/character to be validated
     * */

    public ArithmeticOperators(String token){
        this.token = token;
    }

    /** Returns true if the word to be evaluated is the 'addition' operator */
    public boolean isAddition(){
        if(token.equals("+")){
            System.out.printf("The word/character typed: (%s), it is an 'addition' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'subtraction' operator */
    public boolean isSubtraction(){
        if(token.equals("-")){
            System.out.printf("The word/character typed: (%s), it is a 'subtraction' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'multiplication' operator */
    public boolean isMultiplication(){
        if(token.equals("*")){
            System.out.printf("The word/character typed: (%s), it is a 'multiplication' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'division' operator */
    public boolean isDivision(){
        if(token.equals("/")){
            System.out.printf("The word/character typed: (%s), it is a 'division' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'modulus' operator */
    public boolean isModulus(){
        if(token.equals("%")){
            System.out.printf("The word/character typed: (%s), it is a 'modulus' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'increment' operator */
    public boolean isIncrement(){
        if(token.equals("++")){
            System.out.printf("The word/character typed: (%s), it is an 'increment' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'decrement' operator */
    public boolean isDecrement(){
        if(token.equals("--")){
            System.out.printf("The word/character typed: (%s), it is a 'decrement' operator%n", token);
            return true;
        }

        return false;
    }
}
