import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int ar[][] = new int[101][101];

        Deque<String> sq = new LinkedList<String>();
        Deque<Integer> iq = new LinkedList<Integer>();

        int nidx=1;

        while(nidx<=n) {
            sq.add(br.readLine());
            nidx++;
        }

        while(!sq.isEmpty()) {
            st = new StringTokenizer(sq.pollLast());
            int a,b,c,d;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            int sum=0;
            for(int i=a;i<a+c;i++) {
                for(int j=b;j<b+d;j++) {
                    if(ar[i][j]==0) {
                        ar[i][j]=1;
                        sum++;
                    }
                }
            }
            iq.add(sum);
        }

        while(!iq.isEmpty()) {
            ans.append(iq.pollLast()+"\n");
        }

        bw.write(ans.toString());       

        bw.close();
        br.close();
    }
}