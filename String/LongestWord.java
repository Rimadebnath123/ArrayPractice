package String;

public class LongestWord {
    public static void main(String[] args) {
        String s = "I am a girl";
        String max = "";
        
        // Split the string into words using the split method
        String[] words = s.split(" ");//{"I", "am", "a", "girl"}
        // Iterate through the words to find the longest one
        for (String word : words) {
        	// System.out.println(word);
            if (word.length() > max.length()) {
                max = word;
            }
        }
        
        // Print the longest word
        System.out.println(max);
    }
}

