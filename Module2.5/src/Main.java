import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Cipher cipher = new Cipher(3);
        //for (Map.Entry<Integer, Character> entry : cipher.alphabet.entrySet()) {
        //    System.out.println(entry.getKey() + ": " + entry.getValue());
        //}
        System.out.println(cipher.encrypt("VYX"));

    }
}