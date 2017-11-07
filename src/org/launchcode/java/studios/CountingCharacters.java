package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to get a character count: ");
        String stringToCount = in.nextLine();

        String noCase = stringToCount.toLowerCase(); //to make it case-insensitive in a crude way
        char[] charsInString = noCase.toCharArray();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char each : charsInString){
            if (Character.isLetter(each)) {
                if (letterCount.containsKey(each)) {
                    //if letter is already in map increment the count
                    letterCount.put(each, letterCount.get(each) + 1);
                } else {
                    //if letter is not already in map add it
                    letterCount.put(each, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> letter : letterCount.entrySet()){
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
}
