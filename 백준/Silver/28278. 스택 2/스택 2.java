import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {	
	
	public static Deque<String> st = new LinkedList<String>();
	
	public static void push(String str) {		
		st.addLast(str);
	}
	
	public static String pop() {
		return st.isEmpty() ? -1+"" : st.pollLast();
	}
	
	public static String size() {
		return st.size()+"";
	}
	
	public static String isEmpty() {
		return (st.size() == 0? 1: 0)+""; 
	}
	
	public static String peek() {
		return st.isEmpty() ? -1+"" : st.peekLast();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String str=null;
		while(n-->0) {
			str = br.readLine();
			switch(str) {
			case "2":
				bw.write(pop());
				break;
			case "3":
				bw.write(size());
				break;
			case "4":
				bw.write(isEmpty());
				break;
			case "5":
				bw.write(peek());
				break;
			default:
				push(str.split(" ")[1]);
				continue;
			}
			bw.write("\n");
		}		
		
		br.close();
		bw.close();
	}
}