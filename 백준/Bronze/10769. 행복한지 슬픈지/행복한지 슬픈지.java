import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static String happy = ":-)";
    public static String sad = ":-(";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnth=0,cnts=0;

        String str = br.readLine();

        int index=0;
        while(true) {
            index = str.indexOf(happy,index);
            if(index==-1) break;
            index++;
            cnth++;
        }

        index=0;
        while(index!=-1) {
            index = str.indexOf(sad,index);
            if(index==-1) break;
            index++;
            cnts++;
        }

        if(cnth==0 && cnts==0) {
            bw.write("none");
        }else if(cnth==cnts) {
            bw.write("unsure");
        }else if(cnth>cnts) {
            bw.write("happy");
        }else if(cnth<cnts) {
            bw.write("sad");
        }

        bw.close();
        br.close();
    }
}