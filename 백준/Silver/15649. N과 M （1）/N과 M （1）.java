
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	static int n;
	static int m;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static StringBuilder sb = new StringBuilder();
	
	public static void add() {
		if(list.size()>m) {
			return;
		}
		if(list.size()==m) {
			print();
			return;
		}
		for(int i=1;i<=n;i++) {
			if(!list.contains(i)) {
				list.add(i);
				add();
				list.remove(list.size()-1);
			}		
		}
	}
	
	public static void print() {
		for(int i : list) {
			sb.append(i+" ");
		}
		sb.append("\n");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v= br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		m = Integer.parseInt(v[1]);
		add();
		
		bw.write(sb.toString());
		
		bw.close();
		br.close();
	}
}