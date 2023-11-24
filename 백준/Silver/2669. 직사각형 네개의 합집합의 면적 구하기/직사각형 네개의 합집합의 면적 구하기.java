
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	
	static boolean map[][];
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		String v[];
		map = new boolean[100][100];
		int count=0;
		for(int i=0;i<4;i++) {
			v = br.readLine().split(" ");
			int a[] = new int[v.length];
			for(int j=0;j<a.length;j++) {
				a[j] = Integer.parseInt(v[j]);
			}
			for(int r=a[0];r<a[2];r++) {
				for(int c=a[1];c<a[3];c++) {
					if(!map[r][c]) {
						map[r][c]=true;
						count++;
					}
				}
			}
		}
		bw.write(""+count);
		bw.close();
		br.close();
	}
}
