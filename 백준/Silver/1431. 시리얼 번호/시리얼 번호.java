import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

class Guitar implements Comparable<Guitar>{
	String serialNum;
	int sumOnlyNums;
	
	@Override
	public int compareTo(Guitar o) {
		// 길이비교
		// 숫자합더하여 작은것가져오기
		// 사전순 (숫자가 알파벳보다 사전순으로이 작다)
		if(serialNum.length()!=o.serialNum.length())
			return serialNum.length()-o.serialNum.length();
		else if(sumOnlyNums!=o.sumOnlyNums)
			return sumOnlyNums-o.sumOnlyNums;
		else 
			return serialNum.compareTo(o.serialNum);
	}
	
	public Guitar(String str) {
		serialNum = str;
		for(int i=0;i<str.length();i++) {
			int val = str.charAt(i)-'0';
			if(val>=0 && val<=9) {
				sumOnlyNums+=val;
			}
		}
	}
}

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		ArrayList<Guitar> list = new ArrayList<Guitar>();	
		while(n-->0) {
			list.add(new Guitar(br.readLine()));
		}

		// 정렬후 출력
		Collections.sort(list);
		
		for(Guitar i:list) {
			bw.write(i.serialNum+"\n");
		}
		
		br.close();
		bw.close();
	}
}
