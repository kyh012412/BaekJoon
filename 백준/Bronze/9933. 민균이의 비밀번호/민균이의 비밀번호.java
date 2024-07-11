import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<String> list = new ArrayList<String>(); 

        String s[] = new String[n];
        for(int i=0;i<n;i++) {
            list.add(br.readLine());
        }

        for(int i=0;i<n;i++) {
            String reversed = new StringBuilder(list.get(i)).reverse().toString();
            if(list.contains(reversed)) {
                bw.write(reversed.length()+" "+reversed.charAt(reversed.length()/2));
                bw.close();
                return;
            }
        }

        br.close();
        bw.close();
    }
}