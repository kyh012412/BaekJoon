import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int getSum(String str) {
        int sum =0;
        for(int i=0;i<str.length();i++) {
            sum += Integer.parseInt(str.substring(i, i+1));
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        String a = str.substring(0,str.length()/2);
        String b = str.substring(str.length()/2);

        if(getSum(a)==getSum(b)) {
            bw.write("LUCKY");
        }else {
            bw.write("READY");
        }

        br.close();
        bw.close();
    }
}