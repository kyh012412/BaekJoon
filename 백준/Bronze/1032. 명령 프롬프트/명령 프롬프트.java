import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String b[] = new String[a];
        for(int i=0;i<a;i++) {
            b[i] =br.readLine();
        }
        String ns="";
        for(int i=0;i<b[0].length();i++) {
            char c = b[0].charAt(i);
            for(int j=1;j<b.length;j++) {
                if(c!=b[j].charAt(i)) {
                    c='?';
                    break;
                }
            }
            ns+=c;          
        }
        bw.write(ns);

        bw.close();
        br.close();
    }
}