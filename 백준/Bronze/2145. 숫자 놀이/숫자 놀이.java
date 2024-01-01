import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while(true) {
            String a = br.readLine();
            if(a.equals("0")) {
                break;
            }
            int b= Integer.parseInt(a);
            while(b>0) {
                int total=0;
                for(int i=0;i<a.length();i++) {
                    total += a.charAt(i)-'0';
                }
                if(total>=10) {
                    b=total;
                    a=b+"";
                }else {
                    sb.append(total+"\n");
                    break;
                }
            }           
        }
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}