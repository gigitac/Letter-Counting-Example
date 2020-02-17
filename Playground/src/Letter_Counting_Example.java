import java.util.Scanner;

public class Letter_Counting_Example {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Input your word.");
        String inputWord = inputReader.nextLine();
        System.out.println("Your word is " + inputWord.length() + " characters long.");
    }
}
