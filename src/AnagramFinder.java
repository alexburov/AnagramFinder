import java.io.*;
import java.util.*;

public class AnagramFinder
{
    // Dictionary to store the words in.
    public static Word[] dictionary;

    /*
    Loads all words into array.
    Each word is represented as a Word object with unique encoded value.
     */
    public void loadWords(String file) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new FileInputStream(file));
        int numberOfWords = scanner.nextInt();
        dictionary = new Word[numberOfWords];

        for (int i = 0; i < dictionary.length; i++)
        {
            dictionary[i] = new Word(scanner.next());
        }
    }

    /*
    Gets word from a user.
    Performs search through the dictionary of words comparing their
    numerical values, thus achieving constant time comparison goal.
     */
    public void getWord()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a string of letters: ");
        Word userWord = new Word(scanner.next());

        // For each value in the dictionary.
        for (Word word:dictionary)
        {
            // Compare codes of the word and if word is not itself print it.
            if (word.code == userWord.code && !word.value.equals(userWord.value))
            {
                System.out.println(word.value);
            }
        }

        // Ask user whether to try one more time.
        System.out.println("Do another? (y/n)");
        if (scanner.next().equals("y"))
        {
            // Recursion call.
            getWord();
        }
        else
        {
            // End of program if user enters 'n'.
            System.exit(1);
        }
    }
}

