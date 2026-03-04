package org.example.ExceptionHandling.CustomizedException;

public class TooOldException extends RuntimeException{
    TooOldException(String s){
        super(s);
    }
}
