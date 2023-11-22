
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
			String str = br.readLine();
			int N = Integer.parseInt(str.split(" ")[0]);
			int M = Integer.parseInt(str.split(" ")[1]);
			long P = Long.parseLong(str.split(" ")[2]);
			int a = 0;
			for(int i=0;i<N;i++) { //기지포문
				str = br.readLine();
				String v[] = str.split(" ");
				long p[] = new long[v.length];
				for(int j=0;j<v.length;j++) {
					p[j] = Integer.parseInt(v[j]);
				}
				Arrays.sort(p);
				floor:for(int j=0;j<M;j++) {//층포문
					if(p[j]==-1) { //템줍
						a++;
						if(j==M-1) {
							while(a!=0) {
								P*=2;
								a--;
							}
						}
						continue floor;
					}
					if(P>=p[j]) { //내가더 쌜때
						P+=p[j];
						if(j==M-1) {
							while(a!=0) {
								P*=2;
								a--;
							}
						}
						continue floor;
					}else { //내가약할때
						if(a!=0) { 
							while(a!=0) {
								P*=2;
								a--;
								if(P>=p[j]) { //약효율 굿
									break;
								}
							}
							if(P>=p[j]) { //템받고 이길때
								P+=p[j];
								if(j==M-1) {
									while(a!=0) {
										P*=2;
										a--;
									}
								}
								continue floor;
							}else { //템받고 질때
								bw.write("0");
								bw.flush();
								br.close();
								return;
							}							
						}else { //그냥인데 템도 없고 질때
							bw.write("0");
							bw.flush();
							br.close();
							return;
						}
					}
				}
			}
			bw.write("1");
			bw.flush();
			br.close();
			
		}catch(Exception e) {
			
		}
	}
}