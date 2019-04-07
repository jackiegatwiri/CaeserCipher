package CeaserCipher;
import java.util.Scanner;

import static CeaserCipher.Decrypt.decrypt;
import static CeaserCipher.Encrypt.encrypt;


public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please enter your story");
        String story;
        story = myScanner.nextLine();
        System.out.println("please enter your shift");
        int key = myScanner.nextInt();

        StringBuilder cipher = (encrypt(story, key));
        System.out.println("Here is your ciphered story");
        System.out.println(cipher);
        StringBuilder decipher = (decrypt(cipher.toString(), key));
        System.out.println("Here is your deciphered story");
        System.out.println(decipher);
    }

}
