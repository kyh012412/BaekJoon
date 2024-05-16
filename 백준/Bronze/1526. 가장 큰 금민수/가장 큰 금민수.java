import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static boolean test(int n) {
        while(n>0) {
            switch(n%10) {
            case 4:
            case 7:
                n/=10;
                break;
            default:return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        while(true) {
            if(test(n)) {
                break;
            }
            n--;
        }
        bw.write(n+"");

        br.close();
        bw.close();
    }
}