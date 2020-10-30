package com.uteg.compilers.PrimitiveDataTypes;

public class Numbers {

    /** Class properties */

    private final String token;

    /** Class constructor
     *
     * param token: the word/character to be validated
     * */

    public Numbers(String token){
        this.token = token;
    }

    /** Returns true if the word to be evaluated belongs to the 'int' numbers */
    public boolean isInt(){

        try {
            int number = Integer.parseInt(token);

            if(number < 2147483647){
                System.out.printf("The word/character typed: (%s), it is an 'int'%n", token);
                return true;
            }

            return false;

        }
        catch (Exception ignored){
            return false;
        }
    }

    /** Returns true if the word to be evaluated belongs to the 'long' numbers */
    public boolean isLong(){

        try {
            long number = Long.parseLong(token);

            if(number < 9223372036854775807L){
                System.out.printf("The word/character typed: (%s), it is a 'long'%n", token);
                return true;
            }

            return false;
        }
        catch (Exception ignored){
            return false;
        }
    }

    /** Returns true if the word to be evaluated belongs to the 'float' numbers */
    public boolean isFloat(){

        try {
            Float.parseFloat(token); // The token can be parser as number

            if(!token.contains(".")) // the number does not contains a dot
                return false;

            System.out.printf("The word/character typed: (%s), it is a 'float'%n", token);
            return true;
        }
        catch (Exception ignored){
            return false;
        }
    }

    /** Returns true if the word to be evaluated belongs to the 'double' numbers */
    public boolean isDouble(){

        try {
            Double.parseDouble(token); // The token can be parser as number

            if(!token.contains(".")) // the number does not contains a dot
                return false;

            System.out.printf("The word/character typed: (%s), it is a 'double'%n", token);
            return true;
        }
        catch (Exception ignored){
            return false;
        }
    }

    /** Returns true if the word to be evaluated belongs to the 'chart' numbers */
    public boolean isChart(){

        char[] ch =token.toCharArray();

        if(ch.length > 1) // if the token has more than one character returns false
            return false;

        if(token.matches("^[a-zA-Z]*$")){ // if the token is a letter return true, otherwise returns false
            System.out.printf("The word/character typed: (%s), it is a 'chart'%n", token);
            return true;
        }

        return false;
    }

}
