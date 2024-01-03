import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int total=0;
        char before='0';
        char current;
        for(int i=0;i<str.length();i++) {
            if(i==0) {
                total=10;
                before = str.charAt(i);
                continue;
            }
            current=str.charAt(i);
            if(current==before) {
                total+=5;
            }else {
                total+=10;
                before=current;
            }
        }
        bw.write(total+"");

        br.close();
        bw.close();
    }
}