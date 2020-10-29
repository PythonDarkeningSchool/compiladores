package com.uteg.compilers.basic_operators;

public class LogicalOperators {

    /** Class properties */

    private final String token;

    /** Class constructor
     *
     * param token: the word/character to be validated
     * */

    public LogicalOperators(String token){
        this.token = token;
    }

    /** Returns true if the word to be evaluated is the 'logical and' operator */
    public boolean isLogicalAnd(){
        if(token.equals("&&")){
            System.out.printf("The word/character typed: (%s), it is an 'logical and' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'logical or' operator */
    public boolean isLogicalOr(){
        if(token.equals("||")){
            System.out.printf("The word/character typed: (%s), it is an 'logical or' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'logical not' operator */
    public boolean isLogicalNot(){
        if(token.equals("!")){
            System.out.printf("The word/character typed: (%s), it is an 'logical not' operator%n", token);
            return true;
        }

        return false;
    }
}
