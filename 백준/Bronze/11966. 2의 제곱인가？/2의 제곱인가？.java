import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = Integer.toString(n,2);

        int count=0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='1') {
                count++;
                if(count>=2) {
                    bw.write("0");
                    bw.close();
                    return;
                }
            }
        }
        bw.write("1");

        br.close();
        bw.close();
    }
}