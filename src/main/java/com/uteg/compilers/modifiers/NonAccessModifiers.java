package com.uteg.compilers.modifiers;

public class NonAccessModifiers {

    /** Class properties */

    private final String token;

    /** Class constructor
     *
     * param token: the word/character to be validated
     * */

    public NonAccessModifiers(String token){
        this.token = token;
    }

    /** Returns true if the word to be evaluated is the 'default' non access modifier */
    public boolean isAbstract(){
        if(token.equals("abstract")){
            System.out.printf("The word/character typed: (%s), it non an 'access modifier'%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'final' non access modifier */
    public boolean isFinal(){
        if(token.equals("final")){
            System.out.printf("The word/character typed: (%s), it non an 'access modifier'%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'strictfp' non access modifier */
    public boolean isStrictfp(){
        if(token.equals("strictfp")){
            System.out.printf("The word/character typed: (%s), it non an 'access modifier'%n", token);
            return true;
        }

        return false;
    }
}
