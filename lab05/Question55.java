package lab05;

import java.io.*;

class Result {
    public static String pangrams(String s) {
        int[] valid = new int[100];
        s = s.toUpperCase();
        for(int i = 0;i<s.length();i++)
            valid[s.charAt(i)]++;
        for(int i = 65;i<91;i++)
            if(valid[i]<1)
                return "not pangram";
        return "pangram";
    }

}

public class Question55 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
