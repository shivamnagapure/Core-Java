package org.example.ExceptionHandling.CustomizedException;

public class CustomException {

    public  TooOldException tooOldException;
    public TooYoungException tooYoungException;

    public CustomException(TooOldException tooOldException , TooYoungException tooYoungException){
        this.tooOldException = tooOldException ;
        this.tooYoungException = tooYoungException ;
    }

    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]) ;
        if(age > 60){
            throw new TooYoungException("Too Young to Marriage");
        } else if (age < 18) {
            throw new TooOldException("Too Old to Marriage");
        }else{
            System.out.println("You will get match details soonC");
        }
    }
}
