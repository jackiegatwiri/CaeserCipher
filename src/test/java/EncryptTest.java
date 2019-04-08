import CeaserCipher.Encrypt;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EncryptTest {
    @Test
    public void encrypt_testKeyRange_String() {
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput  = "Key must be between 1 and 25";
        assertEquals(expectedOutput, testEncrypt.encrypt("bcd", 27));
    }
    @Test
    public void encrypt_testStoryLetter_String(){
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput = "ifmmp";
        assertEquals(expectedOutput, testEncrypt.encrypt("hello", 1));
    }
    @Test
    public void encrypt_testStoryOtherCharacters_String(){
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput = "ifm7p*";
        assertEquals(expectedOutput, testEncrypt.encrypt("hel7o*", 1));
    }
    @Test
    public void encrypt_testStoryUpperCase_String(){
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput = "BCD";
        assertEquals(expectedOutput, testEncrypt.encrypt("ABC", 1));
    }
    @Test
    public void encrypt_testStory_String(){
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        assertEquals(expectedOutput, testEncrypt.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23));
    }
}