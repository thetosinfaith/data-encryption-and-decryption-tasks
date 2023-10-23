/*
Task: I need 2 functions, the first function will help us encrypt words, and the second should
help us decrypt words...
 */

public class EncryptAndDecryptWords {
    public static void main(String[] args) {
//        System.out.println(encrypt("BigCharles"));

        System.out.println(decrypt("YKIZJXRDBF"));

    }
    private static final String[] plain = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static final String[] cipher = {"X", "Y", "Z", "A", "B", "C", "I", "J", "K", "L", "M", "D", "E", "N", "O", "P", "Q", "R", "F", "S", "T", "U", "V", "W", "G", "H"};

    public static String encrypt(String userInput) {
        StringBuilder create = new StringBuilder();
        String[] splitUserInput = userInput.split("");


        for (String eachCharacter : splitUserInput) {
            for (int i = 0; i < plain.length; i++) { //compare with correct alphabet

                if (eachCharacter.equalsIgnoreCase(plain[i])) {
                    create.append(cipher[i]);

                }

            }

        }
        return create.toString();
    }
    public static String decrypt(String userInput) {
        StringBuilder create = new StringBuilder();
        String[] splitUserInput = userInput.split("");


        for (String eachCharacter : splitUserInput) {
            for (int i = 0; i < cipher.length; i++) {

                if (eachCharacter.equalsIgnoreCase(cipher[i])) {
                    create.append(plain[i]);

                }

            }

        }
        return create.toString();
    }
}











