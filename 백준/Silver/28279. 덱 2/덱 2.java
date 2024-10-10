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

    public static Deque<Integer> dq = new LinkedList<Integer>();

    public static void ln() {
        ans.append("\n");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            if(f==1 || f==2) {
                int s = Integer.parseInt(st.nextToken());
                if(f==1) {
                    dq.addFirst(s);                 
                }else {
                    dq.addLast(s);
                }
            }else {
                switch(f) {
                case 3:
                    ans.append(!dq.isEmpty()?dq.pollFirst():-1);
                    break;
                case 4:
                    ans.append(!dq.isEmpty()?dq.pollLast():-1);
                    break;
                case 5:
                    ans.append(dq.size());
                    break;
                case 6:
                    ans.append(dq.isEmpty()?1:0);
                    break;
                case 7:
                    ans.append(!dq.isEmpty()?dq.peekFirst():-1);
                    break;
                case 8:
                    ans.append(!dq.isEmpty()?dq.peekLast():-1);
                    break;
                }
                ln();
            }
        }

        bw.write(ans.toString());       

        bw.close();
        br.close();
    }
}