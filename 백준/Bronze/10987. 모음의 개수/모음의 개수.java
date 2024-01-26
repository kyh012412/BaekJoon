import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int ans =0;

        for(int i=0;i<str.length();i++) {
            char a = str.charAt(i);
            switch(a) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                ans++;
            }
        }

        bw.write(ans+"");       

        br.close();
        bw.close();
    }
}