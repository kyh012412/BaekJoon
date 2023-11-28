
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static int n,k;
	static int arr[];
	static StringBuilder sb = new StringBuilder();
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static ArrayList<String> printl  = new ArrayList<String>();
	
	public static void back() {
		if(list.size()>k) {
			return;
		}
		if(list.size()==k) {
			addset();
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(list.isEmpty() || (list.get(list.size()-1)<arr[i])&&!list.contains(arr[i]) ){
				list.add(arr[i]);
				back();
				list.remove(list.size()-1);
			}
		}
	}
	
	public static void addset() {
		for(int i:list) {
			sb.append(i+" ");
		}
		sb.append("\n");
		printl.add(sb.toString());
		sb.setLength(0);
	}
	
	public static void setprint() {
		for(String i : printl) {
			sb.append(i);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		k = Integer.parseInt(v[1]);
		
		arr =new int[n];
		
		v = br.readLine().split(" ");
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(v[i]);
		}
		
		Arrays.sort(arr);
		
		back();
		setprint();
		
		bw.write(sb.toString());
		
		
		bw.close();
		br.close();
	}
}