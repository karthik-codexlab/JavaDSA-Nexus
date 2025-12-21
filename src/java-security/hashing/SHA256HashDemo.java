package java_security.hashing;

import java.security.MessageDigest;

public class SHA256HashDemo {

    public static String hash(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedHash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();

        } catch (Exception e) {
            throw new RuntimeException("Error generating hash", e);
        }
    }

    public static void main(String[] args) {
        String password = "SecurePassword@123";
        System.out.println("SHA-256 Hash: " + hash(password));
    }
}
