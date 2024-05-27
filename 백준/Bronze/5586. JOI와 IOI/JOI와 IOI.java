import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int joi=0;
        int ioi=0;

        for(int i=0;i<str.length();i++) {
            if(str.indexOf("JOI", i)==i) {
                joi++;
            }
            if(str.indexOf("IOI", i)==i) {
                ioi++;
            }
        }
        bw.write(joi+"\n"+ioi);

        br.close();
        bw.close();
    }
}