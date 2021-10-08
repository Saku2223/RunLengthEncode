package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println ("Enter your text:");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int len = input.length();
        int i = 0;
        int noCharacters = 0;
        char storeCharacters = input.charAt(0);

        String outputString = "";
        for (; i < len; i++) {
            if (i + 1 < len) {
                if(input.charAt(i) == input.charAt(i+1)) {
                    noCharacters++;
                }
                else {
                    outputString = outputString +
                            Integer.toHexString(noCharacters+1) + storeCharacters;
                    noCharacters = 0;
                    storeCharacters = input.charAt(i + 1);
                }
            }
            else {
                outputString = outputString +
                        Integer.toHexString(noCharacters+1) + storeCharacters;
            }
        }
        System.out.println("Your new text is: " + outputString);
    }
}
