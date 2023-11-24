
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	static String sb;
	static String des;
	
	public static boolean bfs() {
		Queue<String> q = new LinkedList<String>();
		q.add(funa(sb));
		q.add(funb(sb));
		while(!q.isEmpty()) {
			String cur = q.poll();
			if(des.length()==cur.length()) {
				if(des.equals(cur)) {
					return true;
				}
			}else {
				q.add(funa(cur));
				q.add(funb(cur));
			}
		}
		
		return false;
	}
	
	public static boolean dfs() {
		Stack<String> s = new Stack<String>();
		s.add(funa(sb));
		s.add(funb(sb));
		while(!s.isEmpty()) {
			String cur = s.pop();
			if(des.length()==cur.length()) {
				if(des.toString().equals(cur.toString())) {
					return true;
				}
			}else {
				if(!des.contains(cur) && !des.contains(func(cur)))
					continue;
				s.add(funa(cur));
				s.add(funb(cur));
			}
		}
		
		return false;
	}
	
	public static String funa(String a) {
		return a+"A";
	}
	
	public static String funb(String a) {
		return new StringBuilder(a).reverse().append("B").toString();
	}
	
	public static String func(String a) {
		return new StringBuilder(a).reverse().toString();
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		sb = br.readLine();
		des = br.readLine(); 
		
		if(dfs()) {
			bw.write("1");
		}else {
			bw.write("0");
		}
		
		bw.close();
		br.close();
	}
}