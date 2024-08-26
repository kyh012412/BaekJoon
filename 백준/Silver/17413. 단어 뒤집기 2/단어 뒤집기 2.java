import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {	
	public static StringBuffer sb =new StringBuffer();
	public static StringBuffer temp = new StringBuffer();
	public static boolean straight =false;
	
	public static void pushStraight(char c) {
		sb.append(c);
	}
	
	public static void Turn() {
		if(temp.length()==0) return;
		sb.append(temp.reverse().toString());
		temp.setLength(0);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();		
		
		for(int i=0;i<str.length();i++) {
			char targetChar =  str.charAt(i);
			switch(targetChar) {
			case '<':
				Turn();
				straight=true;
				pushStraight(targetChar);
				break;
			case '>':
				straight=false;
				pushStraight(targetChar);
				break;
			case ' ':
				if(!straight) {
					Turn();
					sb.append(' ');
				}else {
					pushStraight(targetChar);
				}
				break;
			default:
				if(straight) {
					pushStraight(targetChar);
				}else {
					temp.append(targetChar);
				}
			}
		}
		Turn();
		
		bw.write(sb.toString());		
		
		br.close();
		bw.close();
	}
}