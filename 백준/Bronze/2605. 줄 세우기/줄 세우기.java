import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        int i=0;
        while(st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            list.add(i-temp,++i);
        }
        for(int ii: list) {
            bw.write(ii+" ");
        }

        br.close();
        bw.close();
    }

}