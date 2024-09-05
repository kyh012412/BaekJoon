import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static int m,n;
	
	public static ArrayList<Integer> list[];
	
	public static boolean[] isVisited;
	public static Deque<Integer> stack = new LinkedList<Integer>();
	public static int order[];
	public static int index=1;
	
	public static void dfs(int start) {
		isVisited[start] = true;
		order[start] = index++;
		for(int e:list[start]) {
			if(!isVisited[e]) {
				dfs(e);
			}
		}
	}

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        
        list = new ArrayList[n+1];
        isVisited = new boolean[n+1];
        order = new int[n+1];
        for(int i=1;i<n+1;i++) {
        	list[i] = new ArrayList<Integer>();
        }
        
        while(m-->0) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	list[a].add(b);
        	list[b].add(a);
        }

        for(int i=1;i<n+1;i++) {
        	Collections.sort(list[i],Collections.reverseOrder());
        }
        
        dfs(s);
        
        for(int i=1;i<n+1;i++) {
        	bw.write(order[i]+"\n");
        }
        
        br.close();
        bw.close();
    }
}