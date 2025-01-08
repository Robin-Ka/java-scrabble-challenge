package com.booleanuk;

import java.util.ArrayList;
import java.util.Arrays;

public class Scrabble {

    public String word;
    public int wordScore;
    ArrayList<Character> onePoint = new ArrayList<>(Arrays.asList('a','e','i','o','u','l','n','r','s','t'));
    ArrayList<Character> twoPoint = new ArrayList<>(Arrays.asList('d', 'g'));
    ArrayList<Character> threePoint = new ArrayList<>(Arrays.asList('b','c','m','p'));
    ArrayList<Character> fourPoint = new ArrayList<>(Arrays.asList('f','h','v','w','y'));
    ArrayList<Character> fivePoint = new ArrayList<>(Arrays.asList('k'));
    ArrayList<Character> eightPoint = new ArrayList<>(Arrays.asList('j', 'x'));
    ArrayList<Character> tenPoint = new ArrayList<>(Arrays.asList('q', 'z'));

    public Scrabble(String word) {
        this.word = word.toLowerCase();
        this.wordScore = 0;
    }

    public void addPoints(){
        for (int i = 0; i < word.length(); i++){
            if (onePoint.contains(word.charAt(i))){
                wordScore += 1;
            } else if (twoPoint.contains(word.charAt(i))){
                wordScore += 2;
            } else if (threePoint.contains(word.charAt(i))){
                wordScore += 3;
            } else if (fourPoint.contains(word.charAt(i))){
                wordScore += 4;
            } else if (fivePoint.contains(word.charAt(i))){
                wordScore += 5;
            } else if (eightPoint.contains(word.charAt(i))){
                wordScore += 8;
            } else if (tenPoint.contains(word.charAt(i))){
                wordScore += 10;
            }
        }
    }

    public int score(){
        if (word.isEmpty() || word.contains("\\")){
            return 0;
        } else {
            addPoints();
            return wordScore;
        }

    }



}
