import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineNumber = 1;
        while (scan.hasNext()!= false) {
            String line = scan.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        
    }
}
