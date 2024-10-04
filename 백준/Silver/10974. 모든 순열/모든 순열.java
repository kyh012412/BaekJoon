import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();
    public static ArrayList<Integer> list = new ArrayList<Integer>();
    public static int n;
    public static boolean[] visited;

    public static void add() {
        if(list.size()==n) {
            for(int i=0;i<n;i++) {
                ans.append(list.get(i)+" ");
            }
            ans.append("\n");
            return;
        }
        for(int i=1;i<n+1;i++) {
            if(visited[i]) continue;
            visited[i]=true;
            list.add(i);
            add();
            list.remove(list.size()-1);
            visited[i]=false;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        visited = new boolean[n+1];

        add();

        bw.write(ans.toString());       

        bw.close();
        br.close();
    }
}