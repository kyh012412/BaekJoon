import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int idx = 1;
        while(true) {
            String str=br.readLine();
            if(str.equals("0 0 0")) {
                break;
            }
            String v[] = str.split(" ");
            int a = Integer.parseInt(v[0]);
            int b = Integer.parseInt(v[1]);
            int c = Integer.parseInt(v[2]);

            int value= 0;
            value += c/b*a;
            value += Math.min(a, c%b);

            bw.write("Case "+idx++ +": "+value+"\n");
        }

        br.close();
        bw.close();
    }
}