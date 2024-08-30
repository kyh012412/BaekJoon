import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {	
	public static boolean isVisited[];
	public static ArrayList<Integer>[] links;
	public static Queue<Integer> q = new LinkedList<Integer>();
	public static int order[];
	public static int index=1;
	
	public static void bfs(int bfsStart) {
		if(isVisited[bfsStart]) return;
		isVisited[bfsStart]=true;
		q.add(bfsStart);
		while(!q.isEmpty()) {
			int s = q.poll();
			order[s]=index++;
			for (int e : links[s]) {
				if(!isVisited[e]) {
					isVisited[e]=true;
					q.add(e);
				}				
			}
		}
	}
	
	public static void makeLink(String str) {
		StringTokenizer st = new StringTokenizer(str);
		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		links[s].add(e);
		links[e].add(s);
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		// Set links Count
		links = new ArrayList[n+1]; // 0번은 사용하지 않음
		for(int i=1;i<n+1;i++) {
			links[i] = new ArrayList<Integer>();
		}
		
		// Set Default
		order = new int[n+1]; // 0번은 사용하지 않음
		isVisited = new boolean[n+1];
				
		// Set links
		while(m-->0) {
			makeLink(br.readLine());
		}
		
		// sort for asc order
		for(int i=1;i<n+1;i++) {
			Collections.sort(links[i]);
		}		
		
		bfs(s);
		
		// print
		for(int i=1;i<n+1;i++) {
			bw.write(order[i]+"\n");
		}
		
		br.close();
		bw.close();
	}
}