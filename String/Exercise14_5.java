// December 11, 2023
/* This program randomly prints out a "article", "noun", "verb", "preposition" type word in that order 
 * by traversing each array to build a sentence. The first letter of the sentence is capitalized and a
 * period is appended to the end of the word.
 */

package ch14HW;

import java.util.Random;

public class Exercise14_5 {

	public static void main(String[] args) {
		// Create the array for the parts of speech for a sentence
		String[] array = { "article", "noun", "verb", "preposition" };
		
		// Create the array of string for the article
		String[] article = { "the", "a", "one", "some", "any" };
		
		// Create the array of strings for the nouns
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		
		// Create the array of strings for the verb
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		
		// Create the array of strings from the preposition
		String[] preposition = { "to", "from", "over", "under", "on" };
		
		// Use a for loop to generate 20 sentences
		for (int count = 0; count < 20; count++) {
			// Create a new string object
			StringBuilder string = new StringBuilder();
			// Loop through the first array
			for (String partOfSpeech : array) {
				// If the array element matches the argument (for the order of the sentence)
				// Then, create a random element which is used to append a random string from each array
				if (partOfSpeech.equals("article")) {
					int randElementIndex = new Random().nextInt(article.length);
					string.append(article[randElementIndex]).append(" ");
				} else if (partOfSpeech.equals("noun")) {
					int randElementIndex = new Random().nextInt(noun.length);
					string.append(noun[randElementIndex]).append(" ");
				} else if (partOfSpeech.equals("verb")) {
					int randElementIndex = new Random().nextInt(verb.length);
					string.append(verb[randElementIndex]).append(" ");
				} else {
					int randElementIndex = new Random().nextInt(preposition.length);
					// Append a period to the end of the array
					string.append(preposition[randElementIndex]).append(".");
				}
			}
			
			// Create a char array
			char[] charArray = new char[string.length()];
			// Convert the stringbuilder to a char array to access the first character of the stringbuilder
			string.getChars(0, string.length(), charArray, 0);
			// Convert the first letter in the character array to an uppercase
			charArray[0] = Character.toUpperCase(charArray[0]);
			// Display the sentence
			for (char character : charArray) {
				System.out.print(character);
			}
			System.out.println();
		}
		

	}

}
