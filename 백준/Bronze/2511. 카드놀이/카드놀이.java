import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a[] = new int[10];
        int b[] = new int[10];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<a.length;i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<b.length;i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        char drawbreaker = 'D';

        int aval = 0;
        int bval = 0;
        for(int i=0;i<10;i++) {
            if(a[i]>b[i]) {
                aval+=3;
                drawbreaker= 'A';
            }else if(a[i]<b[i]) {
                bval+=3;
                drawbreaker= 'B';
            }else {
                aval++;
                bval++;
            }
        }

        bw.write(aval+" "+bval+"\n");
        if(aval==bval) {
            bw.write(drawbreaker+"");
        }else {
            bw.write(aval>bval?"A":"B");
        }

        br.close();
        bw.close();
    }
}