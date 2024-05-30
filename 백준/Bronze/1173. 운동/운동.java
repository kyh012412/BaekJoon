import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int current = m;

        int count =0;//총소요시간
        int healthTimed =0; //순수 헬스시간
        if(M-m<T) {
            bw.write("-1");
            bw.close();
            return;
        }

        while(true) {
            if(healthTimed==N) {
                break;
            }
            if(current+T<=M) {
                count++; 
                healthTimed++;
                current +=T;
                continue;
            }
            if(current-R>=m) {
                count++;
                current -=R;
                continue;
            }else {
                count++;
                current = m;
                continue;
            }
        }

        bw.write(count+"");

        br.close();
        bw.close();
    }
}