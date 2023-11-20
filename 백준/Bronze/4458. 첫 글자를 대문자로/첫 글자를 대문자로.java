import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        for(int i=0;i<tc;i++) {
            String str = br.readLine();
            char a = str.charAt(0);
            if(a>='a' && a<='z') {
                a= (char)(a-'a'+'A');
            }
            str=str.substring(1);
            bw.write(a+str);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}