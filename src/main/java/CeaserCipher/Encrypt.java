package CeaserCipher;

public class Encrypt {
    public static String encrypt(String story, int key) {
        String decipher = "";
        String errorMessage = " ";
        if (key < 1 || key > 25){
            errorMessage = "Key must be between 1 and 25";
        } else {
            int length = story.length();
            for (int index = 0; index < length; index++) {
                char singleChar = story.charAt(index);
                if (Character.isLetter(singleChar)){
                    if (Character.isUpperCase(singleChar)) {
                        char newSingleChar = (char)(singleChar + key); //casting done here
                        if(newSingleChar>'Z'){
                            decipher += (char)(singleChar-(26-key));
                        } else {
                            decipher += newSingleChar;
                        }
                    } else if (Character.isLowerCase(singleChar)){
                        char newSingleChar  = (char)(singleChar + key); //casting done here
                        if(newSingleChar>'z'){
                            decipher += (char)(singleChar-(26-key)); //char used for casting here
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


