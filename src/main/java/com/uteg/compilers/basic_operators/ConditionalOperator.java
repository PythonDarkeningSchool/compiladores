package com.uteg.compilers.basic_operators;

public class ConditionalOperator {

    /** Class properties */

    private final String token;

    /** Class constructor
     *
     * param token: the word/character to be validated
     * */

    public ConditionalOperator(String token){
        this.token = token;
    }

    /** Returns true if the word to be evaluated is the 'question mark conditional ternary' operator */
    public boolean isQuestionMark() {
        if (token.equals("?")) {
            System.out.printf("The word/character typed: (%s), it is an 'question mark conditional' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'colon ternary' operator */
    public boolean isColon() {
        if (token.equals(":")) {
            System.out.printf("The word/character typed: (%s), it is an 'colon ternary' operator%n", token);
            return true;
        }

        return false;
    }

}
