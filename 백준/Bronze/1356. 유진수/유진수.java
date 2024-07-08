import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int getGoped(String str) {
        int gop = 1;

        for(int i=0;i<str.length();i++) {
            gop *= (str.charAt(i)-'0');
        }

        return gop;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();     

        for(int i=1;i<str.length();i++) {
            String str1= str.substring(0,i);
            String str2 = str.substring(i);
            if(getGoped(str1)==getGoped(str2)) {
                bw.write("YES");
                bw.close();
                return;
            }
        }

        bw.write("NO");

        br.close();
        bw.close();
    }
}