
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static int n;
	static int num;
		
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			System.out.println("? "+1);
			System.out.flush();
			sb.append(sc.next());
			if(sb.charAt(0)=='Y') {
				break;
			}else {
				sb.setLength(0);
			}
		}
		System.out.println("! 1");
		System.out.flush();
	}
}