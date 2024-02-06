package com.brendan.module2.four;
public class Word {
    String specialWord;

    /**
     *Convert to lowercase and keep only letters
     * @param word
     */
    public Word(String word) {
        this.specialWord = word.toLowerCase().replaceAll("[^ a-z]", "");
    }



}
