package com.uteg.compilers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReservedWords {

    /** Class properties */

    private final String token;

    /** Class constructor
     *
     * param token: the word/character to be validated
     * */

    public ReservedWords(String token){
        this.token = token;
    }

    /** Returns true if the word to be evaluated is the 'assert' reserved word */
    public boolean isReservedWord(){

        List<String> reservedWords = new ArrayList<>(Arrays.asList(
                "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
                "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float",
                "for", "goto", "if", "implements", "import", "instanceof", "interface", "int", "long", "native",
                "new", "null", "package", "return", "short", "String", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "true", "false", "try", "void"
        )
        ); // Declare a list with all the reserved words

        if(reservedWords.contains(token)){
            System.out.printf("The word/character typed: (%s), it is a 'reserved word'%n", token);
            return true;
        }

        return false;
    }

}
