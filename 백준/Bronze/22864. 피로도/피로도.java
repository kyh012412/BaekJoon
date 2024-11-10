import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); //시간당 피로도 증가량
        int b = Integer.parseInt(st.nextToken()); //소요시간당 일한양
        int c = Integer.parseInt(st.nextToken()); //1시간당 피로도감소량
        int m = Integer.parseInt(st.nextToken()); //최대 피로도

        int w=0; //일을 한 양
        int p=0; //피로도
        int h=0; //현재시간

        while(h<24) {
            if(h+1<=24 && p+a<=m) {
                h+=1;
                w+=b;
                p+=a;
                continue;
            }
            if(h+1<=24) {
                h+=1;
                p-=c;
                p= p<0?0:p;
                continue;
            }
            break;
        }

        bw.write(w+"");

        bw.close();
        br.close();
    }
}