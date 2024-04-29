import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static String customToString(int a[]) {
        String temp = "";
        for(int i=0;i<a.length;i++) {
            temp += a[i]+" ";
        }

        return temp;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a[] = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<5;i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<5;i++) {
            for(int j=0;j+i<4;j++) {
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    sb.append(customToString(a)+"\n");
                }
            }
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}