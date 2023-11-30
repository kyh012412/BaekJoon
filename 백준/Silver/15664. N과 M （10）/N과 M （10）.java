
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {

	static int n, m; 
	static int arr[];
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static LinkedHashSet<String> set = new LinkedHashSet<String>();
	static StringBuilder sb = new StringBuilder();
	
	static void back(int a) {
		if(list.size()==m) {
			print();
			return;
		}
		if(a>=n || list.size()>m) {
			return;
		}
		for(int i=a;i<n;i++) {
			list.add(arr[i]);
			back(i+1);
			list.remove(list.size()-1);
		}
	}
	
	static void print() {
		for(int i:list) {
			sb.append(i+" ");
		}
		sb.append("\n");
		
		set.add(sb.toString());
		sb.setLength(0);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		m = Integer.parseInt(v[1]);
		
		arr = new int[n];

		v = br.readLine().split(" ");
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(v[i]);
		}
		
		Arrays.sort(arr);
		
		back(0);
		
		for(String s:set) {
			sb.append(s);
		}
		
		bw.write(sb.toString());

		bw.close();
		br.close();
	}
}