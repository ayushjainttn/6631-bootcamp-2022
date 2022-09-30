/*
Q1) Write the following a functional interface and implement it using lambda:

        -> First number is greater than second number or not Parameter (int ,int ) Return boolean
        -> Increment the number by 1 and return incremented value Parameter (int) Return int
        -> Concatination of 2 string Parameter (String , String ) Return (String)
        -> Convert a string to uppercase and return . Parameter (String) Return (String)
*/

import javax.sound.midi.Soundbank;

interface CheckGreater{
    boolean checkFirstNumberGreaterOrNot(int num1, int num2);
}

interface IncrementValue{
    int incrementValue(int num);
}

interface ConcatenateStrings{
    String concatenateStrings(String str1, String str2);
}

interface LowerToUpper{
    String lowerToUpper(String str);
}

public class Question1 {
    public static void main(String[] args) {
        CheckGreater myInterface = (int num1, int num2) -> { return (num1>num2)?true:false; };
        System.out.println(myInterface.checkFirstNumberGreaterOrNot(2,3));
        System.out.println(myInterface.checkFirstNumberGreaterOrNot(4,2));

        IncrementValue myInterface2 = (int num)->{return num+1;};
        System.out.println(myInterface2.incrementValue(3));

        ConcatenateStrings myInterface3 = (String str1, String str2)->{return str1+str2;};
        System.out.println(myInterface3.concatenateStrings("Ayush", "Jain"));

        LowerToUpper myInterface4 = (String str) -> {return str.toUpperCase();};
        System.out.println(myInterface4.lowerToUpper("java is great"));


    }
}
