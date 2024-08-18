import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static boolean checkAble(String mainStr,boolean isable,String target) {
		if(!isable) return isable;
		
		return mainStr.contains(target);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String mainStr = br.readLine();
		
		boolean isable = true;

		isable = checkAble(mainStr, isable, "M");
		isable = checkAble(mainStr, isable, "O");
		isable = checkAble(mainStr, isable, "B");
		isable = checkAble(mainStr, isable, "I");
		isable = checkAble(mainStr, isable, "S");
		
		bw.write(isable ? "YES" : "NO");
		
		br.close();
		bw.close();
	}
}