import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        boolean equalcha = false;

        if(a+c == b+b) {
            equalcha =true;
        }

        if(equalcha) {
            int d = b-a;
            bw.write(a+d*n+"");
        }else {
            int r = b/a;
            bw.write(String.format("%d", a*(int)Math.pow(r, n)));
        }       

        br.close();
        bw.close();
    }
}