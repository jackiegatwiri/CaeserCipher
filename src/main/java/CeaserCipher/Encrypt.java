package CeaserCipher;

public class Encrypt {
    public static StringBuilder encrypt(String story, int key) {
        StringBuilder decipher = new StringBuilder();
        if (key>26){
            key = key%26;
        }
        else if(key<0){
            key =  (key%26)+26;
        }

        for (int i = 0; i < story.length(); i++) {
            if (Character.isUpperCase(story.charAt(i))) {
                char letter = (char) (((int) story.charAt(i) + key - 65) % 26 + 65);
                decipher.append(letter);
            } else {
                char letter = (char) (((int) story.charAt(i) +
                        key - 97) % 26 + 97);
                decipher.append(letter);
            }
        }
        return decipher;
    }
}
