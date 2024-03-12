import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int getSumFy(String str,int radix) {      
        int sum = 0;

        for(int i=0;i<str.length();i++) {
            sum += Integer.parseInt(str.substring(i,i+1),radix);
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        for(int i=1000;i<10000;i++) {
            int sumFyI = getSumFy(i+"",10);

            String str16 = Integer.toString(i,16);
            if(sumFyI != getSumFy(str16,16)) {
                continue;
            }

            String str12 = Integer.toString(i,12);
            if(sumFyI != getSumFy(str12,12)) {
                continue;
            }

            sb.append(i+"\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}