import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static int getInt(char ch) {
        switch(ch) {
        case '-':
            return 0;
        case '\\':
            return 1;
        case '(':
            return 2;
        case '@':
            return 3;
        case '?':
            return 4;
        case '>':
            return 5;
        case '&':
            return 6;
        case '%':
            return 7;
        case '/':
            return -1;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum=0;
        while(true) {           
            String str =br.readLine();
            if(str.equals("#")) break;
            sum=0;
            for(int i=0;i<str.length();i++) {
                sum *=8;
                sum += getInt(str.charAt(i));
            }
            ans.append(sum+"\n");
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}