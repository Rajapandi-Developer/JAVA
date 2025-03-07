package Leetcode.String;
public class ReverseString {
    public static void main(String[] args) {
        String str = "the sky is blue";
        String[] words = new String[100]; // Assuming the maximum number of words is 100
        int wordCount = 0;
        String word = "";

        // Split the string into words
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[wordCount] = word;
                wordCount++;
                word = "";
            } else {
                word += str.charAt(i);
            }
        }
        words[wordCount] = word; // Add the last word
        wordCount++;

        // Reverse the order of words
        String reversedString = "";
        for (int i = wordCount - 1; i >= 0; i--) {
            reversedString += words[i];
            if (i != 0) {
                reversedString += " ";
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedString);
    }
}


