package CeaserCipher;

public class Encrypt {
    public static StringBuilder encrypt(String story, int key) {

        StringBuilder decipher = new StringBuilder();

        for (int i = 0; i < story.length(); i++) {
            if (Character.isUpperCase(story.charAt(i))) {
                char lowerCase = (char) (((int) story.charAt(i) + key - 65) % 26 + 65);
//                result.append(ch);
//            } else {
//                char ch = (char) (((int) text.charAt(i) +
//                        shift - 97) % 26 + 97);
//                result.append(ch);
//            }
//        }
//        return result;
//    }
}
