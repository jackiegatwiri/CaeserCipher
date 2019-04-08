import CeaserCipher.Decrypt;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DecryptTest {
    @Test
    public void encrypt_testStory_String(){
        Decrypt testDecrypt = new Decrypt();
        String expectedOutput = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals(expectedOutput, testDecrypt.decrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 23));
    }

}