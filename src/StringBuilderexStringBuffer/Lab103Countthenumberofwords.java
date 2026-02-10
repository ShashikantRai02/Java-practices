package StringBuilderexStringBuffer;

public class Lab103Countthenumberofwords {
    public static void main(String[] args) {
        String str = "Shashikant Rai is a software developer";
        int wordCount = countWords(str);// calling the method to count words
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
