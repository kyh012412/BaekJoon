
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static int n;
	static int m;
	static StringBuilder sb = new StringBuilder();
	public static void back2(int a) {
		if(list.size()==m) {
			sb.append(print());
			return;
		}
		for(int i=a;i<=n;i++) {
			list.add(i);
			back2(i+1);
			list.remove(list.size()-1);
		}
	}
	
	public static String print() {
		String towrite="";
		for(int i:list) {
			towrite+=i+" ";
		}
		towrite+="\n";
		
		return towrite;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[] = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		m = Integer.parseInt(v[1]);
		
		back2(1);
	
		bw.write(sb.toString());

		br.close();
		bw.close();
	}
}