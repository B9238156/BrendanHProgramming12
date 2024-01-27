package com.brendan.module2.five;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Cipher cipher = new Cipher(3);
        String message = "THE DOG";

        System.out.println("Message to encrypt: " + message);
        String encryptedMsg =cipher.encrypt(message);
        System.out.println("Encrypted message: " + encryptedMsg);
        System.out.println("Decrypted message: " + cipher.decrypt(encryptedMsg));

    }
}