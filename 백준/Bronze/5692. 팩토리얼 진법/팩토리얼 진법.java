import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static String target;

    public static int factorial(int n) {
        if(n==1) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            target = br.readLine();
            if(target.equals("0")) break;
            int len = target.length();
            int sum=0;

            for(int i=0;i<len;i++) {
                sum +=factorial(len-i)*(target.charAt(i)-'0');
            }

            bw.write(sum+"\n");
        }

        br.close();
        bw.close();
    }
}