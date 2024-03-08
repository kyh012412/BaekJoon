import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		Deque<Character> f = new LinkedList<>();
		Deque<Character> b = new LinkedList<>();
		for(int i=0;i<str.length();i++) {
			f.addLast(str.charAt(i));
		}
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String v[] = br.readLine().split(" ");
			switch(v[0]) {
			case "L":
				if(f.peekLast()!=null)
					b.addFirst(f.pollLast());
				break;
			case "D":
				if(b.peekFirst()!=null)
				f.addLast(b.pollFirst());
				break;
			case "B":
				if(f.peekLast()!=null)
				f.pollLast();
				break;
			case "P":
				f.addLast(v[1].charAt(0));
				break;
			}			
		}
		for(char c : f) {
			bw.write(c+"");
		}
		
		for(char c : b) {
			bw.write(c+"");
		}

		br.close();
		bw.close();
	}
}