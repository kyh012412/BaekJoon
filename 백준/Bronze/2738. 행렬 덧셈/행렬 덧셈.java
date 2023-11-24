import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String rowscols = br.readLine();
			int rows = Integer.parseInt(rowscols.split(" ")[0]);
			int cols = Integer.parseInt(rowscols.split(" ")[1]);
			int Matrix[][] = new int[rows][cols];
			
			for(int j=0;j<2;j++) {
				for(int i=0;i<rows;i++) {
					String temp = br.readLine();
					String temps[] = temp.split(" ");
					int idxcol=0;
					for(String a:temps) {
						Matrix[i][idxcol++] += Integer.parseInt(a);
					}				
				}
			}
			
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					bw.write(Matrix[i][j]+" ");
				}
				bw.newLine();
			}
			bw.flush();
			br.close();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}