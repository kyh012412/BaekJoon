import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;

        while((str= br.readLine())!=null) {
            int maxcombo=0;
            int combo=0;
            char comboch=' ';
            for(int i=0;i<str.length();i++) {
                char ch = str.charAt(i);
                if(i==0) {
                    comboch=ch;
                    maxcombo=1;
                    combo=1;
                    continue;
                }
                if(comboch==ch) {
                    combo++;
                    if(combo>maxcombo) {
                        maxcombo=combo;
                    }
                    continue;
                }
                combo=1;
                comboch=ch;
            }
            bw.write(maxcombo+"\n");
        }

        br.close();
        bw.close();
    }
}