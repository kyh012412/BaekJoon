
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	static String s;
	static String pn;
	static int idx=0;
	static int count=0;

	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("NLCS", "North London Collegiate School");
		map.put("BHA", "Branksome Hall Asia");
		map.put("KIS", "Korea International School");
		map.put("SJA", "St. Johnsbury Academy");
		
		bw.write(map.get(br.readLine()));		
			
		bw.close();
		br.close();
	}
}