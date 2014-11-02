/**

 * Programming assignment #2.

 * This program looks for anagrams in the dictionary using constant time

 * comparison algorithm.

 * Author: Olexiy Burov (oburov@ucsc.edu)

 */

import java.io.*;

public class Program
{
    static AnagramFinder anagramFinder = new AnagramFinder();

    public static void main(String[] args) throws FileNotFoundException
    {
        anagramFinder.loadWords(args[0]);
        anagramFinder.getWord();
    }
}

