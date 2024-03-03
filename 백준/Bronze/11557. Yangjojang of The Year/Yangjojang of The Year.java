import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for(int tci=0;tci<tc;tci++) {
            int collagesCount = Integer.parseInt(br.readLine());
            String ansCollage=null;
            int maxnum = -1;

            for(int i=0;i<collagesCount;i++) {              
                String v[] = br.readLine().split(" ");

                if(Integer.parseInt(v[1]) > maxnum) {
                    ansCollage = v[0];
                    maxnum = Integer.parseInt(v[1]);
                }
            }

            bw.write(ansCollage+"\n");
        }

        br.close();
        bw.close();
    }
}