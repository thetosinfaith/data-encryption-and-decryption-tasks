//import java.util.Scanner;
//
//import java.util.*;
//
//public class EncryptionProgram {
//    private Scanner scanner;
//    private Random random;
//    private ArrayList<Character>list;
//    private ArrayList<Character>shufflelist;
//    private String character;
//    private String line;
//
//    private char[] letters;
//    private char[] secretLetters;
//    EncryptionProgram(){
//        scanner = new Scanner(System.in);
//        random = new Random();
//        list = new ArrayList();
//        shuffledlist = new ArrayList();
//        character = " ";
//
//        newKey();
//        askQuestion();
//
//
//    }
//    private void askQuestion(){
//        while (true){
//            System.out.println("*****************************************************************");
//            System.out.println("What do you want to do?");
//            System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit");
//            char response = Character.toUpperCase(scanner.nextLine().charAt(0));
//
//            switch (response){
//                case 'N':
//                    newKey();
//                    break;
//                case 'G':
//                    getKey();
//                    break;
//                case 'E':
//                    encrypt();
//                    break;
//                case 'D':
//                    decrypt();
//                    break;
//                case 'Q':
//                    quit();
//                    break;
//                default:
//                    System.out.println("Not a valid answer :(");
//
//            }
//        }
//
//    }
//    private void newKey(){
//
//        character = " ";
//        list.clear();
//        shuffledlist.clear();
//
//
//    }
//    private void getKey(){
//
//    }
//    private void encrypt(){
//
//
//    }
//
//    private void decrypt(){
//
//
//    }
//
//    private void quit(){
//
//    }
//
//    public static void main(String[] args) {
//        EncryptionProgram encryptionProgram = new EncryptionProgram();
//
//    }
//}
