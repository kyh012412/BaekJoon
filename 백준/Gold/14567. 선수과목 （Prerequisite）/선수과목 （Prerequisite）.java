import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static String target;

    public static ArrayList<Integer> list[];
    public static int[] end;
    public static int[] value;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n,m;

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        list = new ArrayList[n+1];
        end = new int[n+1];
        value = new int[n+1];

        for(int i=1;i<n+1;i++) {
            list[i] = new ArrayList<Integer>();
        }

        Arrays.fill(value, 1);

        int s,e;

        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            end[e]++;
        }

        Deque<Integer> dq = new LinkedList<Integer>();

        for(int i=1;i<n+1;i++) {
            if(end[i]==0) {
                dq.addLast(i);
            }
        }

        while(!dq.isEmpty()) {
            int subjectNum = dq.pollFirst(); //앞과목 
            int newValue = value[subjectNum]+1; //뒷과목을 들을수 있는 학기
            for(int subjectNum2 : list[subjectNum]) { //뒷과목
                end[subjectNum2]--;
                if(end[subjectNum2]==0) {
                    value[subjectNum2] = Math.max(value[subjectNum2], newValue);
                    dq.add(subjectNum2);
                }
            }
        }

        for(int i=1;i<n+1;i++) {
            bw.write(value[i]+" ");
        }

        bw.close();
        br.close();
    }
}