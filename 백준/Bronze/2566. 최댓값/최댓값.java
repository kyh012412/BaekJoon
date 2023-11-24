import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max=-1;
		int row=-1;
		int col=-1;
		//실제 인덱스 값저장후 나중에 출력때 +1+1연산해서 뱉어버리기?
		try {
			for(int i=0;i<9;i++) {
				String temp = br.readLine();
				String temps[] = temp.split(" ");
				int idxcol=0;
				for(String a : temps) {
					int parsedint = Integer.parseInt(a);
					if(parsedint>max) {
						max=parsedint;
						row=i;
						col=idxcol;
					}
					idxcol++;
				}
			}
			
			bw.write(""+max);
			bw.newLine();
			bw.write(""+(row+1)+" "+(col+1));
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}