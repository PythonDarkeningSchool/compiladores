package com.uteg.compilers.basic_operators;

public class RelationalOperators {

    /** Class properties */

    private final String token;

    /** Class constructor
     *
     * param token: the word/character to be validated
     * */

    public RelationalOperators(String token){
        this.token = token;
    }

    /** Returns true if the word to be evaluated is the 'equal to' operator */
    public boolean isEqual(){
        if(token.equals("==")){
            System.out.printf("The word/character typed: (%s), it is an 'equal to' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'not equal' operator */
    public boolean isNoEqual(){
        if(token.equals("!=")){
            System.out.printf("The word/character typed: (%s), it is a 'not equal to' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'greater than' operator */
    public boolean isGreaterThan(){
        if(token.equals(">")){
            System.out.printf("The word/character typed: (%s), it is a 'greater than' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'less than' operator */
    public boolean isLessThan(){
        if(token.equals("<")){
            System.out.printf("The word/character typed: (%s), it is a 'less than' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'greater than or equal to' operator */
    public boolean isGreaterThanOrEqualTo(){
        if(token.equals(">=")){
            System.out.printf("The word/character typed: (%s), it is a 'greater than or equal to' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'less than or equal to' operator */
    public boolean isLessThanOrEqualTo(){
        if(token.equals("<=")){
            System.out.printf("The word/character typed: (%s), it is a 'less than or equal to' operator%n", token);
            return true;
        }

        return false;
    }
}
