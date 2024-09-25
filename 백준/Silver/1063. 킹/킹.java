import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static int[][] map = new int[9][9];

    public static int[] getDirection(String str) {
        int[] direction = new int[2];
        if(str.contains("R")) {
            direction[0]=1;
        }else if(str.contains("L")) {
            direction[0]=-1;
        }else {
            direction[0]=0;
        }

        if(str.contains("T")) {
            direction[1]=1;
        }else if(str.contains("B")) {
            direction[1]=-1;
        }else {
            direction[1]=0;
        }

        return direction;
    }

    public static boolean isMoveable(int[] pos,int[] direction,int[] consider) {
        int[] next = new int[2];
        for(int i=0;i<2;i++) {
            next[i] = pos[i]+direction[i];
            if(next[i]<1 || next[i]>8)
                return false;
        }
        if(consider[0]==next[0] && consider[1]==next[1]) {
            if(!isMoveable(consider, direction)){
                return false;
            }
        }
        return true;
    }

    public static boolean isMoveable(int[] pos,int[] direction) {
        return isMoveable(pos, direction,new int[] {-1,-1});
    }

    // A1 => 1,1
    public static int[] getPointFromPos(String str) {
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        int[] pos = new int[2];
        pos[0] = ch1-'A'+1;
        pos[1] = ch2-'0';
        return pos;
    }

    // 1,1=> A1
    public static String getPosFromPoint(int[] point) {
        return ""+(char)('A'+point[0]-1)+point[1];
    }

    public static boolean needStoneMoveTogether(int[] king,int[] direction,int[] stone) {
        int[] next = new int[] {king[0]+direction[0],king[1]+direction[1]};

        return (next[0] == stone[0] && next[1] == stone[1]);
    }

    public static int[] move(int[] target,int[] direction) {
        return new int[] {target[0]+direction[0],target[1]+direction[1]};
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        int[] kingPos = new int[2];
        int[] stonePos = new int[2];
        int n= -1;

        kingPos = getPointFromPos(st.nextToken());
        stonePos = getPointFromPos(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        int[] direction = null;
        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            direction = getDirection(st.nextToken());
            if(isMoveable(kingPos, direction,stonePos)) {
                if(needStoneMoveTogether(kingPos, direction, stonePos)) {
                    stonePos=move(stonePos,direction);
                }
                kingPos = move(kingPos,direction);
            }   
        }

        ans.append(getPosFromPoint(kingPos));
        ans.append("\n");
        ans.append(getPosFromPoint(stonePos));

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}