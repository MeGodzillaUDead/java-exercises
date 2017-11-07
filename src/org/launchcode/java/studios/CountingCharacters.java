package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args){
        String stringToCount = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charsInString = stringToCount.toCharArray();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char each : charsInString){
            if (letterCount.containsKey(each)){
                letterCount.put(each, letterCount.get(each) + 1);
            } else {
                letterCount.put(each, 1);
            }
        }

        for (Map.Entry<Character, Integer> letter : letterCount.entrySet()){
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
}
