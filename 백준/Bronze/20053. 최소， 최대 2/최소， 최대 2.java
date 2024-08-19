import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main { 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        for(int tci=0;tci<tc;tci++) {
            int n= Integer.parseInt(br.readLine());
            int min = 1000001;
            int max = -1000001;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if(min>num) {
                    min = num;
                }
                if(max<num) {
                    max = num;
                }       
            }
            bw.write(min+" "+max+"\n");
        }

        br.close();
        bw.close();
    }
}