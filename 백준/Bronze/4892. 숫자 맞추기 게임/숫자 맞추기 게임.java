import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int idx=1;
        while(true) {
            int a= Integer.parseInt(br.readLine());
            if(a==0) break;
            bw.write(idx+". ");

            if(a%2==0) {bw.write("even ");bw.write(a/2+"");}
            else {bw.write("odd ");bw.write((a-1)/2+"");}
            bw.write("\n");     
            idx++;
        }

        br.close();
        bw.close();
    }
}