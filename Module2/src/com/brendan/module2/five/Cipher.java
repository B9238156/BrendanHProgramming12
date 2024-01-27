package com.brendan.module2.five;

import javax.sound.midi.SysexMessage;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;


public class Cipher {
    public HashMap<Integer, Character> alphabet = new HashMap<>();
    public int shift;


    /**
     *
     * @param shift
     */
    public Cipher(int shift) {
        this.shift = shift;
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 26; i++) {
            alphabet.put(i, alpha.charAt(i));
        }
    }

    public String encrypt(String message) {

        String encryptedMessage = "";
        for (int p = 0; p < message.length(); p++) {
            if (message.charAt(p) != ' ') {
                // iterate each entry of hashmap
                for (Entry<Integer, Character> entry : this.alphabet.entrySet()) {
                    //System.out.println(entry.getValue());
                    // if give value is equal to value from entry
                    // print the corresponding key
                    if (entry.getValue() == message.charAt(p)) {
                        //System.out.println("The key for value " + message.charAt(p) + " is " + entry.getKey());
                        int position = entry.getKey();
                        int shiftSpot = (position + this.shift) % 26;
                        //System.out.println(shiftSpot);
                        //System.out.println(alphabet.get(shiftSpot));
                        encryptedMessage = encryptedMessage + alphabet.get(shiftSpot);
                        break;
                    }
                }
            }

            else{
                encryptedMessage = encryptedMessage + ' ';
            }
        }
        return encryptedMessage;
    }

    public String decrypt(String message) {

        String encryptedMessage = "";
        for (int p = 0; p < message.length(); p++) {
            if (message.charAt(p) != ' ') {
                // iterate each entry of hashmap
                for (Entry<Integer, Character> entry : this.alphabet.entrySet()) {
                    //System.out.println(entry.getValue());
                    // if give value is equal to value from entry
                    // print the corresponding key
                    if (entry.getValue() == message.charAt(p)) {
                        //System.out.println("The key for value " + message.charAt(p) + " is " + entry.getKey());
                        int position = entry.getKey();
                        int shiftSpot = (position - this.shift) % 26;
                        //System.out.println(shiftSpot);
                        //System.out.println(alphabet.get(shiftSpot));
                        encryptedMessage = encryptedMessage + alphabet.get(shiftSpot);
                        break;
                    }
                }
            }

            else{
                encryptedMessage = encryptedMessage + ' ';
            }
        }
        return encryptedMessage;
    }
}