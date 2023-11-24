
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		int a = Integer.parseInt(br.readLine().split(" ")[0]);
		String v[] = br.readLine().split(" ");
		double a = Double.parseDouble(v[0]);

		for (int i = 0; i < a; i++) {
			if(i==0) {
				for(int j=0;j<a;j++) {
					bw.write("*");
				}
				for(int j=2*i;j<2*a-3;j++) {
					bw.write(" ");
				}
				for(int j=0;j<a;j++) {
					bw.write("*");
				}
			}else {
				for(int j=0;j<i;j++) {
					bw.write(" ");
				}
				for(int j=0;j<a;j++) {
					if(j==0 || j==a-1) {
						bw.write("*");
					}else {
						bw.write(" ");
					}
				}
				for(int j=2*i;j<2*a-3;j++) {
					bw.write(" ");
				}
				for(int j=0;j<a;j++) {
					if(j==0 || j==a-1) {
						if(j==0 && i==a-1) {
							
						}else {
							bw.write("*");
						}
					}else {
						bw.write(" ");
					}
				}
			}
			bw.newLine();
		}
		for (int i =(int) a-2; i >=0; i--) {
			if(i==0) {
				for(int j=0;j<a;j++) {
					bw.write("*");
				}
				for(int j=2*i;j<2*a-3;j++) {
					bw.write(" ");
				}
				for(int j=0;j<a;j++) {
					bw.write("*");
				}
			}else {
				for(int j=0;j<i;j++) {
					bw.write(" ");
				}
				for(int j=0;j<a;j++) {
					if(j==0 || j==a-1) {
						bw.write("*");
					}else {
						bw.write(" ");
					}
				}
				for(int j=2*i;j<2*a-3;j++) {
					bw.write(" ");
				}
				for(int j=0;j<a;j++) {
					if(j==0 || j==a-1) {
						if(j==0 && i==a-1) {
							
						}else {
							bw.write("*");
						}
					}else {
						bw.write(" ");
					}
				}
			}
			bw.newLine();
		}

		bw.close();
		br.close();
	}
}
