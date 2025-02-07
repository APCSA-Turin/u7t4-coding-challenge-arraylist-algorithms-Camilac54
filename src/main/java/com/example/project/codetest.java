package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class codetest {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(
            "apple", "banana", "cherry", "donut", "Bagel", "danish", "berry", "baguette", "soda"
        ));

        System.out.println("Before: " + wordList);
        ArrayList<String> result = Main.moveBWords(wordList);
        System.out.println("After: " + result);
    }

    }
