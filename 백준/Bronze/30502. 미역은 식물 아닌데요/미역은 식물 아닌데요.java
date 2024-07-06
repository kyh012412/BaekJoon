import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	static int n; 
	static int k; 
	static int arr[]; //총 n+1; 각 방형구당 꽃의종류
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		String v[];
		v= br.readLine().split(" ");
		n =Integer.parseInt(v[0]);
		k =Integer.parseInt(v[1]);
		boolean p[][] = new boolean[2][n+1];// 0번이 좋게쳐주는 경우
		boolean m[][] = new boolean[2][n+1];// 1번이 나쁘게 쳐주는경우
		//p는 true1이 좋은거 m은 false0이 좋은거
		Arrays.fill(p[0], true);
		Arrays.fill(m[0], false);
		Arrays.fill(p[1], false);
		Arrays.fill(m[1], true);
		
		for(int i=0;i<k;i++) {
			v = br.readLine().split(" ");
			int idx=Integer.parseInt(v[0]);
			if(v[1].equals("P")) {
				if(v[2].equals("1")) {
					p[0][idx]=true;
					p[1][idx]=true;
				}else {
					p[0][idx]=false;
					p[1][idx]=false;
				}
			}else {
				if(v[2].equals("1")) {
					m[0][idx]=true;
					m[1][idx]=true;
				}else {
					m[0][idx]=false;
					m[1][idx]=false;
				}
			}
		}
		int count;
		count=0;
		for(int i=1;i<=n;i++) {
			if(p[1][i] && !m[1][i]) {
				count++;
			}
		}
		bw.write(count+" ");
		
		count=0;
		for(int i=1;i<=n;i++) {
			if(p[0][i] && !m[0][i]) {
				count++;
			}
		}
		bw.write(count+"");
		
		bw.close();
		br.close();
	}
}