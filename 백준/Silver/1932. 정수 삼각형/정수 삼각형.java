import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int tc = Integer.parseInt(br.readLine());
			int a[][] = new int[tc][];
			for(int i=0;i<tc;i++) {
				a[i]=new int[i+1];
				String str = br.readLine();
				String v[] = str.split(" ");
				for(int j=0;j<a[i].length;j++) {
					a[i][j] = Integer.parseInt(v[j]);
					if(i!=0) {
						if(j==0) {
							a[i][j]+=a[i-1][j];
						}else if(j==a[i].length-1) {
							a[i][j]+=a[i-1][j-1];
						}else {
							a[i][j]+=Math.max(a[i-1][j], a[i-1][j-1]);
						}
					}
				}				
			}
			Arrays.sort(a[tc-1]);
			
			bw.write(""+a[tc-1][tc-1]);
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}