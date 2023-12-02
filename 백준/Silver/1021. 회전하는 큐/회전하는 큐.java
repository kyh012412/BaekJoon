import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static int n, k;
    static int arr[];
    static int rcnt=0;
    static Deque<Integer> dq = new LinkedList<Integer>();

    public static int getlcnttogetnum(int num) {
        int ccnt=0;
        int size = dq.size();
        while(dq.peek()!=num) {
            dq.addLast(dq.pollFirst());
            ccnt++;
        }
        ccnt = ccnt < size-ccnt ? ccnt :size-ccnt;
        dq.remove(num);
        return ccnt;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[k];

        for (int i = 1; i < n + 1; i++) {
            dq.add(i);
        }

        st=new StringTokenizer(br.readLine());

        for(int i=0;i<k;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            rcnt += getlcnttogetnum(arr[i]);
        }

        bw.write(rcnt+"");

        br.close();
        bw.close();
    }
}