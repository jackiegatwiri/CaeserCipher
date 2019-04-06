package CeaserCipher;
import java.util.Scanner;

import static CeaserCipher.Encrypt.encrypt;


public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please enter your story");
        String text;
        text = myScanner.nextLine();
        System.out.println("please enter your shift");
        int shift = myScanner.nextInt();

        System.out.println(encrypt(text, shift));
    }

}
