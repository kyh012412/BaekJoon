
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int l,c;
	static char carr[];
	static ArrayList<Character> list = new ArrayList<Character>();
	static StringBuilder sb = new StringBuilder();
	
	public static void back(int a) {
		if(list.size()>l ) {
			return;
		}
		if(list.size()==l) {
			setprint();
			return;
		}
		if(a>=carr.length) {
			return;
		}
		for(int i=a;i<carr.length;i++) {
			list.add(carr[i]);
			back(i+1);
			list.remove(list.size()-1);
		}
	}
	
	public static void setprint() {
		int count=0;//모음의 개수 세기
		if(list.contains('a')) {
			count++;
		}
		if(list.contains('e')) {
			count++;
		}
		if(list.contains('i')) {
			count++;
		}
		if(list.contains('o')) {
			count++;
		}
		if(list.contains('u')) {
			count++;
		}
		
		int countj=list.size()-count;//자음 개수세기
		
		if(count<1 || countj<2) {
			return;
		}
		
		for(char a : list) {
			sb.append(a);
		}
		sb.append("\n");
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()+" "+br.readLine());
		
		l = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		carr = new char[c];
		
		for(int i=0;i<c;i++) {
			carr[i] = st.nextToken().charAt(0);
		}
		
		Arrays.sort(carr);
		
		back(0);
				
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
}