import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x,y;
        StringTokenizer st = new StringTokenizer(br.readLine());
        x=Integer.parseInt(st.nextToken())/2;
        y=Integer.parseInt(st.nextToken())/2;

        bw.write(Math.min(x, y)+"");

        br.close();
        bw.close();
    }
}