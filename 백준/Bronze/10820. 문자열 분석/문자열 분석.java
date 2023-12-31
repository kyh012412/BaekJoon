import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        int so,dae,num,space;
        so=dae=num=space=0;

        StringBuilder sb = new StringBuilder();

        while ((str = br.readLine()) != null) {
            so=dae=num=space=0;
            for(int i=0;i<str.length();i++) {
                char a = str.charAt(i);
                if(a>='a' && a<='z') {
                    so++;
                }else if(a>='A' && a<='Z') {
                    dae++;
                }else if(a>='0' && a<='9') {
                    num++;
                }else if(a==' ') {
                    space++;
                }
            }
            sb.append(so+" "+dae+" "+num+" "+space+"\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}