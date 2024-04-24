import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean noonepassed = true;
        for(int i=1;i<6;i++) {
            String str = br.readLine();
            if(str.contains("FBI")) {
                bw.write(i+" ");
                noonepassed = false;
            }
        }

        if(noonepassed) {
            bw.write("HE GOT AWAY!");
        }

        br.close();
        bw.close();
    }
}