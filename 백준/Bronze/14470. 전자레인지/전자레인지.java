import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int time=0;
        boolean freezed=true;
        if(a<0) {
            freezed =true;
        }else {
            freezed =false;
        }

        while(a!=b) {
            if(a<0) {
                time = -a*c;
                a=0;
                continue;
            }
            if(freezed) {
                time += d;
                freezed=false;
                continue;
            }
            if(a<b) {
                time += (b-a)*e;
                a=b;
            }
        }

        bw.write(time+"");

        br.close();
        bw.close();
    }
}