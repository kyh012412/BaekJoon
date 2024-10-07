import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static int v,ed;

    static class Line{
        int e;
        int w;

        public Line() {
            // TODO Auto-generated constructor stub
        }
        public Line(int e,int w) {
            this.e = e;
            this.w = w;
        }
    }

    public static PriorityQueue<Line> pq[];

    public static int[] dist;
    public static final int INF = Integer.MAX_VALUE-20000;

    public static boolean[] caled;

    public static int getIndex() {
        int index=-1;
        int indexDistant = INF;

        for(int i=1;i<v+1;i++) {
            if(!caled[i] && dist[i]<=indexDistant) {
            	indexDistant = dist[i];
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        ed = Integer.parseInt(st.nextToken());

        dist = new int[v+1];
        pq = new PriorityQueue[v+1];
        caled = new boolean[v+1];

        for(int i=1;i<v+1;i++) {
            pq[i] = new PriorityQueue<Main.Line>((o1, o2) -> {
                return o1.w-o2.w;
            });
        }

        int os = Integer.parseInt(br.readLine());

        while(ed-->0) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            pq[s].add(new Line(d,w));
        }

        Arrays.fill(dist, INF);
        dist[os]=0;

        while(!pq[os].isEmpty()) {
            Line info = pq[os].poll();
            int e = info.e;
            int w = info.w;

            int newW = w;
            if(newW<dist[e]) {
                dist[e] = newW;
            }
        }
        caled[os] = true;

        while(true) {
            int index = getIndex(); //새로운 경유점
            if(index==-1) break;

            while(!pq[index].isEmpty()) {
                Line info = pq[index].poll();
                int e = info.e;
                int w = info.w;

                // 한번에 가는 거리가 경유지를 거쳐서 가는것 보다 크다면 갱신
                if(dist[e]>dist[index]+w) {
                    dist[e] = dist[index]+w;
                }
            }

            caled[index] = true;
        }

        for(int i=1;i<v+1;i++) {
            if(dist[i]<INF) {
                ans.append(dist[i]+"\n");
            }else {
                ans.append("INF\n");
            }
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}