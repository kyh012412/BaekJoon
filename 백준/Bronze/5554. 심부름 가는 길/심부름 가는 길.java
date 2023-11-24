import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum=0;
        for(int i=0;i<4;i++) {
            sum += Integer.parseInt(br.readLine());
        }
        int mins = sum/60;
        int secs = sum%60;
        bw.write(mins+"");
        bw.newLine();
        bw.write(secs+"");

        bw.close();
        br.close();
    }
}