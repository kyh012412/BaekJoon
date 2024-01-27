import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String colors[] = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        int vals[] = {0,1,2,3,4,5,6,7,8,9};

        HashMap<String, Integer> map  = new HashMap<String, Integer>();

        for(int i=0;i<10;i++) {
            map.put(colors[i], vals[i]);
        }

        int inputs[] = new int[3];

        for(int i=0;i<3;i++) {
            inputs[i]= map.get(br.readLine());
        }

        long ans = 0;

        ans += 10*inputs[0]+inputs[1];

        ans = ans * (long)Math.pow(10, inputs[2]);

        bw.write(ans+"");

        br.close();
        bw.close();
    }
}