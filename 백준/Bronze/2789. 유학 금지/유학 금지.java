import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String cambridge = "CAMBRIDGE";
        HashSet<Character> set = new HashSet<Character>();

        for(int i=0;i<cambridge.length();i++) {
            set.add(cambridge.charAt(i));
        }

        String target = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<target.length();i++) {
            if(!set.contains(target.charAt(i))) {
                sb.append(target.charAt(i));
            }
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}