import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        int count =0;

        while(i>9) {
            int newval = 1;
            while(i!=0) {
                newval*=i%10;
                i/=10;
            }
            i=newval;
            count++;
        }

        bw.write(count+"");

        br.close();
        bw.close();
    }
}