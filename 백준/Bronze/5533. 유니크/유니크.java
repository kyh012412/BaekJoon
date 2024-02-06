import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int a[][] = new int[3][n];
		ArrayList<Integer> list[] = new ArrayList[3];
		HashSet<Integer> set[] = new HashSet[3];
		for(int i=0;i<3;i++) {
			list[i]= new ArrayList<Integer>();
			set[i] = new HashSet<Integer>();
		}
		
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++) {
				int num=Integer.parseInt(st.nextToken());
				a[j][i]=num;
				if(list[j].contains(num)) 
					set[j].add(num);
				list[j].add(num);
			}
		}
		for(int i=0;i<3;i++) {
			for(int j:set[i]) {
				list[i].replaceAll(m->m==j?0:m);
			}
		}
		int ans[] = new int[n];
		for(int j=0;j<3;j++) {
			for(int i=0;i<n;i++) {
				ans[i] +=list[j].get(i);
				if(j==2) {
					bw.write(ans[i]+"\n");
				}
			}
		}
		
		br.close();
		bw.close();
	}
}
 