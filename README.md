# Letter-Counting-Example
Simple script that reads the amount of letters in a given string, example for the people I teach online.

**How does it work?**
Simple, allow me to demonstrate.
```js
import java.util.Scanner;

public class Letter_Counting_Example {
    public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);
    }
} 
```
This allows us to take in input with our ``Scanner`` method called ``inputReader``.
```js
import java.util.Scanner;

public class Letter_Counting_Example {
    public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);
    System.out.println("Input your word.");
    String inputWord = inputReader.nextLine();
    }
}
```
This prompts the user to give in an input and it saves that input as ``inputWord``, correct?
```js
import java.util.Scanner;

public class Letter_Counting_Example {
    public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);
    System.out.println("Input your word.");
    String inputWord = inputReader.nextLine();
    System.out.println("Your word is " + inputWord.length() + " characters long.");
    }
}
```
Using ``inputWord.length()`` we find how long the given string is. This includes spaces.
With ``System.out.println()`` it prints what we give it. It concats the two strings for a nice format, and then puts the word length inside.

Let's try it out, shall we?
Control-Shift-F10...
```
Input your word.
Exciting!
Your word is 9 characters long.
```

**And that, friends, is how we do it here in the Lab. The Computer Science Lab, last time I was in the Chemistry lab I accidentally made methamphetamine.**

**I'm joking. Or am I?**
