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
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static int n,r,c;
    public static int[][] map;
    public static boolean[][] dv;
    public static boolean[][] vv; // virtual visited;
    public static Deque<int[]> dq = new LinkedList<int[]>();

    public static int[] dx = {1,0,-1,0};
    public static int[] dy = {0,1,0,-1};

    public static ArrayList<int[]> wallable = new ArrayList<int[]>();
    public static ArrayList<int[]> virus = new ArrayList<int[]>();

    public static int MaxSafeCount=0;

    public static void poison() { // 항상 vv를 사용
        addVirus(); //dq에 바이러스 추가
        bfs();
    }

    public static int countSafeZone() {
        int sum=0;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(!vv[i][j]) {
                    sum++;
                }
            }
        }

        return sum;
    }

    public static void addVirus() {
        for(int i=0;i<virus.size();i++) {
            dq.add(virus.get(i));
        }
    }

    public static void bfs() {
        while(!dq.isEmpty()) {
            int[] cur = dq.poll();

            for(int k=0;k<4;k++) {
                int nr = cur[0] + dy[k];
                int nc = cur[1] + dx[k];

                if(nr <0 || nc <0 || nr>=r || nc >=c) continue;
                if(vv[nr][nc]) continue;
                vv[nr][nc]=true;
                dq.add(new int[] {nr,nc});
            }
        }
    }

    public static void reset() {
        vv = new boolean[r][c];
        for(int i=0;i<r;i++) {
            vv[i] = Arrays.copyOf(dv[i],c);
        }
    }

    public static void setWall(int[] point) {
        dv[point[0]][point[1]] = true;
    }

    public static void releaseWall(int[] point) {
        dv[point[0]][point[1]] = false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        dv = new boolean[r][c];

        for(int i=0;i<r;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<c;j++) {
                int num = Integer.parseInt(st.nextToken());
                // 이쪽에 코드가 추가될 수 도 있음
                switch(num) {
                case 0:
                    wallable.add(new int[] {i,j});
                    dv[i][j]=false;
                    break;
                case 2:
                    virus.add(new int[] {i,j});
                    dv[i][j]=true;
                    break;
                case 1:
                    dv[i][j]=true;
                    break;
                }
            }
        }

        // 벽을 3개 세운후 island 개수가 달라지면
        for(int i=0;i<wallable.size()-2;i++) {
            setWall(wallable.get(i));
            for(int j=i+1;j<wallable.size()-1;j++) {
                setWall(wallable.get(j));
                for(int k=j+1;k<wallable.size();k++) {
                    setWall(wallable.get(k));
                    reset();
                    poison();
                    // 안정영역을 계산후 최대값 갱신
                    MaxSafeCount = Math.max(MaxSafeCount, countSafeZone());
                    releaseWall(wallable.get(k));
                }
                releaseWall(wallable.get(j));
            }
            releaseWall(wallable.get(i));
        }

        bw.write(MaxSafeCount+"");

        bw.close();
        br.close();
    }
}