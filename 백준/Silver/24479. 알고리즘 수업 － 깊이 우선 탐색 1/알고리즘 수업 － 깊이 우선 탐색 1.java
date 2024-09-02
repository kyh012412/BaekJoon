import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	public static int n,m;
	
	public static ArrayList<Integer>[] list;
	public static boolean isVisited[];
	public static int index=1;
	public static int order[];
	
	public static void addList(String str) {
		StringTokenizer st = new StringTokenizer(str);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		list[a].add(b);
		list[b].add(a);
	}
	
	public static void dfs(int start) {
		isVisited[start] =true;
		order[start] = index++;
		
		for(int i:list[start]) {
			if(isVisited[i]) continue;
			dfs(i);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int s = Integer.parseInt(st.nextToken());
		
		// default setting
		isVisited = new boolean[n+1];
		order = new int[n+1];
		
		list = new ArrayList[n+1];
		
		for(int i=1;i<n+1;i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		while(m-->0) {
			addList(br.readLine());
		}
		
		for(int i=1;i<n+1;i++) {
			Collections.sort(list[i]);
		}
		
		dfs(s);
		
		for(int i=1;i<n+1;i++) {
			bw.write(order[i]+"\n");
		}
		
		br.close();
		bw.close();
	}
}