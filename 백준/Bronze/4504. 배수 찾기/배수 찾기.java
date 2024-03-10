import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(true) {           
            int target = Integer.parseInt(br.readLine());

            if(target==0) {
                break;
            }

            if(target%n!=0) {
                sb.append(target+" is NOT a multiple of "+n+".\n");
            }else {
                sb.append(target+" is a multiple of "+n+".\n");
            }           
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}