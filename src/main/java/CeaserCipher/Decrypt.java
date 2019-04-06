package CeaserCipher;

public class Decrypt {
    public static StringBuilder decrypt(String cipher, int key) {
        StringBuilder decipher = new StringBuilder();
        if (key > 26) {
            key = key % 26;
        } else if (key < 0) {
            key = (key % 26) + 26;
        }
        int length = cipher.length();
        for (int index = 0; index < length; index++) {
            char letter = cipher.charAt(index);
            if (Character.isLetter(letter)){
                if (Character.isUpperCase(letter)) {
                    letter = (char)(((int) letter - key - 65) % 26 + 65); //casting done here
                    decipher.append(letter);
                } else if (Character.isLowerCase(letter)){
                    letter = (char) (((int) letter - key - 97) % 26 + 97); //casting done here
                    decipher.append(letter);
                }
            }
            else{
                decipher.append(letter);
            }

        }
        return decipher;
    }
}
