import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<str.length();i++) {
            char a = str.charAt(i);
            if((a>='A' && a<='M') || (a>='a' && a<='m')) {
                ans.append((char)(a+13));
            }else if( (a>='N' && a<='Z') || (a>='n' && a<='z') ) {
                ans.append((char)(a-13));
            }else {
                ans.append(a);
            }
        }
        bw.write(ans.toString());

        br.close();
        bw.close();
    }
}