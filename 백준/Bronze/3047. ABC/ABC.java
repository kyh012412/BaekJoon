import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a[] = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        String str = br.readLine();

        for(int i=0;i<str.length();i++) {
            switch(str.charAt(i)) {
            case 'A':
                bw.write(a[0]+" ");
                break;
            case 'B':
                bw.write(a[1]+" ");
                break;
            case 'C':
                bw.write(a[2]+" ");
                break;
            }
        }

        br.close();
        bw.close();
    }
}