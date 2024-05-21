import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        if((h>=12 && h<=16) && s==0) {
            bw.write("320");
        }else {
            bw.write("280");
        }

        br.close();
        bw.close();
    }
}