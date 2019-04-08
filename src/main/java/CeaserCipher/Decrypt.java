package CeaserCipher;

public class Decrypt {
    public static String decrypt(String cipher, int key) {
        String decipher = "";
        String errorMessage = "";
        if (key < 1 || key > 25){
            errorMessage = "Key must be between 1 and 25";
        } else {
            int length = cipher.length();
            for (int index = 0; index < length; index++) {
                char singleChar = cipher.charAt(index);
                if (Character.isLetter(singleChar)){
                    if (Character.isUpperCase(singleChar)) {
                        char newSingleChar = (char)(singleChar - key); //casting done here
                        if(newSingleChar<'A'){
                            decipher += (char)(singleChar+(26-key));
                        } else {
                            decipher += newSingleChar;
                        }
                    } else if (Character.isLowerCase(singleChar)){
                        char newSingleChar  = (char) ( singleChar - key); //casting done here
                        if(newSingleChar<'a'){
                            decipher += (char)(singleChar+(26-key)); //char used for casting here
                        } else {
                            decipher += newSingleChar;
                        }
                    }
                }
                else{
                    decipher += singleChar;
                }
            }
            return decipher;
        }
        return errorMessage;
    }
}
