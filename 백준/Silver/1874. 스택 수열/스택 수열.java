import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	static int n;
	static int arr[];//스택
	static int top = -1; //맨위 값이있는 인덱스, -1일경우 스택이빈상태
	static int count = 1; //받을 숫자의 번호
	static StringBuilder str = new StringBuilder("");
	static int popedcount = 0; //팝된숫자
	static Stack<Integer> s = new Stack<Integer>();


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
				
		outer:for(int i=0;i<n;i++) {
			int target = Integer.parseInt(br.readLine());
			while(true) {
				if(count<target) {
					int val = target-count;
					for(int j=0;j<val;j++) {
						s.push(count++);
						str.append("+\n");
					}
					s.push(count++);
					str.append("+\n");
					s.pop();
					str.append("-\n");
					continue outer;
				}else if(count>target) {
					if(s.peek()==target) {
						s.pop();
						str.append("-\n");
						continue outer;
					}else if(s.peek()!=target){
						str.setLength(0);
						str.append("NO");
						break outer;
					}
				}else if(count==target){
					s.push(count++);
					str.append("+\n");
					s.pop();
					str.append("-\n");
					continue outer;
				}
			}
		}
		
		bw.write(str.toString());
		
		bw.flush();
		br.close();
	}
}