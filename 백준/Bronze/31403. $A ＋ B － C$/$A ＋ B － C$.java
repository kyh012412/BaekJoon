import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int intfy(String a) {
        return Integer.parseInt(a);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a,b,c;
        a = br.readLine();
        b = br.readLine();
        c = br.readLine();

        bw.write(intfy(a)+intfy(b)-intfy(c)+"\n");
        bw.write(intfy(a+b)-intfy(c)+"");

        br.close();
        bw.close();
    }
}  