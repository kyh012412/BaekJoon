import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static String target;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n-->0) {
            target = br.readLine();
            int b=0,g=0;
            for(int i=0;i<target.length();i++) {
                char c = target.charAt(i);
                switch(c) {
                case 'b':
                case 'B':
                    b++;
                    continue;
                case 'g':
                case 'G':
                    g++;
                    continue;
                }
            }
            if(g-b>0) {
                bw.write(target+" is GOOD\n");
            }else if(b-g>0) {
                bw.write(target+" is A BADDY\n");
            }else {
                bw.write(target+" is NEUTRAL\n");
            }
        }

        br.close();
        bw.close();
    }
}