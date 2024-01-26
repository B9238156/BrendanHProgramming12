public class Word {
    String specialWord;
    public Word(String word) {
        this.specialWord = word.toLowerCase().replaceAll("[^ a-z]", "");
    }



}
