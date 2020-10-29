package com.uteg.compilers.basic_operators;

public class BitwiseOperators {

    /** Class properties */

    private final String token;

    /** Class constructor
     *
     * param token: the word/character to be validated
     * */

    public BitwiseOperators(String token){
        this.token = token;
    }

    /** Returns true if the word to be evaluated is the 'bitwise and' operator */
    public boolean isBitwiseAnd(){
        if(token.equals("&")){
            System.out.printf("The word/character typed: (%s), it is an 'bitwise and' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'bitwise or' operator */
    public boolean isBitwiseOr(){
        if(token.equals("|")){
            System.out.printf("The word/character typed: (%s), it is an 'bitwise or' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'bitwise XOR' operator */
    public boolean isBitwiseXor(){
        if(token.equals("^")){
            System.out.printf("The word/character typed: (%s), it is an 'bitwise XOR' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'bitwise compliment' operator */
    public boolean isBitwiseCompliment(){
        if(token.equals("~")){
            System.out.printf("The word/character typed: (%s), it is an 'bitwise compliment' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'left shift' operator */
    public boolean isLeftShift(){
        if(token.equals("<<")){
            System.out.printf("The word/character typed: (%s), it is an 'left shift' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'right shift' operator */
    public boolean isRightShift(){
        if(token.equals(">>")){
            System.out.printf("The word/character typed: (%s), it is an 'right shift' operator%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'zero fill right shift' operator */
    public boolean isZeroFillRightShift(){
        if(token.equals(">>>")){
            System.out.printf("The word/character typed: (%s), it is an 'zero fill right shift' operator%n", token);
            return true;
        }

        return false;
    }

}
