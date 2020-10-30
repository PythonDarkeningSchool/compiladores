package com.uteg.compilers.modifiers;

public class AccessModifiers {

    /** Class properties */

    private final String token;

    /** Class constructor
     *
     * param token: the word/character to be validated
     * */

    public AccessModifiers(String token){
        this.token = token;
    }

    /** Returns true if the word to be evaluated is the 'default' access modifier */
    public boolean isDefault(){
        if(token.equals("default")){
            System.out.printf("The word/character typed: (%s), it is an 'access modifier'%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'public' access modifier */
    public boolean isPublic(){
        if(token.equals("public")){
            System.out.printf("The word/character typed: (%s), it is an 'access modifier'%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'protected' access modifier */
    public boolean isProtected(){
        if(token.equals("protected")){
            System.out.printf("The word/character typed: (%s), it is an 'access modifier'%n", token);
            return true;
        }

        return false;
    }

    /** Returns true if the word to be evaluated is the 'private' access modifier */
    public boolean isPrivate(){
        if(token.equals("private")){
            System.out.printf("The word/character typed: (%s), it is an 'access modifier'%n", token);
            return true;
        }

        return false;
    }
}
