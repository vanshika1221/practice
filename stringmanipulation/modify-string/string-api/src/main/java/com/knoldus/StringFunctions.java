package com.knoldus;

public class StringFunctions {
    public void reverseString(String userInput){
        //Calling getStringLength function to find the length of input string
        int lengthOfInput=getStringLength(userInput);
        int index;
        for(index=lengthOfInput-1;index>=0;index--)
        {
            System.out.print(userInput.charAt(index));
        }
    }
    public int getStringLength(String userInput){
        int countLength=0;
        //Loop for counting each character of the input string
        for( char character: userInput.toCharArray())
        {
            countLength++;
        }
        return  countLength;
    }
}

