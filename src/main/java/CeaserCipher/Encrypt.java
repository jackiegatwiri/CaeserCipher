package CeaserCipher;

public class Encrypt {
    public static StringBuilder encrypt(String story, int key) {
        StringBuilder decipher = new StringBuilder();
        if (key > 26) {
            key = key % 26;
        } else if (key < 0) {
            key = (key % 26) + 26;
        }


        int length = story.length();
        for (int index = 0; index < length; index++) {
            char singleChar = story.charAt(index);
            if (Character.isLetter(singleChar)){
                if (Character.isUpperCase(singleChar)) {
                    char newSingleChar = (char)(( singleChar + key - 65) % 26 + 65); //casting done here
                    decipher.append(newSingleChar);
                    if(newSingleChar>'Z'){
                        decipher.append((char)(singleChar-(26-key)));
                    }


                } else if (Character.isLowerCase(singleChar)){
                    char newSingleChar  = (char) (( singleChar + key - 97) % 26 + 97); //casting done here
                    decipher.append(newSingleChar);

                    if(newSingleChar>'z'){
                        decipher.append((char)(singleChar-(26-key))); //char used for casting here
                    }

                }
            }
            else{
                decipher.append(singleChar);
            }

        }

        return decipher;

        }
    }


