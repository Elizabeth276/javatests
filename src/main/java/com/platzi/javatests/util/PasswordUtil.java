package com.platzi.javatests.util;

public class PasswordUtil {

    public enum SecurytyLevel{
        WEAK, MEDIUM, STROONG

    }

    public static SecurytyLevel assesPassword(String password){

        if (password.length() < 8){

            return SecurytyLevel.WEAK;
        }
if (password.matches("[a-zA-Z]+")){

    return SecurytyLevel.WEAK;

}
if (password.matches("[a-zA-Z0-9]+")){

    return SecurytyLevel.MEDIUM;

}


 return SecurytyLevel.STROONG;

    }
}
