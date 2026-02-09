/* 
Create a program that analyzes a given large text (e.g., a paragraph or multiple
sentences) to identify all palindromic words and provide an analysis. A
palindrome is a word that reads the same forwards and backwards (e.g.,
"madam", "level", "refer"). The program should ignore case and non alphabetic characters for palindrome checking.
*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the veryyy long long string");
        String str = input.nextLine();
        // accessing the letters of string using array method
        // code is here 

        // for( int i=0; )

        String[] words = str.split(" +"); // isse split hoga with we have one or more spaces jab bhi + use hoga , split method ke andar hame daalna hai jo bhi hame replace krna ho
        
        System.out.println("The total number of words in a string:");
        System.out.println(words.length);

        System.out.println("\nPALINDROMIC WORDS:");
        int count = 0; 

        for(String word: words){
            
            word = word.replaceAll("[^a-zA-Z]", "");
            
            if(word.isEmpty()){
                continue;  // Skip to next word
            }
            
            String lowerWord = word.toLowerCase();

            StringBuffer lw = new StringBuffer(lowerWord);
            
            lw.reverse();
            
            String reversedWord = lw.toString();

            if (lowerWord.equals(reversedWord)) {
                System.out.println(lowerWord + " is a Palindrome String.");
                count++;  // Increase counter
            } else {
                System.out.println(lowerWord + " is not a Palindrome String.");
            }
        }

        System.out.println("\nThe total count of palindrome strings: " + count);
    }    
}
