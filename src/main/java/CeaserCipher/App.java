package CeaserCipher;
import java.util.Scanner;

import static CeaserCipher.Encrypt.encrypt;


public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please enter your story");
        String story;
        story = myScanner.nextLine();
        System.out.println("please enter your shift");
        int key = myScanner.nextInt();

        System.out.println(encrypt(story, key));
    }

}
