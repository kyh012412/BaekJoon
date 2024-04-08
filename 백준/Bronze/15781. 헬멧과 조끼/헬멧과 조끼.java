import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int getMax(String v[]) {
        int temp = -1;
        for(int i=0;i<v.length;i++) {
            int num = Integer.parseInt(v[i]);
            if(temp<num) {
                temp=num;
            }
        }

        return temp;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n,m;
        String v[] = br.readLine().split(" ");

        n = Integer.parseInt(v[0]);
        m = Integer.parseInt(v[1]);

        int sum =0;

        sum += getMax(br.readLine().split(" "));
        sum += getMax(br.readLine().split(" "));

        bw.write(sum+"");   

        br.close();
        bw.close();
    }
}  