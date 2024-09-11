import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static ArrayList<Integer> order[];
    public static int[] time;
    public static int[] waittime;
    public static int[] finishtime;

    public static int[] end;
    public static int n,k;
    public static int target;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        while(tc-->0) {

            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            order = new ArrayList[n+1];
            end = new int[n+1];
            time = new int[n+1];
            waittime = new int[n+1];
            finishtime = new int[n+1];

            for(int i=1;i<n+1;i++) {
                order[i] = new ArrayList<Integer>();
            }

            st = new StringTokenizer(br.readLine());
            for(int i=1;i<n+1;i++) {
                time[i]=Integer.parseInt(st.nextToken());
            }

            int s,e;

            while(k-->0) {
                st = new StringTokenizer(br.readLine());
                s = Integer.parseInt(st.nextToken());
                e = Integer.parseInt(st.nextToken());
                order[s].add(e);
                end[e]++;
            }

            target = Integer.parseInt(br.readLine());

            Deque<Integer> dq = new LinkedList<Integer>();

            for(int i=1;i<n+1;i++) {
                if(end[i]==0) {
                    dq.addLast(i);
                }
            }

            while(!dq.isEmpty()) {
                int first = dq.pollFirst(); //앞과목 
                finishtime[first] = time[first]+waittime[first];
                if(first==target) {break;}
//          int newValue = value[first]+1; //뒷과목을 들을수 있는 학기
                for(int second : order[first]) { //뒷과목
                    end[second]--;
                    waittime[second] = Math.max(waittime[second],finishtime[first]);
                    if(end[second]==0) {
                        dq.add(second);
                    }
                }
            }

            bw.write(finishtime[target]+"\n");
        }

        bw.close();
        br.close();
    }
}