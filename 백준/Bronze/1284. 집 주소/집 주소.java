import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();

            int n = Integer.parseInt(str);

            if (n == 0)
                break;

            int val = str.length() + 1;

            while (n >= 0) {
                switch (n % 10) {
                case 1:
                    val += 2;
                    break;
                case 0:
                    val += 4;
                    break;
                default:
                    val +=3;
                }
                n/=10;
                if(n==0) break;
            }
            sb.append(val+"\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}