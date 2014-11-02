import java.lang.Override;
import java.lang.String;

// Defines a word with its string and encoded values.
class Word
{
    // Field to store unique numbers for each set of characters.
    public long code;

    // Field to store the actual value.
    public String value;

    // Constructor creates Word object based on string and numerical representation of it.
    public Word(String word)
    {
        this.value = word;
        this.code = encodeWord(word);
    }

    // Returns letter index from 0 to 25.
    public int letterToIndex(char letter)
    {
        return letter - 'a';
    }

    // Assignes prime integer to each character.
    public int letterToValue(char letter)
    {
        //The most common letters use the smallest values to avoid overflow.
        int [] primes = {5,71,23,7,2,67,61,37,11,83,89,41,47,43,31,53,59,17,13,
                3,73,79,29,97,19,101};
        return primes[letterToIndex(letter)];
    }


    // Encodes word as a product of it's letters' values.
    public long encodeWord(String sourceWord)
    {
        long product = 1;

        // Foreach character in the string
        for (int i = 0; i < sourceWord.length(); i++)
        {
            // multiply product by it's numerical code from letterToValue().
            product *= letterToValue(sourceWord.charAt(i));
        }
        return product;
    }

    @Override
    public String toString()
    {
        return this.value;
    }
}
