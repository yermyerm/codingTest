import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfLines = 10;
        int dividingNumber = 42;
        HashSet<Integer> remainders = new HashSet<>();
        for (int i = 0; i < numberOfLines; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            remainders.add(number%dividingNumber);
        }
        System.out.println(remainders.size());
    }
}