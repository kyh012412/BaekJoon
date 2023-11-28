
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int n, k;
	static int arr[];
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static StringBuilder sb = new StringBuilder();
	
	public static void back() {
		if(list.size()>k) {
			return;
		}
		if(list.size()==k) {
			print();
			return;
		}
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
			back();
			list.remove(list.size()-1);
		}
	}
	
	public static void print() {
		for(int i:list) {
			sb.append(i+" ");
		}
		sb.append("\n");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i] =Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		back();
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
}
