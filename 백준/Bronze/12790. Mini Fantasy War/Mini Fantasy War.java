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
            String v[] = br.readLine().split(" ");
            int val[] = new int[8];
            int power = 0;
            for(int i=0;i<8;i++) {
                val[i] = Integer.parseInt(v[i]);
            }

            power += (val[0]+val[4])<1?1:(val[0]+val[4]);
            power += 5*((val[1]+val[5])<1?1:(val[1]+val[5]));
            power += 2*((val[2]+val[6])<0?0:(val[2]+val[6]));
            power += 2*(val[3]+val[7]);
            bw.write(power+"\n");
        }

        br.close();
        bw.close();
    }
}