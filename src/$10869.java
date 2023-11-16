import java.io.*;
import java.util.StringTokenizer;

public class $10869 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        int numberFirst = Integer.parseInt(stringTokenizer.nextToken());
        int numberSecond = Integer.parseInt(stringTokenizer.nextToken());

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write((numberFirst + numberSecond) + "\n");
        bufferedWriter.write((numberFirst - numberSecond) + "\n");
        bufferedWriter.write((numberFirst * numberSecond) + "\n");
        bufferedWriter.write((numberFirst / numberSecond) + "\n");
        bufferedWriter.write((numberFirst % numberSecond) + "\n");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}