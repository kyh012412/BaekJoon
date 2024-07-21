import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { 

    public static String eightfy(String str) {
        int a = Integer.parseInt(str,2);

        return Integer.toString(a,8);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringBuffer sb = new StringBuffer();

        if(str.length()%3!=0) {
            int remain = str.length()%3;
            String temp = str.substring(0,remain);
            sb.append(eightfy(temp));
            str = str.substring(remain);
        }

        while(str.length()>0) {
            String temp = str.substring(0,3);
            str = str.substring(3);
            sb.append(eightfy(temp));
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}