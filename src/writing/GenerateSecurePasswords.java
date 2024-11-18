package writing;

import java.security.SecureRandom;

public class GenerateSecurePasswords {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvwxyz"
            + "0123456789"
            + "!@#$%^&*()-_=+[{]}|;:',<.>/?";

    protected static final SecureRandom random = new SecureRandom();

    public static String generatePasswords(int length) {
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {

            int randomdex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomdex));

        }
        return sb.toString();
    }

}
