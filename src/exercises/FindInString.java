package exercises;
import java.util.Scanner;

public class FindInString {
    public static void main(String[] args){
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner in = new Scanner(System.in);
        String searchTerm;

        System.out.println("Please enter your search term:");
        searchTerm = in.next();

        String searchTermLower = searchTerm.toLowerCase();
        String firstLineLower = firstLine.toLowerCase();

        if (firstLineLower.contains(searchTermLower)){
            System.out.println(searchTerm + " is in the first line of AiW.");
        } else {
            System.out.println(searchTerm + " is not in the first line of AiW");
        }

    }
}
