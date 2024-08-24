import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	
	public static Deque<Character> stack = new LinkedList<Character>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str=null;
		
		outer : while(!(str=br.readLine()).equals(".")) {
			stack.clear();
			for(int i=0;i<str.length();i++) {
				switch(str.charAt(i)) {
				case '(':
				case '[':
					stack.addLast(str.charAt(i));
					break;
				case ')':
					if(stack.size()==0 || stack.pollLast()!='(') {
						bw.write("no\n");					
						continue outer;
					}else {
						break;
					}
					
				case ']':
					if(stack.size()==0 || stack.pollLast()!='[') {
						bw.write("no\n");
						continue outer;
					}else {
						break;
					}
				case '.':
					if(i!=0 && stack.size()==0) {
						bw.write("yes\n");
						continue outer;
					}else if(i!=0 && stack.size()!=0){
						bw.write("no\n");
						continue outer;
					}else {
						break outer;
					}
				}
			}
		}
		
		br.close();
		bw.close();
	}
}